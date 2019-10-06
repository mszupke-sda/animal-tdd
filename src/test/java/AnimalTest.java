import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    @Test
    void testCzyZwierzePotrafiLatac() {
        UmiejetnoscLatania golab = Zwierze.golab();
        assertTrue(golab.czyPotrafiLatac());

        UmiejetnoscLatania pingwin = Zwierze.pingwin();
        assertFalse(pingwin.czyPotrafiLatac());
    }
}
