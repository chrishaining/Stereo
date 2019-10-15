import components.Radio;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio("R2D2", "Finlux");
    }

    @Test
    public void hasModel() {
        assertEquals("R2D2", radio.getModel());
    }

    @Test
    public void hasMake() {
        assertEquals("Finlux", radio.getMake());
    }

    @Test
    public void canTune() {
        assertEquals("You are tuned into Radio CodeClan", radio.tune("Radio CodeClan"));
    }
}
