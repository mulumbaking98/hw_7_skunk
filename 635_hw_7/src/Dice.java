/**
 * 
 */

/**
 * @author maya5348
 *
 */
public class Dice {

	/**
	 * @param args
	 */
	
	private int[] die1Rolls;
	private int[] die2Rolls;
	private int loadedDieIndex;
	
	private int lastDie1Roll;
	private int lastDie2Roll;
	
	
	public Dice(){}
	
	public Dice(int[] dieRolls, int[] die2Rolls){
		this.loadedDieIndex = 0;  ///track pairs of die
		this.die1Rolls = dieRolls;
		this.die2Rolls = die2Rolls;
				
	}
	
	public void roll(){
	   lastDie1Roll = die1Rolls[loadedDieIndex];
	   lastDie2Roll = die2Rolls[loadedDieIndex];
	}
	public int getDieRoll(){return 0;}
	public int getDie2Roll(){return lastDie2Roll;}
	public int getDie1Roll(){return lastDie1Roll;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
