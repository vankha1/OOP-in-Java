package AnotherBuilder;

public class Main {
    public static void main(String[] args) {
        House1Builder house1Builder = new House1Builder();
        Director director = new Director(house1Builder);

        director.constructHouse();
        House house = director.getHouse();

        System.out.println("Builder constructed: "+ house.toString());
    }
}
