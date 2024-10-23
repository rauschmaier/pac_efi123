package processingMaven;

import processing.core.PApplet;

public class Main extends PApplet {
	int x;
	int y;
	int diameter;
	int futterX;
	int futterY;
	boolean isVisible;
	public static void main(String[] args) {
		PApplet.main("processingMaven.Main");
	}

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		background(255);
		x = 300;
		y = 300;
		isVisible= true;
		diameter=50;
		futterX=(int)(Math.random()*width);
		futterY=(int)(Math.random()*height);
	}

	public void draw() {
		background(50,34,88);
		fill(0,255,255);
		if(isVisible) {
			ellipse(futterX, futterY, 20, 20);
		}
		
		ellipse(x, y, diameter, diameter);
		if(dist(futterX, futterY, x, y)<diameter/2) {
			isVisible=false;
		}
		
	}



	public void keyPressed() {
		
		switch (key) {
		case 'a':
			x-=30;
			x=constrain(x, diameter/2, width-diameter/2);
			println(key);
			break;
		case 's':
			y+=20;
			y=constrain(y, diameter/2, height-diameter/2);
			println(key);
			break;
		case 'd':
			x+=20;
			x=constrain(x, diameter/2, width-diameter/2);
			println(key);
			break;
		case 'w':
			y-=30;
			y=constrain(y, diameter/2, height-diameter/2);
			println(key);
			break;
		default:
			println(key);
		}
	}
}
