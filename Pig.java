public class Pig extends Mammal {

    public Pig(){
        super();
    }

    public Pig(String initName, double initWeight){
        super(initName, initWeight);
    }
    

    @Override
    public void makeSound(){
        System.out.println("The pig "+ this.name+" making sound");
    }

    public void Eat(double meal)throws WrongFoodException{
        if(meal<0 || meal >0.2*this.weight){
            throw new WrongFoodException();
        }
        this.weight += meal;

        System.out.println("Current Weight: "+this.weight +" kg. ");
    }
}
