package tutorial_02;

import javax.swing.JOptionPane;

public class CylinderUsingJOptionPane {

	public static void main(String[] args) {
		// declare the variables
		double radius, length, area, volume;
		
		// Enter radius of the cylinder
	    String radiusString = JOptionPane.showInputDialog(null,
	      "Enter radius of the cylinder",
	      "Compute the volume of cylinder", JOptionPane.QUESTION_MESSAGE);

	 // Convert string to double
	    radius = Double.parseDouble(radiusString);
	    
	    
	 // Enter radius of the cylinder
	    String lenghtString = JOptionPane.showInputDialog(null,
	      "Enter length of the cylinder",
	      "Compute the volume of cylinder", JOptionPane.QUESTION_MESSAGE);

	 // Convert string to double
	    length = Double.parseDouble(radiusString);

	 // compute the formula
 		area = radius * radius * Math.PI;
 		volume = area * length;
 		
 	// Display output to dialog box
 	    JOptionPane.showMessageDialog(null, "The volume of the cylinder is " +
 	        volume);


	}

}
