package Lecturecode.ClassAndObjects;

public class Car {
    static int noOFcarSold;
    int noOfWheels;
    String colour;
    float maxSpeed;
    float currentFulesInLiters;
    int noOfSheets;

    static {
        System.out.println("this is  static block");
    }
    {
        System.out.println("this is int block");
    }

    Car(String colour){
       this. colour =colour;
        maxSpeed=200;
        currentFulesInLiters=5;
        noOfSheets=2;
         String logo ="BMW";
    }
    Car(){
         this("Black");
         currentFulesInLiters=2;
    }


    public Car start(){
        if(currentFulesInLiters == 0){
            System.out.println("car is out of fuel,car is not start");
        } else if (currentFulesInLiters<5) {
            System.out.println("car is in reserved mode , refuel it");

        }else{
            System.out.println("car is startes...buruhh.....");
        }
        return this;

    }

    public void drive(){
        currentFulesInLiters--;
        System.out.println("car is driving");
    }

    public   void addFuel(float currentFulesInLiters){
       this.currentFulesInLiters+= currentFulesInLiters;
    }
    public float getCurrentFulesLevel(){
        return currentFulesInLiters;
    }



}
