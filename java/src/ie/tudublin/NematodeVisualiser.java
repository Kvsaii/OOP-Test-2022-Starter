package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	public int index = 0;
	public float border;
	public int rowheight = 100;
	public int limbsize = 50;

	ArrayList<Nemetodes> nematodes = new ArrayList<Nemetodes>();

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(1000, 1000);
	}

	public void setup() 
	{
		colorMode(HSB);
		loadNematodes();
		printNematode();
		background(0);
		smooth();		
		border = width * 0.1f;		
	}
	

	private void printNematode() {
		for(Nemetodes n:nematodes)
		{
			System.out.println(n);
		}
	}


	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");


		for (TableRow row:table.rows()) 
		{
			Nemetodes nema = new Nemetodes(row);
			Nemetodes.add(nema);
			System.out.println(nema.toString());
		}

	}

	public void drawNematodes() 	{

		if (index < nematodes.size())
		{
			nematodes.get(index).render(this, index);
		}
		else {
			index = 0;
		}

		
	}


	public void draw()
	{	
		background(0);
		drawNematodes();
	}
}
