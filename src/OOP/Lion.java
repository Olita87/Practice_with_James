package OOP;

public class Lion extends Animal{

    @Override
    void eat() {
        System.out.println("Yum this chicken is awesome");
    }

    @Override
    void makeNoise() {
        System.out.println("Rarr");

    }

    public void testing(){
        Animal.test();
        System.out.println("Extra");
    }
}
