//Nathaniel Snyder 

package lab6;

public class Game {

	int Score1;
	int Score2;
	int Score3;
	
    int highScore = 0;
	int x = Score1;
    int y = Score2;
    int z = Score3;
	

	
	//this is to test the game class

	//possible
	//Store player score for player1
      Score1 = player1.getScore();
	//
	//Store player score for player2.
	// Score2 = player2.getScore();
	//
	
	//Store player score for player3.
	// Score3 = player3.getScore();
	
	//Store player high score
	 public int highScore(){
	

    int x = Score1;
    int y = Score2;
    int z = Score3;

    if ( x > y && x > z )
       System.out.println("First player is the Winner Congratulations: " + player1);
       return 1
       
    else if ( y > x && y > z )
       System.out.println("Second player is the Winner, Congratulations:  " + player2);
       return 2
    else if ( z > x && z > y )
       System.out.println("Third player is the Winner, Congratulations:  " + player3);
	   return 3 
	
	
	
}	
}
