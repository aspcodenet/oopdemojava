package se.systementor;

import java.util.ArrayList;

public class BilRegister {
    
    private ArrayList<String> bilar = new ArrayList<>();
    
    public void run(){
        while(true){
            int sel = showMenuAndGetSelection();
            if(sel == 1){
                System.out.print("Ange regnummer:");
                String regno = System.console().readLine();
                bilar.add(regno);
            }
            else if(sel == 2){
                System.out.println("Följande bilar finns:");
                for(String bil : bilar){
                    System.out.println(bil);
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
