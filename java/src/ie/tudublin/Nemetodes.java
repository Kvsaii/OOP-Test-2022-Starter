package ie.tudublin;

import processing.core.PApplet;
import processing.core.PConstants;
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

    // Pathetic attempt at creating the visualisation 
    //public void render(NematodeVisualiser pa, int index){
        //pa.stroke(255, 0, 255);
       // pa.textAlign(PApplet.CENTER, PApplet.CENTER);
        //pa.textSize(20);
       // pa.rect(100, 200, 100, 200);
        //float offset = 50;

        //for (int i = 0; i < this.length; i++) {
           // pa.circle(pa.width/2, (pa.height/2)+(offset*i), 50);
      //  }

        //pa.text(this.name, 100,100);
       // if (this.gender == "m") {
            //for (int i = 0; i < this.length; i++) {
           // }
        //} else if (this.gender == "f") {
          //  for (int i = 0; i < this.length; i++) {
            //}
       // } else if (this.gender == "h") {
            //for (int i = 0; i < this.length; i++) {
          //  }
        //} else if (this.gender == "n") {
         //   for (int i = 0; i < this.length; i++){
          //  }
        //} else if (this.gender == "m") {
          //  for (int i = 0; i < this.length; i++){
           // }
       // }

    //}

    public void render(NematodeVisualiser nv, int value)
    {
        nv.stroke(NematodeVisualiser.map(value, 0, 10, 0, 255), 255,255);

        int width = nv.width;
        int height = nv.width;
        float border = nv.border;
        int limbsize = nv.limbsize;
        float limb;
        

        //Creating a Circle + Text
        fill(255,255,255);
        circle(400, 100, 50);

        for(int i = 1; i <= this.length; i++)
        {
            limb = border + border + limbsize * i;
            nv.noFill();
    
            nv.circle(width/2, height - limb, limbsize);
            if(i == this.length){
                nv.fill(NematodeVisualiser.map(value, 0, 10, 0, 255), 255, 255);
                nv.textAlign(PConstants.CENTER,PConstants.CENTER);
                nv.text(this.name, width/2, height -limb - 50);
            }

        }


        
        nv.line(width - border * 2, width/2, width - border * 3, width/2);
        nv.line(width - border * 2, width/2, width - border * 2 - 10, height/2 - 10);
		nv.line(width - border * 2, width/2, width - border * 2 - 10, height/2 + 10);

	
		nv.line(border * 2, width/2, border * 3, width/2);
		nv.line(border * 2, width/2,border * 2 + 10, height/2 - 10);
		nv.line(border * 2, width/2,border * 2 + 10, height/2 + 10);

    }

    
 

 
}


