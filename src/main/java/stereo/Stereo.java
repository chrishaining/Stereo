package stereo;

import components.CassetteDeck;
import components.Radio;

public class Stereo {

    private String name;
    private CassetteDeck cassetteDeck;
    private Radio radio;
//    private String model;
//    private String make;

    public Stereo(String name, CassetteDeck cassetteDeck, Radio radio) {
        this.name = name;
//        this.cassetteDeck = new CassetteDeck(model, make);
//        this.radio = new Radio(String model, String make);
    }

    public String getName() {
        return name;
    }

        public void addCassetteDeck(CassetteDeck cassetteDeck) {
     this.cassetteDeck = cassetteDeck;
    }

    public String getCassetteDeckModel() {
        return this.cassetteDeck.getModel();
    }
}
