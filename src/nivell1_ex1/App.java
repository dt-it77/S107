package nivell1_ex1;


public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();
        System.out.println(animal.EsMou());

        Gos gos = new Gos();
        System.out.println(gos.EsMou());

        Ocell ocell = new Ocell();
        System.out.println(ocell.EsMou());
    }
}
