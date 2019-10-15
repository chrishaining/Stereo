import components.CassetteDeck;
import components.Radio;
import stereo.Stereo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class StereoTest {

    Stereo stereo;
    CassetteDeck cassetteDeck;
    Radio radio;

    @Before
    public void before() {
        radio = new Radio("R2D2", "Finlux");
        cassetteDeck = new CassetteDeck("Walkman", "Sony");
        stereo = new Stereo("Funmachine", cassetteDeck, radio);
    }

    @Test
    public void hasName() {
        assertEquals("Funmachine", stereo.getName());
    }

    @Test
    public void canAddCassetteDeck() {
        stereo.addCassetteDeck(cassetteDeck);
        assertEquals("Walkman", stereo.getCassetteDeckModel());
    }

    @Test
    public void canAddRadioDeck() {
        stereo.addRadio(radio);
        assertEquals("R2D2", stereo.getRadioModel());
    }

    @Test
    public void canPlayCassetteDeck() {
        stereo.addCassetteDeck(cassetteDeck);
        assertEquals("Born to Run is playing", stereo.playCassetteDeck("Born to Run"));
    }

}
