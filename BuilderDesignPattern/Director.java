package BuilderDesignPattern;

import BuilderDesignPattern.model.Builder;

public class Director{
    public void buildCar(Builder builder) {
        builder.setId('1')
            .setBrand("BMW")
            .setModel("X5")
            .setEngine("3.6L V6")
            .setColor("Red");
    }

    public void buildCarScheme(Builder builder) {
        builder.setId('2')
           .setBrand("VINFAST")
           .setHeight(2)
           .setModel("K1")
           .setColor("Blue")
           .setNbrOfDoors(3);
    }
}

