public class Animal {
    String name;

    public void eat() {
        System.out.println("I can eat");
    }
}
    //inherit from animal
    class Dog extends Animal{
        //new method in subclass
        public void display(){
            System.out.println("My name"+name);
        }
    }

class Main1{
    public static void main(String[] args) {
        //create an object of the subclass
        Dog d=new Dog();
        //acess field of superclass
        d.name="Rohu";
        d.display();
        d.eat();

    }
}
