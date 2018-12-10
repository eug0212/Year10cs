package Alien;

import java.awt.Image;
import java.awt.Toolkit;

public class Goodguy {
	
	private int xCoord = 0;
	private int yCoord = 0;
	private int width = 10;
	private int height = 10;
	private Image img;
	
	/**
	 * Goodguy default constructor
	 */
	public Goodguy() {
		setxCoord(10);
		setyCoord(10);
		setWidth(30);
		setHeight(30);
		setImg(".../File/spongebob.jpg");
	
	}
	
	/**
	 * Goodguy overloaded constructor
	 * @param x initial x location
	 * @param y initial y location
	 * @param w initial width
	 * @param h initial height 
	 */
	public Goodguy(int x, int y, int w, int h, String imgpath) {
		setxCoord(x);
		setyCoord(y);
		setWidth(w);
		setHeight(h);
		setImg(imgpath);
	}
	
	public void moveIt (int direction, int w, int h) {
		int speed = 40;
		int x =getxCoord();
		int y = getyCoord();
		if (direction == 39) {
			if (x > w) {
				x = x - speed;
			}
			x = x + speed;
			setxCoord(x);
		} else if (direction == 38) {
			if (y < 0) {
				y =y + speed;
			}
			y = y - speed;
			setyCoord(y);
		} else if (direction == 40) {
			if (y > h - 10) {
				y = y - speed;
			}
			y = y + speed;
			setyCoord(y);
		}else if ( direction == 37) {
			if (x < 0) {
				x = x + speed;
			}
			x = x - speed;
			setxCoord(x);
		}
	}
	
	public void setImg(String imgpath) {
		this.img = Toolkit.getDefaultToolkit().getImage(imgpath);
	}

	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}
	
}
