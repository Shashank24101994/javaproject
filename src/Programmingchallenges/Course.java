package Programmingchallenges;

public class Course
{
    static int maxCapacity=100;
    String courseName;
    int enrollments;

    String [] enrollstudens= new String[maxCapacity];

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity=maxCapacity;
    }
}
