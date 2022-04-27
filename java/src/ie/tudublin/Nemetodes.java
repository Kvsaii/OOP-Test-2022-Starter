package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Nemetodes extends PApplet {


    private String name;
    private float length;
    private int limbs;
    private String gender;
    private int eyes;

    public Nemetodes(String name, float length, int limbs, String gender, int eyes) {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;



    }


    public Nemetodes(TableRow tr) {
        this ( 
            tr.getString("name"),
            tr.getInt("length"),
            tr.getInt("limbs"),
            tr.getString("gender"),
            tr.getInt("eyes")
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLength() {
        return length;
    }
    
    public void setLength(float length) {
        this.length = length;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }

    public int getLimbs() {
        return limbs;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    @Override
    public String toString() {
        return "Nematode [eyes=" + eyes +  ",gender=" + gender + ",length =" + length +  ",limbs=" + limbs + ",name=" + name + "]";
    }

    public static void main () {}


    public static void add(Nemetodes nema) {
    }
    
 

 
}


