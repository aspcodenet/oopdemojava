package se.systementor;

public class StringUtils {
    public boolean allCharsAreIdentical(String s){
        return true;
    }

    public void run(){
        String i = System.console().readLine();
        boolean b = allCharsAreIdentical(i);
        if(b){
            System.out.println("Lika");
        }
        else
            System.out.println("Ej Lika");
    }
}
