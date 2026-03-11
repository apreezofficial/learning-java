import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Date {
public static void main(String[] a){
    DateTimeFormatter normtime = DateTimeFormatter.ofPattern("E, dd-MMM-yy");
    LocalTime timenow = LocalTime.now();
    LocalDateTime datetimenow = LocalDateTime.now();
    LocalDate date = LocalDate.now();
    System.out.println(timenow);
    System.out.println(datetimenow.format(normtime));
    System.out.println(date);
}
}
