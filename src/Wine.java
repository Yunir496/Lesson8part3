/*      Используя принципы ООП и язык Java, опишите класс Wine ,
        который в дальнейшем может быть применим при создании электронного каталога вин
        (сам электронный каталог вин вам пока реализовывать не нужно).
        Продумайте, какие поля и методы понадобятся классу Wine, для выполнения следующих функций:
        1. Хранение информации о виде вина: название, торговая марка, страна, дата разлива, многострочное примечание
        (может быть любое количество строк). 2. Доступ (установка и получение значений) к хранимой информации.
        3. Расчёт выдержки вина (текущая дата даётся как аргумент).
        Отдельно разработайте вспомогательный класс, который демонстрирует работоспособность вашего класса.*/

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Wine {
       private String name;
       private String trademark;
       private String country;
       private String dataOfBotting;
       private  String note;

  /*     public long calcexcerpt (String data) throws ParseException {
              SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
              Date date1 = null;
              Date date2 = null;
               date1 = format.parse(data);
               date2 = format.parse(dataOfBotting);

               long difference = date2.getTime()-date1.getTime();

              return difference / (24 * 60 * 60 * 1000);
       }*/
  public long calcexcerpt (String curDate) {

         SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
         Date date1 = null;
         Date date2 = null;
         try {
                date1 = format.parse(curDate);
                date2 = format.parse(dataOfBotting);
         } catch (java.text.ParseException e) {
                e.printStackTrace();
         }
      assert date2 != null;
        
      long difference = Math.abs(date1.getTime() - date2.getTime());

      long diff = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
      //long days =  difference / (24 * 60 * 60 * 1000);
         return diff;
  }
       public Wine(String name, String trademark, String country, String dataOfBotting, String note) {
              this.name = name;
              this.trademark = trademark;
              this.country = country;
              this.dataOfBotting = dataOfBotting;
              this.note = note;
       }

       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public String getTrademark() {
              return trademark;
       }

       public void setTrademark(String trademark) {
              this.trademark = trademark;
       }

       public String getCountry() {
              return country;
       }

       public void setCountry(String country) {
              this.country = country;
       }

       public String getDataOfBotting() {
              return dataOfBotting;
       }

       public void setDataOfBotting(String dataOfBotting) {
              this.dataOfBotting = dataOfBotting;
       }

       public String getNote() {
              return note;
       }

       public void setNote(String note) {
              this.note = note;
       }
}
