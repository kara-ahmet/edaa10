import java.util.Random;
import se.lth.cs.window.SimpleWindow;
public class TurtleWalk {
	public static void main(String[] args) {
		int nbr1, nbr2;
		SimpleWindow w = new SimpleWindow(600, 600, "Square");
	    Turtle t = new Turtle(w,250, 250);
	    Turtle p = new Turtle(w,350,350);
	    Random rand = new Random();   
	while (Math.hypot(((t.getX()-p.getX())), ((t.getY()-p.getY())))>=50 ){
		nbr1 = 1+rand.nextInt(10);
		nbr2 = -179 + rand.nextInt(360);
		t.penDown();
		t.forward(nbr1);
		t.right(nbr2);
		nbr1 = 1+rand.nextInt(10);
		nbr2 = -179 + rand.nextInt(360);
		p.penDown();
		p.forward(nbr1);
		p.right(nbr2);
		SimpleWindow.delay(3);	}}}