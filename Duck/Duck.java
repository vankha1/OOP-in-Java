public abstract class Duck {
    protected String name;
    public Duck(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void quack(String name){
        System.out.println("Duck quack!");
    }

    public void swim(String name){
        System.out.println("Duck swim!");
    }
   
    public abstract void display(String name);
}
