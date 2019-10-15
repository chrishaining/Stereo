package components;

import behaviours.IPlay;

public class CassetteDeck extends Component implements IPlay {

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
