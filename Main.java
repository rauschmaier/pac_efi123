package processingMaven;

import processing.core.PApplet;

public class Main extends PApplet {
	int x;
	int y;
	int diameter;
	int futterX[];
	int futterY[];
	int anzFutter;
	boolean isVisible[];

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

		diameter = 50;
		anzFutter = 10;
		futterX = new int[anzFutter];
		futterY = new int[anzFutter];
		isVisible = new boolean[anzFutter];
		for (int i = 0; i < anzFutter; i++) {
			futterX[i] = (int) (Math.random() * width);
			futterY[i] = (int) (Math.random() * height);
			isVisible[i] = true;
		}

	}

	public void draw() {
		background(50, 34, 88);
		fill(0, 255, 255);
		for (int i = 0; i < anzFutter; i++) {
			if (isVisible[i]) {
				ellipse(futterX[i], futterY[i], 20, 20);
				if (dist(futterX[i], futterY[i], x, y) < diameter / 2) {
					isVisible[i] = false;
				}
			}
		}

		ellipse(x, y, diameter, diameter);
		

	}

	public void keyPressed() {

		switch (key) {
		case 'a':
			x -= 30;
			x = constrain(x, diameter / 2, width - diameter / 2);
			println(key);
			break;
		case 's':
			y += 20;
			y = constrain(y, diameter / 2, height - diameter / 2);
			println(key);
			break;
		case 'd':
			x += 20;
			x = constrain(x, diameter / 2, width - diameter / 2);
			println(key);
			break;
		case 'w':
			y -= 30;
			y = constrain(y, diameter / 2, height - diameter / 2);
			println(key);
			break;
		default:
			println(key);
		}
	}
}
