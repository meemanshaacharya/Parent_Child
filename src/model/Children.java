package model;

import java.util.ArrayList;

public class Children extends Parent{
    public String name;
    int grade;
    int age;
    ArrayList<Hobby> Hobby;

    public Children(String family_name, String name, int grade, int age, ArrayList<model.Hobby> hobby) {
        super(family_name);
        this.name = name;
        this.grade = grade;
        this.age = age;
        Hobby = hobby;
    }
    public void format(){
        String name="Your name is"+" "+ this.name+" "+this.family_name;
        System.out.println(name);
        for (Hobby i : Hobby){
            System.out.print("Your hobby is "+i);
        }
    }
}
