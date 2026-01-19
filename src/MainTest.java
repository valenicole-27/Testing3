import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MainTest {

    @Test
    void testCreazioneOffsetDateTime() {
        OffsetDateTime data = Main.creaData();
        assertNotNull(data);
    }

    @Test
    void testFormattazioneData() {
        OffsetDateTime data = Main.creaData();
        String risultato = Main.formattaData(data);

        assertEquals("01 marzo 2023", risultato);
    }
}