package BuilderDesignPattern.model;

public class CarSchemeBuilder implements Builder{
    private int id;
    private int height;
    private String brand;
    private String model;
    private String color;
    private String engine;
    private int nbrOfDoors;

    @Override
    public CarSchemeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public CarSchemeBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarSchemeBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarSchemeBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarSchemeBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    @Override
    public CarSchemeBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarSchemeBuilder setNbrOfDoors(int nbrOfDoors) {
        this.nbrOfDoors = nbrOfDoors;
        return this;
    }

    public CarScheme build() {
        return new CarScheme(id, brand, model, color, height, engine, nbrOfDoors);
    }
}
