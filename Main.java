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
		diameter=50;
		isVisible=true;
		futterX=(int)(Math.random()*width);
		futterY=(int)(Math.random()*height);
	}

	public void draw() {
		background(50,34,88);
		fill(0,255,255);
		ellipse(x, y, diameter, diameter);
		if(dist(x,y,futterX,futterY)<diameter/2) {
			isVisible=false;
		}
		if(isVisible) {
			ellipse(futterX,futterY,10,10);
		}
		
	}



	public void keyPressed() {
		
		switch (key) {
		case 'a':
			x-=1;
			x=constrain(x, diameter/2, width-diameter/2);
			println(key);
			break;
		case 's':
			y+=1;
			y=constrain(y, diameter/2, height-diameter/2);
			println(key);
			break;
		case 'd':
			x+=1;
			x=constrain(x, diameter/2, width-diameter/2);
			println(key);
			break;
		case 'w':
			y-=1;
			y=constrain(y, diameter/2, height-diameter/2);
			println(key);
			break;
		default:
			println(key);
		}
	}
}
