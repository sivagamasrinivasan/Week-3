/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentprint;

/**
 * today fetch and merge hello check
 * today fetch and merge hello test
 * @author sivagamasrinivasan
 */
public class Student {
    private String name;
    private int age;
    private int seno;

   public Student(String n, int a)
   {
       this.name=n;
       this.age=a;
   }
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
}
