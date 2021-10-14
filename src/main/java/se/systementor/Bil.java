package se.systementor;

public class Bil { //KLASS = RITNING 
    private String regno; 
    private String modell; 
    private int year; 
    private String color; 
  
    public String getColor(){ return color;}    
    public void setColor(String s){color = s; }
    
    public String getModell(){ return modell;}    
    public void setModell(String s){modell = s; }
    public int getYear(){ return year;}    
    public void setYear(int n){year = n; }
    public String getRegno(){return regno; }    
    public void setRegno(String s){regno = s;}


}
