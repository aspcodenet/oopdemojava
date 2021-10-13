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


        
            int slumpa = (int)(3*Math.random() + 1);
            String datornsVal;
    
            if (slumpa == 1) {
                datornsVal = "Sten";
            }
            else if ( slumpa == 2) {
                datornsVal = "Sax";
            } 
            else {
                datornsVal = "Påse";
            }
    
            System.out.print( "Ange sten, sax eller påse: " );
            String input = (System.console().readLine());
    
            switch (input.toLowerCase()) {
                case "sten":
                    if ( datornsVal.equals( "Sax" )) {
                        System.out.println( "Du vann" );
                    }
                    else if ( datornsVal.equals( "Påse" )) {
                        System.out.println( "Datorn vann" );
                    }
                    else {
                        System.out.println( "Det vart lika" );
                    }
                    break;
                case "sax":
                    if ( datornsVal.equals( "Påse" )) {
                        System.out.println( "Du vann" );
                    }
                    else if ( datornsVal.equals( "Sten" )) {
                        System.out.println( "Datorn vann" );
                    }
                    else {
                        System.out.println( "Det vart lika" );
                    }
                    break;
                case "påse":
                    if ( datornsVal.equals( "Sten" )) {
                        System.out.println( "Du vann" );
                    }
                    else if ( datornsVal.equals( "Sax" )) {
                        System.out.println( "Datorn vann" );
                    }
                    else {
                        System.out.println( "Det vart lika" );
                    }
                    break;
            }


        Bil b = new Bil();
        b.setRegno("AAA111");
        b.setYear(2016);
        b.setColor("Red");
        b.setBrand("Volvo");

        Bil c = new Bil();
        c.setRegno("BBB111");
        c.setYear(1973);
        c.setColor("Blue");
        c.setBrand("Saab");


        var bilRegister = new BilRegister();
        bilRegister.run();




    }
}
