package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class skill_practice {


		public static void main(String[] args) {

		skill_practice skills = new skill_practice();
		           //skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		}

		/*void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
String x = JOptionPane.showInputDialog(null, "How many dimes do you have?");
int num = Integer.parseInt(x);



		// Tell them how many cents they have (hint multiply by 10)

JOptionPane.showMessageDialog(null, "You have " + 10*num + " cents.");


		// Ask the user how tall they are (inches)

String in = JOptionPane.showInputDialog("How tall are you? (inches, please!)");
int height = Integer.parseInt(in);


		// If they are shorter than 36 inches, tell them to eat their Wheaties
if (height<36) {
	JOptionPane.showMessageDialog(null, "Eat yout Wheaties!");
}



		}*/

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console 

for (int i = 1; i < 30; i++) {
	if(i%3==0) {
		System.out.println(i);
	}
}





		}

		void skill3() { // Get a random number that is less than 20 and print it to the console 

Random x=new Random();
int number=x.nextInt(20);
		// Get another random number that is less than 10 and print it to the console 
Random y= new Random();
int number2=y.nextInt(10);


		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
int z=number-number2;
JOptionPane.showMessageDialog(null, "The difference between your two numbers is " + z + ".");

		}

		void skill4() { // In a pop-up, ask the user for the city they live in 

String city =JOptionPane.showInputDialog(null, "What city do you live in?");

		// If they answered "San Diego", tell them they live in America's Finest City 

if(city.equals("San Diego")){
	JOptionPane.showMessageDialog(null, "You live in America's Finest City.");
}

		// Otherwise, tell them to move to San Diego 
else {
	JOptionPane.showMessageDialog(null, "You should move to San Diego.");
}


		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
int cars=4;

if (cars==0) {
	JOptionPane.showMessageDialog(null, "You must use public transportation a lot!");
}


		// If there is 1 car, use a pop-up to display the make/model of the car 
else if(cars==1) {
JOptionPane.showMessageDialog(null, "Your car is a BMW.");}

		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
else {
JOptionPane.showMessageDialog(null, "Your car(s) have " + 4*cars + " wheels.");}

		}

		void skill5() { // In a pop-up, ask the user for the name of their school 

String school=JOptionPane.showInputDialog("What is the name of your school?");

		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 

JOptionPane.showMessageDialog(null, school + " is a fantastic school!");

		}
		}


