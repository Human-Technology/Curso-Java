import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PruebaCMD{
	
	public static void main(String [] args) {
		
		JFrame jf = new JFrame();
		JPanel panel = new JPanel();
		JLabel jl = new JLabel("Hola Humano");
		
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("Human");
		jf.setSize(500, 300);
		
		panel.add(jl);
		
		
		jf.add(panel);
		
		
		jf.setVisible(true);
	}	
}