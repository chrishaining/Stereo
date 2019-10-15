package components;

public abstract class Component {

    private String model;
    private String make;

    public Component(String model, String make) {
        this.model = model;
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }
}
