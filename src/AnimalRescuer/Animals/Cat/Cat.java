package AnimalRescuer.Animals.Cat;

import AnimalRescuer.Animals.Animals;

public class Cat extends Animals {

    public void sleep(){
        System.out.println("zzzZZZ");
    }
    public void run(){
        System.out.println("Runing ");
    }
    public void play(){
        System.out.println("playing");
    }

    public void speak(){
        System.out.println("Miau");}

    @Override
    public void eat() {
        System.out.println("eat cat food");
    }
}
