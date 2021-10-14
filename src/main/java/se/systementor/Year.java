package se.systementor;

import java.util.ArrayList;

public class Year {
    public void run(){

        float i = getSmallest(12,13);

        ArrayList<String> arrayListen =  getYears(1999,2021);
        for (String s: arrayListen){
            System.out.println(s);
        }
    }

    public float getSmallest(int i, int j)    {
        float f = 123;
        if(i < j) return f;
        return 123f;
    }


                                     // datatype lådnamn, datatype lådnamn
    public ArrayList<String> getYears(int start, int end){
        
        ArrayList<String> listan = new ArrayList<>();

        for(int year = start; year <= end; year++){
            listan.add("År " + year);
        }
        return listan;
    }
}
