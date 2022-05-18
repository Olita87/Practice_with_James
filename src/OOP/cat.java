package OOP;

public class cat extends Animal implements Pet {


    @Override
    void eat() {
        System.out.println("Yummy I love tuna");
    }

    @Override
    void makeNoise() {
        System.out.println("Meow");

    }

    @Override
    public void giveTreat() {
        System.out.println("catnip");
    }
}
