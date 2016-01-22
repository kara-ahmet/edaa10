import se.lth.cs.window.SimpleWindow;
public class Turtle {
	private SimpleWindow w;
	private double x, y;
	private int alfa;
	private boolean penD;
	/**	 * skapar en sköldpadda som ritar i ritfönstret w.
	 * Från början befinner sig	 * sköldpaddan i punkten xHome,yHome med pennan lyft och huvudet pekande
	 * * rakt uppåt i fönstret, dvs i negativ y-riktning	 */
	public Turtle(SimpleWindow iw, int ix, int iy) {
		w = iw;	
		x = ix;	
		y = iy;		
		alfa = 90;		
		penD = false;	
		}	
	/** sänker pennan */	
	void penDown() {	
		penD = true;
		}	
	/** lyfter pennan */	
	void penUp() {		
		penD = false;	
		}	
	/** går rakt framåt n pixlar i huvudets riktning */	
	void forward(int n) {	
		w.moveTo((int) Math.round(x), (int) Math.round(y));	
		x = x + n * Math.cos(alfa * Math.PI / 180);		
		y = y - n * Math.sin(alfa * Math.PI / 180);		
		if (penD)			w.lineTo((int) Math.round(x), (int) Math.round(y));	}	
	/** vrider huvudet beta grader åt vänster */	
	void left(int beta) {	
		alfa += beta;	
		}	
	/** vrider hvudet beta grader åt höger */	
	void right(int beta) {		
		alfa -= beta;	
		}	
	/**	 * går till punkten newX,newY utan att rita. Pennans läge och huvudets	
	 *  * riktning påverkas inte	 
	 *  */	
	void jumpTo(int newX, int newY) {	
		x = newX;		
		y = newY;	
		}	
	/** återställer huvudets riktning till den ursprungliga */	
	void turnNorth() {		
		alfa = 90;	
		}	
	/** tar reda på sköldpaddans aktuella x-koordinat */	
	int getX() {		
		return (int) Math.round(x);	
		}	
	/** tar reda på sköldpaddans aktuella y-koordinat */	
	int getY() {		
		return (int) Math.round(y);	
		}}