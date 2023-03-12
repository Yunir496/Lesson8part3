/*      Используя принципы ООП и язык Java, опишите класс Wine ,
        который в дальнейшем может быть применим при создании электронного каталога вин
        (сам электронный каталог вин вам пока реализовывать не нужно).
        Продумайте, какие поля и методы понадобятся классу Wine, для выполнения следующих функций:
        1. Хранение информации о виде вина: название, торговая марка, страна, дата разлива, многострочное примечание
        (может быть любое количество строк). 2. Доступ (установка и получение значений) к хранимой информации.
        3. Расчёт выдержки вина (текущая дата даётся как аргумент).
        Отдельно разработайте вспомогательный класс, который демонстрирует работоспособность вашего класса.*/

import java.time.LocalDate;
import java.time.Period;

public class Wine {
       private String name;
       private String trademark;
       private String country;
       private LocalDate dataOfBotting;
       private  String note;

        public int calcExcerpt(){
            LocalDate date2 = LocalDate.now();
            Period period = Period.between(dataOfBotting,date2);
            return  period.getYears();
        }

    public Wine(String name, String trademark, String country, LocalDate dataOfBotting, String note) {
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

    public LocalDate getDataOfBotting() {
        return dataOfBotting;
    }

    public void setDataOfBotting(LocalDate dataOfBotting) {
        this.dataOfBotting = dataOfBotting;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
