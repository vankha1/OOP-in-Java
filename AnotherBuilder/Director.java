package AnotherBuilder;

public class Director {
    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public House getHouse(){
        return houseBuilder.getHouse();
    }

    public void constructHouse(){
        houseBuilder.buildBasement("Van kha");
        houseBuilder.buildStructure("fas");
        houseBuilder.buildRoof("circle");
        houseBuilder.buildInterior("2");
    }
}
