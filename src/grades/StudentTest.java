package grades;

public class StudentTest {
    public static void main(String[] args){
        //New Student
        Student zach = new Student("Zach");
        // Add grades
        zach.addGrade(70);
        zach.addGrade(90);
        //Check to see if average is working, expect 80
        System.out.println(zach.getGradeAverage());
        //Check to see if name get works
        System.out.println(zach.getName());
    }
}
