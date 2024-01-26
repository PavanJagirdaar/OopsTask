/*create a class person with properties(name and age) with following features. 
a)default age of person should be 18.
b)A person object can be initialized  with name and age. 
c)method to display the name and age of a person.*/ 
package oopstask;

public class Person {
    private String name;
    private int age;

   
    public Person(String name) {
        this.name = name;
        this.age = 18;
    }

   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

  
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

   
    public static void main(String[] args) {
        
        Person person1 = new Person("John");
        person1.displayInfo();

        
        Person person2 = new Person("Alice", 25);
        person2.displayInfo();
    }
}

