package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet=JOptionPane.showInputDialog(null, "What type of pet would you like?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
for (int i = 0; i < 1000000000; i++) {
	

			int task = JOptionPane.showOptionDialog(null, "Which would you like to do to make your " + pet  + " happy?", pet, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "feed", "take for a walk", "cuddle" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if(task == 0) {
	feed();
}
if(task==1) {
	walk();
}
if(task ==2) {
	cuddle();
}
if(happinessLevel>=20) {
	break;
}
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
JOptionPane.showMessageDialog(null, "Congratulations! You love your " + pet + "! Now do that 3 times a day, and it will be like you have an actual pet!");

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

	static void feed() {
		JOptionPane.showMessageDialog(null, "munch, munch!");
		happinessLevel=happinessLevel+4;
	}
static void walk() {
	JOptionPane.showMessageDialog(null, "Yay! Time for a walk!");
	happinessLevel=happinessLevel+2;
}
static void cuddle() {
	JOptionPane.showMessageDialog(null, "*insert snuggle pet noises here");
	happinessLevel=happinessLevel+3;
}}