package random;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		
	String d=JOptionPane.showInputDialog(null, "how old are you?");
	int s = Integer.parseInt(d);
	if(s>18) {
		JOptionPane.showMessageDialog(null, "who da you think is the next president");
	}if(s<18) {
			JOptionPane.showMessageDialog(null, "you can't vote");	
}
	
}
}
