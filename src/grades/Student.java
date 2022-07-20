package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    Student(String name){
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public ArrayList<Integer> getAllGrades(){
        return this.grades;
    }

    public double getGradeAverage(){
        double counter = 0;
        for (int i = 0; i < grades.size(); i++) {
            counter += grades.get(i);
        }
        return counter / grades.size();
    }
}
