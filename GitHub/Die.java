import java.util.*;

public class Die {

    private int numSides;
	
    public Die(int n){
        
        numSides = n;
        
    }
    
	public int rollDie(){
            Random ran = new Random();
            int outcome = ran.nextInt(numSides)+1;
            return outcome;
        }

        
}