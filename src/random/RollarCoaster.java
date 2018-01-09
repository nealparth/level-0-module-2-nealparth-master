package random;

import javax.swing.JOptionPane;

public class RollarCoaster {
public static void main(String[] args) {
	String d=JOptionPane.showInputDialog(null, "What is your height?");
	int s = Integer.parseInt(d);
	if(s>48) {
		JOptionPane.showMessageDialog(null, "you can go on the rollercoaster");
	}if(s<48) {
			JOptionPane.showMessageDialog(null, "grow taller");	
}
	
}
}

