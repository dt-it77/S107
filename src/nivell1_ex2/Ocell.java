package nivell1_ex2;


public class Ocell extends Animal {

    @Override
    public String EsMou(){
        return "L'ocell es mou amb les ales volant";
    }

    /**
     * @deprecated
     * Deperectaed en favor de EsMou
     */
    @Deprecated
    public String desplaçar() {
        return "L'ocell es desplaça amb les ales volant";
    }
}
