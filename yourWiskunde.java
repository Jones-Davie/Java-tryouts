import java.util.*;


public class yourWiskunde 

{
	
	public static void main (String[] args) 
	{
		
		
		Random rdm = new Random();
		
		
		int numberOne, numberTwo, result, answer, question;
		int score = 0;
		int scoreMultiplier = 1;
		int minNumber = 0;
		int maxNumber = 9;
		int questionNumber = 1;
		char gameMode = 'g'; 
		char teken = 'a';
		boolean gameOn = false;
		boolean quitGame = false;
		boolean gameOver = false;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lets play a game");
				
		

		
			//kies spel optie en loop totdat iemand een keuze heeft gemaakt
			while (gameOn == false) {
				
				System.out.println("press a to subtract");
				System.out.println("press b to add");
				System.out.println("press c to devide");
				System.out.println("press d to multiply");
				gameMode = input.next().charAt(0);
				
				switch (gameMode) //switch voor keuze input
					{
					
					case 'a' : System.out.println("you have chosen subtract");
						teken = '-';
						gameOn = true;
						gameMode = 'a';
						break;
					case 'b' : System.out.println("you have chosen to add");
						teken = '+';
						gameOn = true;
						gameMode = 'b';
						break;
					case 'c' : System.out.println( "you have chosen to devide");
						teken = '/';
						gameOn = true;
						break;
					case 'd' : System.out.println("you have chosen to multiply");
						teken = '*';
						gameOn = true;						
						break;
					
					default :
						System.out.println("You have not made a choice");
				
				
					}
			}


//Create gameMode a			
			
			while (gameOver == false || gameMode == 'a') //check if gameOver == still false. If gameOver = true stop the game	
			
			{
				if (gameMode != 'a') {
					
					break;
				}
			
				if (gameMode == 'a' ) //enter game
				
				{
					
					numberOne = rdm.nextInt(maxNumber) + minNumber; //random numbers within the range of maxNumber + minNumber
					numberTwo = rdm.nextInt(maxNumber) + minNumber;
					
					if (numberTwo > numberOne) { // can't have negative numbers, so if the first number is greater than the second, we need to switch them
						
						numberOne = numberOne + numberTwo; // Add the two number e.g. One = 1 and Two = 2, now One = 3,
						numberTwo = numberOne - numberTwo; // Two = 3 - 2 = 1
						numberOne = numberOne - numberTwo; // One = 3 - 1 = 2
						
					}
					
					
					result = numberOne - numberTwo;	//calculating result
					
					System.out.println("Question " + questionNumber);
					System.out.println(numberOne + "-" + numberTwo + "= ?"); // type the question
					
					answer = input.nextInt(); //check users answer
					
					
					if (answer == result) { //check if answer is correct
						
						System.out.println("Correct!");
						
						
						questionNumber++; // question number +1
						
						maxNumber = maxNumber + 5; // make the sum harder by raising the max number by 5
						minNumber = minNumber + 1; // make the sum harder by raising the minimum value by 1
						
						
						if (questionNumber%5 == 0) //higher score if you answered %5 correctly
						{
							scoreMultiplier++; // raise scoreMultiplier
						}
						
						score = score + scoreMultiplier; //raise the score
						
						
						
					}
					
					else { //gameOver
						
						if (score < 5)
						
						{
						
						System.out.println("you suck");
						gameOver = true;
						System.out.println("Your score was " + score);
						
						} //close if
						
						else if (score < 10)
							
						{
						
						System.out.println("Okay");
						gameOver = true;
						System.out.println("Your score was " + score);
						
						} //close if
						
						else if (score < 20)
							
						{
						
						System.out.println("Nice");
						gameOver = true;
						System.out.println("Your score was " + score);
						
						} //close if
						
						else if (score < 40)
							
						{
						
						System.out.println("Well Done");
						gameOver = true;
						System.out.println("Your score was " + score);
						
						} //close if
						
						else if (score < 80)
							
						{
							
							if (score < 80)
							{
								System.out.println("Amazing");
								System.out.println("Your score was " + score);
							}
							
							else {
								System.out.println("Amazing, can't believe you kept playing this long though. This game is not THAT fun");
								gameOver = true;
								System.out.println("Your score was " + score);
							}
						} //close if
											
					} // close else
					
					
				}
			
	
		} // while
		
				
			
// close gameMode A		

			
			
			
//Create gameMode B

	do { // create loop to continue script until gameOver == true
		
			if (gameMode == 'b' ) //enter game
			
			{
				
				numberOne = rdm.nextInt(maxNumber) + minNumber; //random numbers within the range of maxNumber + minNumber
				numberTwo = rdm.nextInt(maxNumber) + minNumber;
				result = numberOne + numberTwo;	//calculating result
				
				System.out.println("Question " + questionNumber);
				System.out.println(numberOne + "+" + numberTwo + "= ?"); // type the question
				
				answer = input.nextInt(); //check users answer
				
				
				if (answer == result) { //check if answer is correct
					
					System.out.println("Correct!");
					
					
					questionNumber++; // question number +1
					
					maxNumber = maxNumber + 5; // make the sum harder by raising the max number by 5
					minNumber = minNumber + 1; // make the sum harder by raising the minimum value by 1
					
					
					if (questionNumber%5 == 0) //higher score if you answered %5 correctly
					{
						scoreMultiplier++; // raise scoreMultiplier
					}
					
					score = score + scoreMultiplier; //raise the score
					
					
					
				}
				
				else { //gameOver
					
					if (score < 5)
					
					{
					
					System.out.println("you suck");
					gameOver = true;
					System.out.println("Your score was " + score);
					
					} //close if
					
					else if (score < 10)
						
					{
					
					System.out.println("Okay");
					gameOver = true;
					System.out.println("Your score was " + score);
					
					} //close if
					
					else if (score < 20)
						
					{
					
					System.out.println("Nice");
					gameOver = true;
					System.out.println("Your score was " + score);
					
					} //close if
					
					else if (score < 40)
						
					{
					
					System.out.println("Well Done");
					gameOver = true;
					System.out.println("Your score was " + score);
					
					} //close if
					
					else if (score < 80)
						
					{
						
						if (score < 80)
						{
							System.out.println("Amazing");
							System.out.println("Your score was " + score);
						}
						
						else {
							System.out.println("Amazing, can't believe you kept playing this long though. This game is not THAT fun");
							gameOver = true;
							System.out.println("Your score was " + score);
						}
					} //close if
										
				}
				
				
			} // close gameMode b
		
		
	} // close do and gamemode B
	
	while (gameOver == false); //check if gameOver == still false. If gameOver = true stop the game
	

	} // close void
		
} // close public class
