package processingMaven;

import processing.core.PApplet;

public class Main extends PApplet {
	int x;
	int y;
	int anz;
	int speed;
	int diameter;
	int futterX[];
	int futterY[];
	boolean isVisible[];

	public static void main(String[] args) {
		PApplet.main("processingMaven.Main");
	}

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		background(255);
		speed=15;
		x = 300;
		y = 300;
		diameter = 50;
		anz = 5;
		futterX = new int[anz];
		futterY = new int[anz];
		isVisible = new boolean[anz];
		for (int i = 0; i < anz; i++) {
			futterX[i] = (int) (Math.random() * width);
			futterY[i] = (int) (Math.random() * height);
			isVisible[i] = true;
		}

	}

	public void draw() {
		background(50, 34, 88);
		fill(0, 255, 255);
		ellipse(x, y, diameter, diameter);
		for (int i = 0; i < anz; i++) {
			if (dist(x, y, futterX[i], futterY[i]) < diameter / 2) {
				isVisible[i] = false;
			}
			if (isVisible[i]) {
				ellipse(futterX[i], futterY[i], 10, 10);
			}
		}
		

	}

	public void keyPressed() {

		switch (key) {
		case 'a':
			x -= speed;
			x = constrain(x, diameter / 2, width - diameter / 2);
			println(key);
			break;
		case 's':
			y += speed;
			y = constrain(y, diameter / 2, height - diameter / 2);
			println(key);
			break;
		case 'd':
			x += speed;
			x = constrain(x, diameter / 2, width - diameter / 2);
			println(key);
			break;
		case 'w':
			y -= speed;
			y = constrain(y, diameter / 2, height - diameter / 2);
			println(key);
			break;
		default:
			println(key);
		}
	}
}
