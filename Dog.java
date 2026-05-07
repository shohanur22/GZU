

class Dog extends Mammal implements Comparable<Dog>{

    public Dog(){
        super();
    }

    public Dog(String initName, double initWeight){
        super(initName, initWeight);
    }
    

    @Override
    public void makeSound(){
        System.out.println("The dog "+ this.name+" barks...");
    }

    public void Eat(double meal)throws WrongFoodException{
        if(meal<0 || meal >0.8*this.weight){
            throw new WrongFoodException();
        }
        this.weight += meal;

    }

    public String toString(){
        return("The dog:: "+this.name+" weights "+this.weight+" kg.");
    }

    public void Run(){

    }

    //Comparible
    public int compareTo(Dog oDog){
        return ((String)this.name).compareTo(oDog.name); //sort according to name 
    }
    
}
