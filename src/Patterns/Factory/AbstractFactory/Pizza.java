package Patterns.Factory.AbstractFactory;

abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies [] veggies;
    Cheese cheese;

    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in office PizzaStore box");
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    public String toString(){
        return "I am "+ name+" Pizza";
    }


}
