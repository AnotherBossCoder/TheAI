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
	int omam = random.nextInt(20);
	int him = random.nextInt(3);
	int unreadable = random.nextInt(3);
	int bye = random.nextInt(3);
//_______________________________________________________________________________________________________________________
	//OMAMA vocab
	String omam1 = "morose"; String omam2 = "complacent"; String omam3 = "pugnacion"; String omam4 = "deragatory";
	String omam5 = "pantamime"; String omam6 = "crafty"; String omam7 = "scuttle"; String omam8 = "ego"; 
	String omam9 = "monotonous"; String omam10 = "sulk"; String omam11 = "wry" String omam12 = "reprehensive";
	String omam13 = "meager"; String omam14 = "mander"; String omam15 = "belligerent";
	String omam16 = "mollify"; String omam17 = "scoff"; String omam18 = "drone"; String omam19 = "aloof";
	String omam20 = "bemuse";
	String omams;
	//Definitions
	String omamd1 = "sullen and ill tempered"; String omamd2 = "showing satisfaction with oneself";
	String omamd3 = "quick to fight"; String omamd4 = "showing critical or disrespectful attitidue";
	String omamd5 = "extravagnt mimeing"; String omamd6 = "skillful in underhand or evil schemes";
	String omamd7 = "a deep bucket for carrying coal"; String omamd8 = "the slef of any person";
	String omamd9 = "lacking in variety"; String omamd10 = "sullen movements while remaining silent";
	String omamd11 = "dry mocking humor"; String omamd11 = "desiring consentation or punnishment";
	String omamd13 = "of small quantity or quality" String omamd14 = "a trough where de is by livestock";
	String omamd15 = "hostile/agressive"; String omamd16 "to apeas anger";
	String omamd17 = "a continus low humming sound"; String omamd18 = "to talk in a scornful or moking way";
	String omamd19 = "at a distance/ apart"; String omamd20 = "to cause to be bewildered";
	
//_______________________________________________________________________________________________________________________
	//variable creation section
	int started = 1;
	int vocab;
	int omamc;
	int flashchoice = 1;
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
		else if(main.eqals("add")||main.equals("addition")||main.equals("plus")){
			
		}
		else if(main.equals("subtract")||main.equals("subtraction")||main.equals("minus")){
			
		}
		else if(main.equals("divide")||main.equals("division")){
			
		}
		else if(main.equals("multiply")||main.equals("multiplication")||main.equals("times")){
			
		}
	//_______________________________________________________________________________________________________________
		//Response to "Vocab"
		else if(main.equals("vocab")||main.equals("vocabulary")){
			System.out.println("What vocabulary would you like");
			System.out.println("1. Of Mice and Men");
			vocab = scan.nextInt();
			if(vocab == 1){
				while(vocab == 1){
					if(flashchoice==1){
						if(omam == 0){omams = omam1;flashchoice=2;omamc = 1;flashchoice = 2;
						omamd1 = omamc1;}
						else if(omam == 1){omams = omam2;flashchoice=2;omamc = 2;flashchoice = 2;
						omamd2 = omamc2;}
						else if(omam == 2){omams = omam3;flashchoice=2;omamc = 3;flashchoice = 2;
						omamd3 = omamc3;}
						else if(omam == 3){omams = omam4;flashchoice=2;omamc = 4;flashchoice = 2;
						omamd4 = omamc4;}
						else if(omam == 4){omams = omam5;flashchoice=2;omamc = 5;flashchoice = 2;
						omamd5 = omamc1;}
						else if(omam == 5){omams = omam6;flashchoice=2;omamc = 6;flashchoice = 2;
						omamd6 = omamc2;}
						else if(omam == 6){omams = omam7;flashchoice=2;omamc = 7;flashchoice = 2;
						omamd7 = omamc3;}
						else if(omam == 7){omams = omam8;flashchoice=2;omamc = 8;flashchoice = 2;
						omamd8 = omamc4;}
						else if(omam == 8){omams = omam9;flashchoice=2;omamc = 9;flashchoice = 2;
						omamd9 = omamc1;}
						else if(omam == 9){omams = omam10;flashchoice=2;omamc = 10;flashchoice = 2;
						omamd10 = omamc2;}
						else if(omam == 10){omams = omam11;flashchoice=2;omamc = 11;flashchoice = 2;
						omamd11 = omamc1;}
						else if(omam == 11){omams = omam12;flashchoice=2;omamc = 12;flashchoice = 2;
						omamd12 = omamc1;}
						else if(omam == 12){omams = omam13;flashchoice=2;omamc = 13;flashchoice = 2;
						omamd13 = omamc1;}
						else if(omam == 13){omams = omam14;flashchoice=2;omamc = 14;flashchoice = 2;
						omamd14 = omamc1;}
						else if(omam == 14){omams = omam15;flashchoice=2;omamc = 15;flashchoice = 2;
						omamd15 = omamc1;}
						else if(omam == 15){omams = omam16;flashchoice=2;omamc = 16;flashchoice = 2;
						omamd16 = omamc1;}
						else if(omam == 16){omams = omam17;flashchoice=2;omamc = 17;flashchoice = 2;
						omamd17 = omamc1;}
						else if(omam == 17){omams = omam18;flashchoice=2;omamc = 18;flashchoice = 2;
						omamd18 = omamc1;}
						else if(omam == 18){omams = omam19;flashchoice=2;omamc = 19;flashchoice = 2;
						omamd19 = omamc1;}
						else if(omam == 19){omams = omam20;flashchoice=2;omamc = 20;flashchoice = 2;
						omamd20 = omamc1;}}
					System.out.println("\nWhat is "+ omams +" mean");
					System.out.println("1. "+omamc1);
					System.out.println("2. "+omamc2);
					System.out.println("3. "+omamc3);
					System.out.println("4. "+omamc4);
					if(){
						
					}
					else if(){
						
					}
					else if{
						
					}
					else if{
						
					}
					else{
						System.out.println("That is not an option");	
					}
				}	
			}
		}
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
