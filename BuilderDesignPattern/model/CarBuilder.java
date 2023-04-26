package BuilderDesignPattern.model;

public class CarBuilder implements Builder {
    private int id;
    private int height;
    private String brand;
    private String model;
    private String color;
    private String engine;
    private int nbrOfDoors;

    @Override
    public CarBuilder setId (int id){
        this.id = id;
        return this;
    }
    @Override
    public CarBuilder setHeight (int height){
        this.height = height;
        return this;
    }
    @Override
    public CarBuilder setBrand (String brand){
        this.brand = brand;
        return this;
    }
    @Override
    public CarBuilder setModel (String model){
        this.model = model;
        return this;
    }
    @Override
    public CarBuilder setColor (String color){
        this.color = color;
        return this;
    }
    @Override
    public CarBuilder setEngine (String engine){
        this.engine = engine;
        return this;
    }
    public CarBuilder setNbrOfDoors (int nbrOfDoors){
        this.nbrOfDoors = nbrOfDoors;
        return this;
    }
    
    public Car build(){
        return new Car (id, brand, model, color, height, engine, nbrOfDoors);
    }
}
