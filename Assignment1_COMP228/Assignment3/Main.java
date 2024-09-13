import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Singer singer1 = new Singer();
        System.out.println("\nDefault Singer Info:");
        singer1.displaySingerInfo();
        Singer singer2 = new Singer(101, "Harish Kumar", "129 rose road",new Date(1990, Calendar.JUNE, 15),23);
        System.out.println("\nUpdated Singer Info:");
        singer2.displaySingerInfo();
    }
}

