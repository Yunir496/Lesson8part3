import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) throws ParseException {

        Wine wine = new Wine("Киндзмараули","Дом Грузии","Грузия",
                LocalDate.of(2000, Month.FEBRUARY, 15),"Обьем 0.7л");

        String name = wine.getName();
        String trademark = wine.getTrademark();
        String country = wine.getCountry();
        LocalDate dataOfBotting = wine.getDataOfBotting();
        String note = wine.getNote();

        System.out.println(name);
        System.out.println(trademark);
        System.out.println(country);
        System.out.println(dataOfBotting);
        System.out.println(note);
        System.out.println("Выдержка "+ wine.calcExcerpt() +" года");
    }
}