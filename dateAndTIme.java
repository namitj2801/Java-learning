import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateAndTIme {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);


        LocalDate date1 = LocalDate.of(2025, 12 , 25);
        System.out.println(date1);
        LocalDateTime dateTime2 = LocalDateTime.of(2025,12,25,12,0,0);
        System.out.println(dateTime2);
    }
}
