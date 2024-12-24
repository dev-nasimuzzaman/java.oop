//superclass or parent class
class Animal{
    void eat(){
        System.out.println("Eats food");
    }
    void sleep(){
        System.out.println("This animal is sleeping nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }
}
//subclass or child class
class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks");
    }
}
public class Inheritance_program {
    public static void main(String[] args){
        //create an instance or object from parent / super class
        Animal myObj = new Animal();
        myObj.eat();
        myObj.sleep();

        //creating child class instance
        Dog myObj1 = new Dog();
        myObj1.bark(); //child class method
        myObj1.eat(); //parent class method
        myObj.sleep(); //parent class method
    }

}
