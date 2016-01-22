import se.lth.cs.window.SimpleWindow;
public class Triangle extends Shape {
	protected int side;

	public Triangle(int x, int y, int side) {
		super(x, y);
		this.side = side;
	}

	public void draw(SimpleWindow w) {
		w.moveTo(x, y);
		w.lineTo(x+(int)Math.round(Math.cos(Math.PI/3)*side), y-(int)Math.round(Math.sin(Math.PI/3)*side));
		w.lineTo(x+side, y);
		w.lineTo(x, y);
	}
}