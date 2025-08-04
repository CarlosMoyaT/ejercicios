package daysjavacode;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Day2 {
    // Formatting a LocalDateTime object.

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2025, 8, 4);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd");

        String formatDate = date1.format(formatter);

        System.out.println(formatDate);

    }
}
