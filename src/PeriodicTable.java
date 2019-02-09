import java.util.*;

/**
 * @author Mohammad Abdul Ahad Khan
 * @version 1.0
 * 
 * This class contains the main method where the mechanics of a user inputing a correct 
 * integer value results in the output of an element's information. 
 */

public class PeriodicTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Objects of ChemistryDialogue type.
		ChemistryDialogue yourName = new ChemistryDialogue();
		ChemistryDialogue table = new ChemistryDialogue();

		System.out.println("What is your name young grasshopper? You shall be my student!"); // An introduction to the user and asks for their name.

		String name = scan.nextLine(); // Scans the name the user puts in.
		yourName.enterYourName(name); // Prints out a greeting with the user's name included.

		// Introduction to the user of the available elements.
		System.out.println("There are many wonderful elements in chemistry. Type in a number between 1 and 118 to "
				+ "\nlearn more about the element of your choice!");
		
		int element = scan.nextInt(); // Scans the number of the element the user wishes to learn more about.
		
		// A while loop that continues as long as 0 isn't entered. 
		while (element > 0 || element < 0) {
			// A switch statement that provides the user with the corresponding information about an element when they input a number.
			// If the number they input isn't one of the 118 elements, the default statement is printed out.
			switch(element) {
			case 1:
				table.hydrogen();
				break;
			case 2:
				table.helium();
				break;
			case 3: 
				table.lithium();
				break;
			case 4:
				table.beryllium();
				break;
			case 5:
				table.boron();
				break;
			case 6:
				table.carbon();
				break;
			case 7:
				table.nitrogen();
				break;
			case 8: 
				table.oxygen(name);
				break;
			case 9:
				table.flourine();
				break;
			case 10:
				table.neon();
				break;
			case 11:
				table.sodium();
				break;
			case 12:
				table.magnesium();
				break;
			case 13:
				table.aluminium();
				break;
			case 14:
				table.silicon();
				break;
			case 15:
				table.phosphorous();
				break;
			case 16:
				table.sulfur();
				break;
			case 17:
				table.chlorine();
				break;
			case 18:
				table.argon();
				break;
			case 19:
				table.potassium();
				break;
			case 20:
				table.calcium();
				break;
			case 21:
				table.scandium();
				break;
			case 22:
				table.titanium();
				break;
			case 23:
				table.vanadium();
				break;
			case 24:
				table.chromium();
				break;
			case 25: 
				table.manganese();
				break;
			case 26:
				table.iron();
				break;
			case 27:
				table.cobalt(name);
				break;
			case 28:
				table.nickel();
				break;
			case 29:
				table.copper();
				break;
			case 30:
				table.zinc();
				break;
			case 31:
				table.gallium();
				break;
			case 32:
				table.germanium();
				break;
			case 33:
				table.arsenic();
				break;
			case 34:
				table.selenium();
				break;
			case 35:
				table.bromine();
				break;
			case 36:
				table.krypton();
				break;
			case 37:
				table.rubidium();
				break;
			case 38:
				table.strontium();
				break;
			case 39:
				table.yttrium();
				break;
			case 40:
				table.zirconium();
				break;
			case 41:
				table.niobium();
				break;
			case 42:
				table.molybdenum();
				break;
			case 43:
				table.technetium();
				break;
			case 44:
				table.ruthenium();
				break;
			case 45:
				table.rhodium();
				break;
			case 46:
				table.palladium();
				break;
			case 47:
				table.silver(name);
				break;
			case 48:
				table.cadmium();
				break;
			case 49:
				table.indium();
				break;
			case 50:
				table.tin();
				break;
			case 51:
				table.antimony();
				break;
			case 52:
				table.tellurium();
				break;
			case 53:
				table.iodine();
				break;
			case 54:
				table.xenon();
				break;
			case 55:
				table.caesium();
				break;
			case 56: 
				table.barium();
				break;
			case 57:
				table.lanthanum();
				break;
			case 58:
				table.cerium();
				break;
			case 59:
				table.praseodymium();
				break;
			case 60:
				table.neodymium();
				break;
			case 61:
				table.promethium();
				break;
			case 62:
				table.samarium();
				break;
			case 63:
				table.europium();
				break;
			case 64:
				table.gadolinium();
				break;
			case 65:
				table.terbium();
				break;
			case 66:
				table.dysprosium();
				break;
			case 67:
				table.holmium();
				break;
			case 68:
				table.erbium();
				break;
			case 69:
				table.thulium();
				break;
			case 70: 
				table.ytterbium();
				break;
			case 71:
				table.lutetium();
				break;
			case 72:
				table.hafnium();
				break;
			case 73:
				table.tantalum();
				break;
			case 74:
				table.tungsten();
				break;
			case 75:
				table.rhenium();
				break;
			case 76:
				table.osmium();
				break;
			case 77:
				table.iridium();
				break;
			case 78: 
				table.platinum();
				break;
			case 79:
				table.gold();
				break;
			case 80:
				table.mercury();
				break;
			case 81:
				table.thallium();
				break;
			case 82:
				table.lead();
				break;
			case 83:
				table.bismuth();
				break;
			case 84: 
				table.polonium(name);
				break;
			case 85:
				table.astatine();
				break;
			case 86:
				table.radon();
				break;
			case 87:
				table.francium();
				break;
			case 88:
				table.radium();
				break;
			case 89:
				table.actinium();
				break;
			case 90:
				table.thorium();
				break;
			case 91:
				table.protactinium(name);
				break;
			case 92:
				table.uranium(name);
				break;
			case 93:
				table.neptunium();
				break;
			case 94:
				table.plutonium(name);
				break;
			case 95:
				table.americium();
				break;
			case 96:
				table.curium();
				break;
			case 97:
				table.berkelium();
				break;
			case 98:
				table.californium();
				break;
			case 99:
				table.einsteinium();
				break;
			case 100: 
				table.fermium();
				break;
			case 101: 
				table.mendelevium();
				break;
			case 102:
				table.nobelium();
				break;
			case 103:
				table.lawrencium();
				break;
			case 104:
				table.rutherfordium();
				break;
			case 105:
				table.dubnium();
				break;
			case 106:
				table.seaborgium();
				break;
			case 107:
				table.bohrium();
				break;
			case 108:
				table.hassium();
				break;
			case 109:
				table.meitnerium();
				break;
			case 110:
				table.darmstadtium();
				break;
			case 111:
				table.roentgenium(name);
				break;
			case 112:
				table.copernicium();
				break;
			case 113:
				table.nihonium();
				break;
			case 114:
				table.flerovium();
				break;
			case 115:
				table.moscovium();
				break;
			case 116:
				table.livermorium();
				break;
			case 117:
				table.tennessine();
				break;
			case 118:
				table.oganesson();
				break;
			default:
				// Printed out if the user puts in an invalid number.
				System.out.println("------------------------------------------------------------------------------------------------------------------"
						+ "\nYou have chosen an invalid element! "
						+ "\nWho knows, maybe that element actually exists! Unfortunately, this isn't the future yet... "
						+ "\nPlease select a number between 1 and 118."
						+ "\n------------------------------------------------------------------------------------------------------------------"); 
				break;
			} // Switch statement ends.
			
			// Asks the user for the next input.
			System.out.println("");
			System.out.println("Would you like to know more " + name + "? Type an element number between 1 and 118 to continue or 0 to exit.");
			element = scan.nextInt();
		} // While loop ends.
	} // Main method ends.
} 