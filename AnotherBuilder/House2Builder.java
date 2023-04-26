package AnotherBuilder;

public class House2Builder implements HouseBuilder{
    private House house;
  
    public House2Builder() {
        this.house = new House();
    }
  
    @Override
    public void buildBasement(String basement){
        house.setBasement(basement);
    }

    @Override
    public void buildStructure(String structure){
        house.setStructure(structure);
    }

    @Override
    public void buildInterior(String interior){
        house.setInterior(interior);
    }
  
    @Override
    public void buildRoof(String roof) 
    {
        house.setRoof(roof);
    }
  
    @Override
    public House getHouse() {
        return this.house;
    }
}
