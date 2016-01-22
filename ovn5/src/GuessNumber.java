import java.util.Scanner;
import se.lth.cs.window.SimpleWindow;
import se.lth.cs.p.ovn.turtle.Turtle;
public class GuessNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Välj minimum- och maxvärde!");
		int min = scan.nextInt();
		int max = scan.nextInt();
		int guess = min-1;
		int counter = 0;
		NumberGenerator nbrGen = new NumberGenerator(min, max);
		nbrGen.drawNbr();
		System.out.println("Gissa numret!");
		while(!nbrGen.isEqual(guess)){
			guess = scan.nextInt();
			counter++;
			if(nbrGen.isEqual(guess)){
				System.out.println("Du gissade rätt efter " + counter + " gånger!");
			}
			else if(nbrGen.isBiggerThan(guess)){
				System.out.println("Välj ett större tal!");
			}
			else{
				System.out.println("Välj ett mindre tal!");
			}
			}
		}
	}