package OOP;

public class dog extends Animal implements Pet{

   public void makeNoise(){
       System.out.println("Woof woof");
   }

   public void eat(){
       System.out.println(" I love treats");
   }

    @Override
    public void giveTreat() {
        System.out.println("Bone");
    }
}
