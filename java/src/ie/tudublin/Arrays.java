package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{
	String[] months = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};


	float[] rainfall = {200,260,300,150,100,50,10,40,67,160,400,420};

	public void settings()
	{
		size(500, 500);

		String[] m1 = months.clone();

		int min = 0;
		int max = 0;
		int sum = 0;
		for(int i = 0; i < months.length; i++){
			if(rainfall[i] > rainfall[max]){
				max = i;
			}
			if(rainfall[i] < rainfall[min]){
				min = i;
			}
			sum += rainfall[i];
		}
		println("Max = ", months[max], "\nMin = ", months[min], "Avg = ", (float) sum / rainfall.length);
		

	}

	public void setup() {
		colorMode(HSB);
		background(0);

		
		
	}

	
	public void draw()
	{	
	}
}
