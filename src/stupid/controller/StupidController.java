package stupid.controller;

import java.util.Scanner;

public class StupidController
{
	private String myName;
	private Scanner inputReader;

	public StupidController()
	{
		myName = "Ammar Nazir";
		inputReader = new Scanner(System.in);
	}

	public void start()
	{
		System.out.println("this program is less stupid");
		System.out.println(myName);
		askQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("How was your day?");
		String input = inputReader.nextLine();
		System.out.println("Oh, you said: " + input + " about your day. Nice bro ");
		
		System.out.println("My next question is this: What is the best type of food?");
		String foodInput = inputReader.next();
		System.out.println("OK, you typed this: " + foodInput);
		
		System.out.println("Another question: What is one of your hobbies?");
		String hobbyInput = inputReader.next();
		System.out.println("Oh, you like: " + hobbyInput);
		
		System.out.println("I have to ask: What is your favorite class in school?");
		String schoolInput = inputReader.next();
		System.out.println("Whoa, I also like " + schoolInput);
		
		System.out.println("Just curious: When is your birthday?");
		String birthdayInput = inputReader.next();
		System.out.println("Nice. Mine is close to " + birthdayInput);
		
		
		
	}
	
}
