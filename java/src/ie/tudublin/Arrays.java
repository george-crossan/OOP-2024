package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{
	String[] months = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};


	float[] rainfall = {200,260,300,150,100,50,10,40,67,160,400,420};

	public float map1(float a, float b, float c, float d, float e)
	{
		float r1 = c - b;
		float r2 = e - d;

		float howFar = a - b;
		return d + (howFar / r1) * r2;
		
	}

	public void settings()
	{
		size(500, 500);

		String[] m1 = months.clone();

		int minIndex = 0;
		int maxIndex = 0;
		int sum = 0;
		for(int i = 0; i < months.length; i++){
			if(rainfall[i] > rainfall[maxIndex]){
				maxIndex = i;
			}
			if(rainfall[i] < rainfall[minIndex]){
				minIndex = i;
			}
			sum += rainfall[i];
		}
		println("Max = ", months[maxIndex], "\nMax = ", months[minIndex], "Avg = ", (float) sum / rainfall.length);

		// a b-c d-e
		// percent of a between b and c, value of that percent between d and e
		println(map1(5,0,10,0,100));
		// 50

		println(map1(25,20,30,200,300));
		//250

		println(map1(26,25,35,0,100));
		// 10



	}

	public void setup() {
		colorMode(HSB);
		background(0);

		
		
	}

	
	public void draw()
	{	
		background(0);
		float w = width / (float)months.length;
		for(int i = 0; i < months.length; i++){
			float x = map1(i,0, months.length, 0 ,width);
			rect(x, height, w, -rainfall[i]);
		} 
	}
}
