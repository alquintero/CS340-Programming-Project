package cs340.programming.project;

import java.util.ArrayList;

public class Student {
    //data fields
    private int studentID;
    private ArrayList<Integer> preferencesList;
    private ArrayList<Class> enrolledClassList;

    public Student(int studentID, ArrayList<Integer> preferencesList)
    {
        this.studentID = studentID;
        this.preferencesList = preferencesList;
        this.enrolledClassList = new ArrayList<Class>();
    }

    //getter methods
    public int getStudentID()
    {
        return this.studentID;
    }

    public ArrayList<Integer> getPreferencesList()
    {
        return this.preferencesList;
    }

    public ArrayList<Class> getEnrolledClassList()
    {
        return this.enrolledClassList;
    }

    //setter methods
    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    public void setPreferencesList(ArrayList<Integer> preferencesList)
    {
        this.preferencesList = preferencesList;
    }

    public void setEnrolledClassList(ArrayList<Class> enrolledClassList)
    {
        this.enrolledClassList = enrolledClassList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID:" + studentID +
                ", preferencesList:" + CS340ProgrammingProject.printArray(preferencesList.toArray()) +
                ", enrolledClassList:" + CS340ProgrammingProject.printArray(enrolledClassList.toArray()) +
                '}';
    }
}
