import java.util.Scanner;
import java.util.Random;
public class TheAI {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
//_______________________________________________________________________________________________________________________
	//Variable Creation Section
	int hello = random.nextInt(4);
	String name = ("Master");
	int again = 0;//This variable will preform a lot like a boolean.
//_______________________________________________________________________________________________________________________
	//Main Line
	while(again==0){
	System.out.println("Hello there human i'm "+name);
	System.out.println("What is your request?");
//_______________________________________________________________________________________________________________________
	//Response
	String main;
	main = scan.nextLine();
	//_______________________________________________________________________________________________________________
		//Response to "Hello"
		if(main.equals("hello")||(main.equals("Hello")){
			if(hello==1){
				System.out.println("Well hello to you too, underling");
			}
			else if(hello==2){
				System.out.println("Hi");
			}
			else if(hello==3){
				System.out.println("Goodbye");	
			}
	//_______________________________________________________________________________________________________________
		//Response to 
		}
	}

}
