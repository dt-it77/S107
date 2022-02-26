package nivell1_ex2;


public class App {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();
        System.out.println(animal.EsMou());

        Gos gos = new Gos();
        System.out.println(gos.corre());

        Ocell ocell = new Ocell();
        System.out.println(ocell.desplaçar());
    }
}
