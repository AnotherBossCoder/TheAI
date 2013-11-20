import java.util.Scanner;
import java.util.Random;
public class TheAI {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
//_______________________________________________________________________________________________________________________
	//Variable Creation Section
	int hello = random.nextInt(4);
	int him = random.nextInt(3);
	int unreadable = random.nextInt(3);
	int started = 1;
	String name = ("Master");
	int again = 0;//This variable will preform a lot like a boolean.
//_______________________________________________________________________________________________________________________
	//Main Line
	while(again==0){
		switch(started){
		case 1:{
			System.out.println("Hello there human i'm "+name);
			System.out.println("\nWhat is your request?");
			break;
		}
		case 2:{
			System.out.println("\nNow what is your request?");	
			break;
		}}
//_______________________________________________________________________________________________________________________
	//Response
		String main;
		main = scan.nextLine().toLowerCase;
	//_______________________________________________________________________________________________________________
		//Response to "Hello"
		if(main.equals("hello")||main.equals("hi")||main.equals("hey")){
			if(hello==0){
				System.out.println("You know i'm here why do you ask");	
			}
			else if(hello==1){
				System.out.println("Well hello to you too, underling");
			}
			else if(hello==2){
				System.out.println("Hi");
			}
			else if(hello==3){
				System.out.println("Goodbye");	
			}}
	//_______________________________________________________________________________________________________________
		//Response to "Who are you"
		if(main.equals("who are you")){
			if(him==0){
				System.out.println("I am Mathew Williams Master the third");
			}
			else if(him==1){
				System.out.println("I already told you");
			}
			else if(him==2){
				System.out.println("I'm not telling you");
			}}
	//_______________________________________________________________________________________________________________
		//Response to "calculator/add/subtract/multiplication/division
		
		
	//_______________________________________________________________________________________________________________
		//Response to
		
	//_______________________________________________________________________________________________________________
		//Response to
		
	//_______________________________________________________________________________________________________________
		//Response to UNDREADABLE
		else{
			if(unreadable == 0){
				System.out.println("My coders are dumb and did not let me understand that");
			}
			else if(unreachable==1){
				System.out.println("You sir are speaking jibberish");
			}
			else if(unreachable==2){
				System.out.println("I know all the languages but that is not right")
			}
		}
	}

}
