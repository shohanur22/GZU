//Mammal, test, Dog, Pig
//ex 13.2 from book

import java.util.ArrayList;
//import java.util.Collection;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        //Mammal amamal = new Mammal();

        Dog adog1 = new Dog("Bob", 3.4);
        Dog adog2 = new Dog("Tomy", 3.5);
        Dog adog3 = new Dog("Jacky", 1.8);

        Pig piko = new Pig("Piko", 2.5);

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(adog1);
        dogs.add(adog2);
        dogs.add(adog3);

        Collections.sort(dogs);//sort 
        for(int i=0; i<3; i++){
            //System.out.println(dogs.get(i));
        }



        try{
            //tom.Eat(3.5);
            adog1.Eat(0.2);
            piko.Eat(0.3);
            piko.makeSound();
        }catch(WrongFoodException ex){
            System.out.println(ex.getMessage());
        }finally{
            System.out.println("Current Weight: "+adog1.getWeight() +" kg. ");

            if(adog1.compareTo(adog2)>0){
                System.out.println("Tom weight > Tom2 weight");

            }else{
                System.out.println("Tom2 weight > Tom weight");

            }
        }
    }
}

