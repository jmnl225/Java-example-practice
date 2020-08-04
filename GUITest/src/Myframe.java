import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe extends JFrame{
	
	//생성자 메소드 constructor
	public Myframe() {
		//본인의 다른 멤버메소드 호출 가능!
		this.setSize(500, 600);
		this.setLocation(100, 50);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		
		JButton btn= new JButton();
		add(btn);
		
		
	}

}
