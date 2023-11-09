import java.awt.*;
import java.util.Random;

public class Circle {

    private int x, y;
    private int radius;
    private Color color;
    static Random generator = new Random();
    // Creates a random circle

    public Circle() {
        radius = Math.abs(generator.nextInt()) % 50 + 25;
        color = new Color(Math.abs(generator.nextInt()) % 16777216);
        x = Math.abs(generator.nextInt()) % 600;
        y = Math.abs(generator.nextInt()) % 450;
    }

    // Creates a circle of a given size (diameter)


    public Circle(int size) {
        radius = Math.abs(size / 2);
        color = new Color(Math.abs(generator.nextInt()) % 16777216);
        x = Math.abs(generator.nextInt()) % 600;
        y = Math.abs(generator.nextInt()) % 450;
    }

    // Draws circle on graphics object given

    public void draw(Graphics page) {
        page.setColor(color);
        page.fillOval(x, y, radius * 2, radius * 2);
    }


    public void move(int over, int down) {
        x = x + over;
        y = y + down;
    }
    //Return the x coordinate of the circle corner

    public int getX() {
        return x;
    }

    //Return the y coordinate of the circle corner

    public int getY() {
        return y;
    }
}