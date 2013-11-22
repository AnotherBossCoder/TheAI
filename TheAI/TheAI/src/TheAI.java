import java.util.Scanner;
import java.util.Random;
public class TheAI {
//this is a AI
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
//_______________________________________________________________________________________________________________________
	//Random creation section
	int hello = random.nextInt(4);
	int him = random.nextInt(3);
	int unreadable = random.nextInt(3);
	int bye = random.nextInt(3);
//_______________________________________________________________________________________________________________________
	//variable creation section
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
			started = 2;
			break;
		}
		case 2:{
			System.out.println("\nNow what is your request?");	
			break;
		}}
//_______________________________________________________________________________________________________________________
	//Response
		String main;
		main = scan.nextLine().toLowerCase();
	//_______________________________________________________________________________________________________________
		//Response to "Hello"
		if(main.equals("hello")||main.equals("hi")||main.equals("hey")){
			if(hello==0){
				System.out.println("You know i'm here why do you ask");	
					hello = random.nextInt(4);
			}
			else if(hello==1){
				System.out.println("Well hello to you too, underling");
					hello = random.nextInt(4);
			}
			else if(hello==2){
				System.out.println("Hi");
					hello = random.nextInt(4);
			}
			else if(hello==3){
				System.out.println("Goodbye");	
					hello = random.nextInt(4);
			}}
	//_______________________________________________________________________________________________________________
		//Response to "Who are you"
		else if(main.equals("who are you")){
			if(him==0){
				System.out.println("I am Mathew Williams Master the third");
				him = random.nextInt(3);
			}
			else if(him==1){
				System.out.println("I already told you");
				him = random.nextInt(3);
			}
			else if(him==2){
				System.out.println("I'm not telling you");
				him = random.nextInt(3);
			}}
	//_______________________________________________________________________________________________________________
		//Response to "calculator/add/subtract/multiplication/division
		else if(main.equals("calculate")||("calculator")){
			
		}
		else if(main.eqals("add")||main.equals("addition")){
			
		}
		else if(main.equals("subtract")||main.equals("subtraction")){
			
		}
		else if(main.equals("divide")||main.equals("division")){
			
		}
		else if(main.equals("multiply")||main.equals("multiplication")||main.equals("times")){
			
		}
	//_______________________________________________________________________________________________________________
		//Response to
		
	//_______________________________________________________________________________________________________________
		//Response to "bye/quit"
		else if(main.equals("bye")||main.equals("goodbye")||main.equals("see you")||main.equals("quit")||
		main.equals("cancel")||main.equals("cya")||main.equals("see you later")||main.equals("see ya")||
		main.equals("see you")){
			if(bye==0){
				System.out.println("Well cya later");
				again = 1;
				bye = random.nextInt(3);
			}
			else if(bye==1){
				System.out.println("Well siganara idiot");
				again = 2;
				bye = random.nextInt(3);
			}
			else if(bye==2){
				System.out.println("Quiting program");
				again = 3;
				bye = random.nextInt(3);
			}
		}
	//_______________________________________________________________________________________________________________
		//Response to UNDREADABLE
		else{
			if(unreadable==0){
				System.out.println("My coders are dumb and did not let me understand that");
				unreadable = random.nextInt(3);
			}
			else if(unreadable==1){
				System.out.println("You sir are speaking jibberish");
				unreadable = random.nextInt(3);
			}
			else if(unreadable==2){
				System.out.println("I know all the languages but that is not right");
				unreadable = random.nextInt(3);
			}
		}
	}

}}
