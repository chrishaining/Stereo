package components;

public class Radio extends Component {

    public Radio(String model, String make) {
        super(model, make);
    }

    public String tune(String station) {
    return "You are tuned into " + station;
    }
}
