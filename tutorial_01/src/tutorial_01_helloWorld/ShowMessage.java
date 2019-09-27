package tutorial_01_helloWorld;
import javax.swing.JOptionPane;

public class ShowMessage {
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null, "Message", "Window Title", 
		JOptionPane.INFORMATION_MESSAGE);
	}
}
