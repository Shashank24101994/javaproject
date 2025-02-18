package Lecturecode.ClassAndObjects;

public class Driver
{
   static String name;
    String AllowedForDriving;
    int ageofdriver=25;
    public static void main(String[] args) {
//     Car mycar = new Car();
//     mycar.addFuel(6);
//     mycar.drive();
//     mycar.drive();
//     mycar.drive();
//     mycar.addFuel(4);
//     mycar.drive();
//     System.out.println(mycar.getCurrentFulesLevel());

        Car swift = new Car("RED");
        Car thar = new Car();
      //  swift.addFuel(6);

        swift.start().drive();
        System.out.println(swift.colour);
//        System.out.println(swift.noOfSheets);
        System.out.println(thar.colour);


    }

}
