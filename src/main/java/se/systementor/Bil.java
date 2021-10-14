package se.systementor;

// OOP = Bygga en "SAK" som validerar sig själv! Dvs = aldrig i INVALID STATE

//Vad är valid state?  måste ha ett regno, måste ha en årsmodell, måste ha en modell

public class Bil { //KLASS = RITNING 
    private String regno; 
    private String modell; 
    private int year; 
    private String color; 

    //ctor och sen tab
    public Bil(String regno, int year, String modell) {
        super();
        setRegno(regno);
        setModell(modell);
        setYear(year);
    }
  
    public String getColor(){ return color;}    
    public void setColor(String s){color = s; }

    public String getModell(){ return modell;}    
    public void setModell(String s){modell = s; }
    public int getYear(){ return year;}    
    
    public boolean setYear(int n){
        if(n < 1900) return false;
        if(n > 2030) return false; 
        year = n; 
        return true;
    }

    public String getRegno(){return regno; }    
    public void setRegno(String s){regno = s;}


}
