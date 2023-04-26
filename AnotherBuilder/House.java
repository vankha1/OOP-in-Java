package AnotherBuilder;

public class House {
    private String basement;
    private String structure;
    private String roof;
    private String interior;


    public String getBasement() {
        return this.basement;
    }

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public String getStructure() {
        return this.structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getRoof() {
        return this.roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getInterior() {
        return this.interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }
    


    @Override
    public String toString() {
        return "{" +
            " basement='" + getBasement() + "'" +
            ", structure='" + getStructure() + "'" +
            ", roof='" + getRoof() + "'" +
            ", interior='" + getInterior() + "'" +
            "}";
    }
    
}
