package AnotherBuilder;

public interface HouseBuilder {
    public void buildBasement(String basement);
  
    public void buildStructure(String structure);
  
    public void buildRoof(String roof);
  
    public void buildInterior(String interior);
  
    public House getHouse();
}
