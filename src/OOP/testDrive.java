package OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class testDrive {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.makeNoise();
        lion.sleep();
        lion.testing();
        cat cat = new cat();
        cat.eat();
        cat.makeNoise();
        cat.sleep();
        dog dog = new dog();
        dog.eat();
        dog.makeNoise();
        dog.sleep();
        dog.pet();
        dog.giveTreat();

        EncapsulationTest Test = new EncapsulationTest();
        Test.setVint(-2);
        EncapsulationTest Test2= new EncapsulationTest();
        System.out.println(Test2.getVint());
        Animal Lion2= new Lion();
        Animal dog2= new dog();
        Animal cat2 = new cat();
        Animal [] Animals = new Animal[3];
        Animals[0]= Lion2;
        Animals[1]= dog2;
        Animals[2]= cat2;

        ArrayList<Animal> Poly = new ArrayList<>(Arrays.asList(lion,dog,cat));

        for (int i = 0; i < Poly.size(); i++) {
            System.out.println(Poly.get(i).getClass());


        }

        testTwo(Lion2);




        }
        public static void testTwo(Animal test){
            System.out.println(test.getClass());

    }
}



