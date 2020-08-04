import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonEventTest extends JFrame{
	
	//컴포넌트들의 참조변수는 멤버변수로 만드는 것이 좋음.
	JButton btn;    //기본값 null
	JLabel label;   //기본값 null
	
	JLabel imgLabel;
	JButton btn2;
	
	public ButtonEventTest() {
		// TODO Auto-generated constructor stub
		setTitle("Button click Event");
		setSize(400, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//컴포넌트들 추가하기
		JPanel panel= new JPanel();//패널객체 생성
		// * JPanel은 기본적으로 FlowLayout으로 지정되어 있음.
		
		//패널에 컴포넌트들 붙이기
		//지역변수로 만들면 이 컴포넌트들을 제어하기가 어려워짐!!
		//그래서 가급적 컴포넌트 참조변수들은 멤버변수로 만들것을 권장함!!!
		//JButton btn= new JButton("button");
		//JLabel label= new JLabel("Hello world");
		btn= new JButton("button");
		label= new JLabel("Hello world");
		
		panel.add(btn);
		panel.add(label);
		
		//패널을 프레임에 붙이기
		add(panel);
		
		//버튼(btn)을 클릭했을 때 JLabel(label)의 글씨 변경
		
		//버튼이 클릭되는 액션(Action)을 듣는 리스너(스토커)객체 생성 및 버튼 달기!!
		//ActionListener는 인터페이스여서 직접 new를 이용해서 객체 생성 불가!!
		//ActionListener listener= new ActionListener(); //error
		//인터페이스 구현(implements)한 새로운 클래스를 정의해서 객체로 생성하여 사용
		// ActioinListener 인터페이스를 구현한 ClickListener클래스 설계
		//ClickListener listener= new ClickListener();
		
		//위처럼 해도 되지만... 별도의 class를 만들고 이름을 명명하는 과정이
		//생각보다 짜증!!
		//별도의 클래스를 새로만들기 보다는 익명클래스를 만들어 쓰는 경우가 더 많음
		ActionListener listener= new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("익명클래스 이용!!!");				
			}			
		};		
		
		//위에서 만든 리스너객체를 Button(btn)객체에 추가..
		btn.addActionListener(listener);
		
		
		
		//이미지 변경
		imgLabel= new JLabel();
		ImageIcon icon= new ImageIcon("images/ms16.png");
		
		Image img= icon.getImage();
		img= img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		icon= new ImageIcon(img);//새로운 사이즈의 이미지아이콘 객체 생성
		
		imgLabel.setIcon(icon);		
		panel.add(imgLabel);
		
		btn2= new JButton("change image");
		panel.add(btn2);
		
		//버튼 클릭시에 이미지 변경
		btn2.addActionListener(  new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//이미지 변경
				ImageIcon icon= new ImageIcon("images/ms19.png");
				Image img= icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				icon= new ImageIcon(img);				
				imgLabel.setIcon(icon);
				
			}
		} );
		
	
		
	
		
		
		
		
		
		setVisible(true);		
	}//constructor

	
	// ActionListener를 구현한 새로운 Inner클래스 정의////////////
	class ClickListener implements ActionListener{

		//이 리스너객체가 바라보고 있는 버튼이 클릭되면 자동으로 발동하는 콜백(call back)메소드
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("clicked!!!!");
			
			//JLabel객체(label)의 글씨 변경!!
			//생성자메소드 안에 있는 지역변수 label은 다른 메소드에서는
			//인식할 수 없음...
			//멤버변수로 만들면 그 클래스 안에서는 어디서든 인식됨
			label.setText("Nice to meet you.");
		}		
		
	}/////////////////////////////////////////////////////
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEventTest();
	}

}//class....






