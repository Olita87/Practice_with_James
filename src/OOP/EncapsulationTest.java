package OOP;

public class EncapsulationTest {
    public int Pint = 0;
    static int Sint = 0;
    private static int Vint = 0;

    public int getVint() {
        return Vint;
    }

    public void setVint(int vint) {
        if(Vint>0){
            Vint = vint;
        }

    }
}
