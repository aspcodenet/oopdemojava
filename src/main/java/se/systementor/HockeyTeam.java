package se.systementor;

import java.util.ArrayList;

public class HockeyTeam {
    private String name;  //Färjestad
    private String city; //Karlstad
    private ArrayList<HockeyPlayer> players = new ArrayList<>();

    public HockeyTeam(String namn) {
        super();
        setName(namn);
    }

    public void addPlayer(HockeyPlayer p){
        players.add(p);
    }

    //getters och setters
    public String getName(){ return name;}    
    
    public void setName(String value){
         name = value; 
    }

    public String getCity(){ return city;}    
    public void setCity(String s){ city = s; }
    
}
