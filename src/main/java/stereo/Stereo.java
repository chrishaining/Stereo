package stereo;

import components.CassetteDeck;
import components.Component;
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

    public void addRadio(Radio radio) {
        this.radio = radio;
    }

    public String getRadioModel() {
        return this.radio.getModel();
    }

    public String playCassetteDeck(String song) {
        if (this.cassetteDeck != null) {
        return this.cassetteDeck.play(song);
        }
        return "Cassette Deck is not connected.";
    }

//    public String checkRadioWorks(String station) {
//        return this.radio.tune(station);
//    }
}
