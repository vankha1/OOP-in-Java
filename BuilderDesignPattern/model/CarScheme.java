package BuilderDesignPattern.model;

public class CarScheme {
    private int id;
    private int height;
    private String brand;
    private String model;
    private String color;
    private String engine;
    private int nbrOfDoors;

    CarScheme (int id, String brand, String model, String color, int height, String engine, int nbrOfDoors) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.height = height;
        this.engine = engine;
        this.nbrOfDoors = nbrOfDoors;
    }

    @Override
    public String toString() {
        return """
                CarSchema {
                    id=%s,
                    height=%s,
                    brand=%s,
                    model=%s,
                    color=%s,
                    engine=%s,
                    nbrOfDoors=%s
                }""".formatted(id, height, brand, model, color, engine, nbrOfDoors);
    }

}
