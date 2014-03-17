import java.util.*;

public class Pig1 {

private static int PlayerPoints;
private static int ComputerPoints;
private static int Die1;
private static int Die2;
private static boolean TurnPlayer;
private static boolean TurnComputer;
private static boolean PlayerSelection;

public static void main (String[] args) {
 int TotalRound=0;

PairOfDice p = new PairOfDice();
Scanner scan = new Scanner(System.in);

while (PlayerPoints < 100 && ComputerPoints < 100){

	

while (TurnPlayer){
	//
    p.RollTwoDice(); 

	Die1=p.getOutcome1();
	Die2=p.getOutcome2();
	
	
	
	if (Die1==1 && Die2==1){
	System.out.println("Player, you got two dice with faces 1, which means you lose all of your points and your turn ends.");
	PlayerPoints=0;
	break ;
	
	} 
	
	else if(Die1==1 || Die2==1){
	System.out.println("Player, you got one die with face 1, which means you lose all your points for the round and your turn ends.");
	TotalRound=0;
	break ;
	} else 
	
	TotalRound+=Die1+Die2; 
	
		
	PlayerPoints+=TotalRound;
	System.out.println("Player, your roll was a die with face "+Die1+" and the other with face "+Die2+" giving you "+PlayerPoints+" points");
	System.out.println("Press 1 to roll again or any other number to end your turn");
	 
	 int PlayerSelection = scan.nextInt();
	 
	 if (PlayerSelection == 1){
	  TurnPlayer=true;
	} else break ;
	
	
	}
	
	TurnPlayer=true;
	
	
	
	while (TurnComputer == true){
	 p.RollTwoDice(); 

	Die1=p.getOutcome1();
	Die2=p.getOutcome2();
	
	if (Die1==1 && Die2==1){
	
	ComputerPoints=0;
	break;
	
	} 
	
	else if(Die1==1 || Die2==1){
	
	TotalRound=0;
	break;
	
	} else 
	
	TotalRound+=Die1+Die2; 
	
	
	
	ComputerPoints+=TotalRound; 
	
	if(TotalRound >= 20){
	System.out.println("The computer is done, the player's turn starts again!");
	break;
	}
	
	System.out.println("The computer's roll was a die with face "+Die1+" and the other with face "+Die2+" giving it "+ComputerPoints+" points");
	
	}
	
	
	
	
	
	}




}


}