package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static int health = 11; 
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pets = JOptionPane.showInputDialog("What kind of pets do you want to buy you!"); 
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 5; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Make your pet Happy by...", "Pet Lover Tme", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cleaning up poop", "Cuddling", "Petting" }, null);
if (task==2) {
	petting(); 
}
else if (task==1) {
	cuddling(); 
}
else if (task==0){
	cleaning(); 
}
if (happinessLevel<=-101) {
	JOptionPane.showMessageDialog(null, "Your pet runs away. He is unhappy!");
	System.exit(0);
}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	private static void cleaning() {
	JOptionPane.showMessageDialog(null, "You cleaned up your pet's poop! HE IS ANGRY. HE WANTED TO EAT THE POOP!");
	JOptionPane.showMessageDialog(null, "Happiness Level decreased by 100!");
	happinessLevel -= 100; 
	}
	private static void cuddling() {
		JOptionPane.showMessageDialog(null, "You cuddle your pet!");
		JOptionPane.showMessageDialog(null, "Your pet is happy; +10");
		JOptionPane.showMessageDialog(null, "You cuddle him to aggressively; Your pet scratches you. +100 happiness; -10 health;");
		happinessLevel += 100; 
		health -= 10; 
		if(health<=0) {
			JOptionPane.showMessageDialog(null, "You died to your pet! Weekling!");
			System.exit(0);
		}
	}
	private static void petting() {
		JOptionPane.showMessageDialog(null, "You pet your pet!");
		JOptionPane.showMessageDialog(null, "Your pet is happy; +10");
		JOptionPane.showMessageDialog(null, "You pet him to aggressively; Your pet scratches you. +100 happiness; -10 health;");
		happinessLevel += 100; 
		health -= 10; 
		if(health<=0) {
			JOptionPane.showMessageDialog(null, "You died to your pet! Weekling!");
			System.exit(0);
		}
	}
		
		
	}
