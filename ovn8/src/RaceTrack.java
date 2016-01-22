import se.lth.cs.window.SimpleWindow;
public class RaceTrack {
	int yStart = 300;
	int yFinish = 0;
	
	public RaceTrack(int yStart, int yFinish){
		this.yStart = yStart;
		this.yFinish = yFinish;
		
	}
	void draw(SimpleWindow w){
		w.moveTo(250, yStart);
		w.lineTo(50, yStart);
		w.moveTo(250, yFinish);
		w.lineTo(50, yFinish);
	}
	int yFinish(){
		return yFinish;
	}
	int yStart(){
		return yStart;
	}
		
	}
	
