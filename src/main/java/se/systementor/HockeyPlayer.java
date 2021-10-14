package se.systementor;

public class HockeyPlayer {
    private String name;  //Sudden
    private int jersey; //13
    private int age; //23

    public HockeyPlayer(String namn) {
        super();
        setName(namn);
    }

    //getters och setters
    public String getName(){ return name;}    
    public void setName(String s){ name = s; }

    public int getJersey(){ return jersey;}    
    public void setJersey(int s){ jersey = s; }
    
    public int getAge(){ return age;}    
    public void setAge(int s){ age = s; }
}
