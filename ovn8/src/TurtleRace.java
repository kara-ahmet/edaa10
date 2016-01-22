import se.lth.cs.window.SimpleWindow;
public class TurtleRace {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(400, 400, "TurtleRace");
		RaceTrack track = new RaceTrack(250, 50);
		
		
		Turtle t1 = new Turtle(w, 0, 0);
		Turtle t2 = new Turtle(w, 0, 0);
		
		track.draw(w);
		RacingEvent event = new RacingEvent(track, t1, t2);
		w.waitForMouseClick();
		event.Go();

	}

}
