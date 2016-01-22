import se.lth.cs.window.SimpleWindow;
import se.lth.cs.p.ovn.turtle.Turtle;
public class ClickSquare {
	public static void main(String[] args) {
		
	SimpleWindow w = new SimpleWindow(600,600,"Square");
	while (true) {
		w.waitForMouseClick();
		Turtle t = new Turtle(w, w.getMouseX(), w.getMouseY());
		t.penDown();
		for(int i = 1; i <= 4; i++){
			t.right(90);
			t.forward(300);
			
		}
	
	}
	}
}
