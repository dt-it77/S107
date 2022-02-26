package nivell1_ex2;

public class Gos extends Animal {

    @Override
    public String EsMou(){
        return "El gos es mou amb les camas corrent";
    }

    /**
     * @deprecated
     * Deperectaed en favor de EsMou
     */
    @Deprecated
    public String corre() {
        return "El gos corre";
    }
}
