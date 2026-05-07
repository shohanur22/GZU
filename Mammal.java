interface IMammal {
    
    public abstract void Eat(double meal) throws WrongFoodException;
    public abstract String toString();
    //public abstract void Run();
    
}



abstract class Mammal implements IMammal{

    protected String name;
    protected double weight;

    public Mammal(){}
    public Mammal(String initName, double initWeight){

        this.name = initName;
        this.weight = initWeight;
    }

    public double getWeight(){
        return this.weight;
    }

    public abstract void makeSound();
    //uncomment if interface dont have the below method
    //public abstract void Eat(double meal) throws WrongFoodException;

    
}
