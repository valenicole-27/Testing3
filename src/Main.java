import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static OffsetDateTime creaData() {
        return OffsetDateTime.parse("2023-03-01T13:00:00Z");
    }

    public static String formattaData(OffsetDateTime data) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY);
        return data.format(formatter);
    }

    public static void main(String[] args) {
        OffsetDateTime data = creaData();
        String dataFormattata = formattaData(data);

        System.out.println(dataFormattata);
    }
}