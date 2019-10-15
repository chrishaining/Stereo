package components;

import behaviours.IControlSongs;

public class CassetteDeck extends Component implements IControlSongs {

    public CassetteDeck(String model, String make) {
        super(model, make);
    }

    public String play(String SongName){
        return SongName + " is playing";
    }

    public String pause(String SongName){
        return SongName + " is paused";
    }

}
