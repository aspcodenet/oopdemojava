package se.systementor;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {




        // b blir ett OBJEKT ("riktigt hus" som är SKAPAT från ritningen "Bil")
        // OBJEKT skapar vi genom NEW

        // Bil b = new Bil();  // SKAPA UPP EN INSTANS AV KLASSEN
                                // instansierat Bilklassen?
                                 // SKAPA UPP ETT OBJEKT AV KLASSEN
                                 // instans = objekt
        // b.setRegno("AAA111");
        // b.setYear(2016);
        // b.setModell("Volvo");

        // Bil c = new Bil();
        // c.setRegno("BBB111");
        // c.setYear(1973);
        // c.setModell("Saab");



        var bilRegister = new BilRegister();
        bilRegister.run();
    }
}
