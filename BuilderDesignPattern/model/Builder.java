package BuilderDesignPattern.model;

public interface Builder {
    Builder setId(int id);
    Builder setHeight(int height);
    Builder setBrand(String brand);
    Builder setModel(String model);
    Builder setColor(String Color);
    Builder setEngine(String Engine);
    Builder setNbrOfDoors(int NbrOfDoors);
}
