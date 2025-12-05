import java.util.*;
class Person
{ 
    int age;
    String name;

    public Person()
    {
        this.name = "Janvi";
        this.age = 18;
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

 
    public void display()
    {
        System.out.println("Name: " + name + " Age: " + age);
    }

    public static void main(String args[])
    {
        Person p1 = new Person();//default
        Person p2 = new Person("Gupta", 18);//parameterized
        
        p1.display();
        p2.display();
    }
}
