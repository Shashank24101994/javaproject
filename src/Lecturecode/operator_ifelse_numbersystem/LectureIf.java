package Lecturecode.operator_ifelse_numbersystem;

public class LectureIf
{
    public static void main(String[] args) {
        int age =25;
        if(age>18){
            System.out.println("Voter is Eligible For Voting: ");
        } else {
            System.out.println("Voter is not Eligible for voting");
        }

        boolean isMale = true;
        String name = "Bob";

        System.out.println("before if");
        if (isMale) {
            System.out.println("Mr." + name);
        } else {
            System.out.println("Ms." + name);
        }
        System.out.println("after if");

        boolean isSeniorCitizen = false;
        boolean isAnAdult = true;

        if (isSeniorCitizen) {
            System.out.println("Hello Senior Citizen");
        } else if (isAnAdult) {
            System.out.println("Hello Adult");
        } else {
            System.out.println("Hello Child");
        }
    }
}
