package inl1;
import se.lth.cs.p.inl1.nbr2.*;
public class Decryptographer {
		/** Skapar ett objekt för dechiffrering där nyckeln key används */
		private Key key;
		private String text;
	    Decryptographer(Key key) {
			this.key = key;
	    }
	    /** Dechiffrerar texten text och returnerar klartexten */
	    public String decrypt (String text){
	    	this.text = text;
	    	int count = 0;
	    	/** Tar reda på startförskjutningen */
	    	int start = key.getStart();
	    	/** Skapar en tom strängbuffert */
	    	StringBuilder string = new StringBuilder();
	    	for (int pos = 0; pos < text.length(); pos++){
	    		char ch = text.charAt(pos);
	    		int n = 0;
	    		if(ch!=' '){
	    			/** Tar reda på bokstav nummer index i chifferalfabetet */
	    		while(ch!= key.getLetter(n)){
	    		n++;
	    		}
	    		int m = n - start - count;
	    		count++;
	    		while(m<0){
	    			m = m +26;
	    		}
	    		/** Lägger till index m efter de existerande tecknen i bufferten */
				string.append((char)(m + 'A'));
	    		}
	    		else if (ch == ' '){
	    			string.append(' ');
	    		}
	    	}
	    	/** Skapar ett String-objekt med samma innehåll som denna 
	    	 strängbuffert */
	    	 this.text = string.toString();
	    	 return this.text;
	    			}
	    	}