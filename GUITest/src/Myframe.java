import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe extends JFrame{
	
	//������ �޼ҵ� constructor
	public Myframe() {
		//������ �ٸ� ����޼ҵ� ȣ�� ����!
		this.setSize(500, 600);
		this.setLocation(100, 50);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		
		JButton btn= new JButton();
		add(btn);
		
		
	}

}
