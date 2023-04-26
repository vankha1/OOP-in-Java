package BuilderDesignPattern;
import BuilderDesignPattern.model.*;


public class MainApp {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        Director director = new Director();
        director.buildCar(carBuilder);
        carBuilder.setHeight(1);
        Car car = carBuilder.build();
        System.out.println(car.toString()); 

        CarSchemeBuilder carSchemeBuilder = new CarSchemeBuilder();
        director.buildCarScheme(carSchemeBuilder);
        CarScheme carScheme = carSchemeBuilder.build();
        carScheme.toString();
        System.out.println(carScheme.toString()); 
    }
}
