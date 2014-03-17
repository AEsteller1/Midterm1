public class PairOfDice {
    
    private final int NUM_OF_SIDES = 6;
    private int outcome1;
    private int outcome2;
    
    Die d1 = new Die(NUM_OF_SIDES);
    Die d2 = new Die(NUM_OF_SIDES);
    
    public void RollTwoDice(){
        outcome1=d1.rollDie();
        outcome2=d2.rollDie();
    }
    
    public int getOutcome1(){
        return outcome1;
    }
    
    public int getOutcome2(){
        return outcome2;
    }
}
