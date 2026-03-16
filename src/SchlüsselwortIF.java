
public class SchlüsselwortIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// Allgemeine Punktzahl
			int score = 4000;
			
			if (score == 5000) {
				System.out.println("Herzlichen Glückwunsch, neuer Rekord!!");
			}else {
				System.out.println("Schade dein Score reicht leider nicht!");
			}

			// Spielerleben
			int lebenPlayer = 3;
			if (lebenPlayer == 0) {
				System.out.println("Spiel verloren");
				
			}
			
			// Trefferlogik
			boolean gegnerHit = true;
			int highscore = 0;
			
			if (gegnerHit == true) {
				System.out.println("Gegner getroffen!");
				highscore += 10;
				System.out.println("Highscore ist: " + highscore);
			} else {
				System.out.println("Ziel verfehlt");
			}
			
			
				
		
	}

}
