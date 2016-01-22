import java.util.Random;
import se.lth.cs.window.SimpleWindow;
public class RacingEvent {
	private Turtle t1;
	private Turtle t2;
	RaceTrack track;
	
	public RacingEvent(RaceTrack track, Turtle t1, Turtle t2) {
		this.t1 = t1;
		this.t2 = t2;
		this.track = track;
	}
	public void Go(){
		t1.jumpTo(100, track.yStart());
		t2.jumpTo(200, track.yStart());
		int finishLine = track.yFinish;
		Random rand = new Random();
		t1.penDown();
		t2.penDown();
		
		
		while(t1.getY() > finishLine && t2.getY() > finishLine) {
			t1.forward(rand.nextInt(2));
			t2.forward(rand.nextInt(2));
			SimpleWindow.delay(5);
			
		}
		System.out.println(track.yFinish);
	}
	
}
