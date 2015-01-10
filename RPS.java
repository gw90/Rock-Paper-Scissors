import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner (System.in);
		
		while(true){
			//variables
			int random;
			Random generator = new Random();
			random = generator.nextInt(3);
			
			String rps1 = "3.14159";
			String rps2 = "rock";
			
			
			//set rps2 to 
			if( 0 == random){
				rps2 = "rock";
			}
			
			if( 1 == random){
				rps2 = "paper";
			}
			if( 2 == random){
				rps2 = "scissors";
			}
			//check who won
			/*JOptionPane.showMessageDialog(random);
			JOptionPane.showMessageDialog(rps2);*/
			
			while( !(rps1.equals("rock"))&& !(rps1.equals("paper"))&& !(rps1.equals("scissors"))){
				
				rps1 = JOptionPane.showInputDialog(null,  "Rock, Paper, or Scissors?", "?", JOptionPane.DEFAULT_OPTION);
				if(rps1.equals("end")){
					System.exit(0);
				}
			}
			
			
			
			if(rps1.equals("rock")){
				if(rps2.equals("paper")){
					JOptionPane.showMessageDialog(null, "Computer wins!", "You lose", JOptionPane.DEFAULT_OPTION);
				}
				if(rps2.equals("rock")){
					JOptionPane.showMessageDialog(null, "It's a tie!", "Tie", JOptionPane.DEFAULT_OPTION);
				}
				if(rps2.equals("scissors")){
					JOptionPane.showMessageDialog(null, "Human wins", "Win!", JOptionPane.DEFAULT_OPTION);
				}
			}
		
			if(rps1.equals("paper")){
				if(rps2.equals("paper")){
					JOptionPane.showMessageDialog(null, "It's a tie!", "Tie", JOptionPane.DEFAULT_OPTION);
				}
				if(rps2.equals("rock")){
					JOptionPane.showMessageDialog(null, "Human wins", "Win!", JOptionPane.DEFAULT_OPTION);
				}
				if(rps2.equals("scissors")){
					JOptionPane.showMessageDialog(null, "Computer wins!", "You lose", JOptionPane.DEFAULT_OPTION);
				}
			}
			
			if(rps1.equals("scissors")){
				if(rps2.equals("paper")){
					JOptionPane.showMessageDialog(null, "Human wins", "Win!", JOptionPane.DEFAULT_OPTION);
				}
				if(rps2.equals("rock")){
					JOptionPane.showMessageDialog(null, "Computer wins!", "You lose", JOptionPane.DEFAULT_OPTION);
				}
				if(rps2.equals("scissors")){
					JOptionPane.showMessageDialog(null, "It's a tie!", "Tie", JOptionPane.DEFAULT_OPTION);
				}
			}
			
			JOptionPane.showMessageDialog(null, "Human chose: " + rps1 + "\nComputer chose: " + rps2, "", JOptionPane.DEFAULT_OPTION);
		}		
	}

}
