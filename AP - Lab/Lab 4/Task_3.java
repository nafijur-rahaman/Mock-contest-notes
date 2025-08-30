class LivingBeing{
    public void breath(){
        System.out.println("Breathing...");
    }
}

class Animal extends LivingBeing{
    public void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Barking...");
    }
}




public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Md. Nafijur Rahaman\n");
        Dog d1 = new Dog();
        d1.breath();
        d1.eat();
        d1.bark();
        System.out.println("\nId: 20234103116");
    }
}
