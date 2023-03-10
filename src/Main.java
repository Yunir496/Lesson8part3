import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {

        Wine wine = new Wine("Киндзмараули","Дом Грузии","Грузия","15/02/2000","Обьем 0.7л");

        String name = wine.getName();
        String trademark = wine.getTrademark();
        String country = wine.getCountry();
        String dataOfBotting = wine.getDataOfBotting();
        String note = wine.getNote();

        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setTimeZone(TimeZone.getTimeZone("EAT"));
        String data = dateFormat.format(date);

        //long days = wine.calcexcerpt(data);

        LocalDate date1 = LocalDate.of(2000,2,15);
        LocalDate date2 = LocalDate.now();
        Period period = Period.between(date1,date2);
        int years = period.getYears();
        //System.out.println(years);

        System.out.println(name);
        System.out.println(trademark);
        System.out.println(country);
        System.out.println(dataOfBotting);
        System.out.println(note);
        System.out.println("Выдержка "+ years +" года");
    }
}
