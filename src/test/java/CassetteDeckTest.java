import components.CassetteDeck;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CassetteDeckTest {


    CassetteDeck cassetteDeck;

    @Before
    public void before(){

        cassetteDeck = new CassetteDeck("Walkman", "Sony");
    }

    @Test
    public void hasModel() {
        assertEquals("Walkman", cassetteDeck.getModel());
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", cassetteDeck.getMake());
    }

    @Test
    public void canPlayTune(){
        assertEquals("Born to Run is playing", cassetteDeck.play("Born to Run"));
    }

    @Test
    public void canPauseTune(){
        assertEquals("Born to Run is paused", cassetteDeck.pause("Born to Run"));
    }


}
