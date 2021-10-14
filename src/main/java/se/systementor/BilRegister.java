package se.systementor;

import java.util.ArrayList;



public class BilRegister {
    
    private ArrayList<Bil> bilar = new ArrayList<>();
    
    public void run(){
        while(true){
            int sel = showMenuAndGetSelection();
            if(sel == 1){
                System.out.print("Ange regnummer:"); //AAA111 = Volvo XC60
                String regno = System.console().readLine();
                System.out.print("Ange modell:"); //  BBB222 = Saab V4 
                String modell = System.console().readLine();
                System.out.print("Ange årsmodell:"); // 1973
                int year = Integer.parseInt(System.console().readLine());

                Bil b = new Bil();
                b.setRegno(regno);
                b.setModell(modell);
                b.setYear(year);

                bilar.add(b);
            }
            else if(sel == 2){
                System.out.println("Följande bilar finns:");
                for(Bil bil : bilar){
                    System.out.println(bil.getRegno() + " " + bil.getModell());
                }                
            }
            else if(sel == 0)
                break;
        }
    }

    private int showMenuAndGetSelection() {
        while(true){
            System.out.println("1. Lägg till bil");
            System.out.println("2. Skriv ut alla bilar");
            System.out.println("0. Avsluta");
    
            System.out.println("Ange val:");
            int sel = Integer.parseInt(System.console().readLine());
            if(sel == 0 || sel == 1 || sel == 2)
                return sel;
            System.out.println("Ogiltigt val:");

        }
    }
}
