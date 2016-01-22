import se.lth.cs.window.SimpleWindow;
import se.lth.cs.p.ovn.turtle.Turtle;

public class DrawSquare {
  public static void main(String[] args) {
    SimpleWindow w = new SimpleWindow(600,600,"Square");
    Turtle t = new Turtle(w,100,200);
    t.penDown();
    for (int k=1; k<=4; k++) {
      t.right(90);
      t.forward(300);
    }
  }
}