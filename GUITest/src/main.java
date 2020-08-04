import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//GUI 맛보기 위해 Swing을 사용
		
		
		//1. 최상위 컨테이너 객체 생성
		JFrame frame= new JFrame("GUI Test");
		frame.setSize(500, 400);
		
		//*컴포넌트를 추가하기 전에 배치관리자(Layout Manager)를 지정해야
		// 원하는 포지션에 컴포넌트들이 놓여질 수 있음
		// 여러 배치관리자 중에서 가장 간단한 Flowlayout을 지정
		
		LayoutManager layoutManager= new FlowLayout(); //모든컴포넌트를 옆으로 배치
		frame.setLayout(layoutManager);
		
		
		//2. 컴포넌트 추가
		JButton b1= new JButton("button #1");
		JButton b2= new JButton("button #2");
		
		//JFrame에 버튼 추가하기
		frame.add(b1);
		frame.add(b2);
		
		//JLable 글씨를 보여주는 컴포넌트
		JLabel label= new JLabel("This is a Lable");
		frame.add(label);
		
		
		//JTextField- 사용자로부터 글씨 입력받는 컴포넌트
		JTextField tf= new JTextField(20); //최소 20글자 사이즈
		frame.add(tf);
		
		
		//이미지 - Java에는 이미지용 컴포넌트가 없음.
		//JLabel에 아이콘(이미지)을 보여주는 기능 이용.
		
		//JLabel에 설정할 아이콘 이미지 객체를 먼저 생성해야함.
		ImageIcon icon= new ImageIcon("images/dog1.jpg");
		//원본 사이즈로 설정되어있음.
		//이미지를 리사이징 - > imageicon객체 안의 진짜 이미지를 갖고있는 또 다른 객체(=image)를 추출
		Image img= icon.getImage();
		//뽑아온 이미지 객체를 이용하여 새로운 사이즈의 이미지 새로 만들기
		Image img2= img.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
		
		//새로 만들어진 img2를 JLabel에 설정하기 위해 새로운 ImageIcon객체 생성
		ImageIcon icon2= new ImageIcon(img2);
		
		JLabel imgLabel= new JLabel();
		imgLabel.setIcon(icon2);
		
		
		//3. JFrmae 화면에 보이기
		//기본적으로 JFrame은 X버튼을 누르면 창은 없어지지만 프로그램의 Main thread는 멈추지 않음
		//그래서 이를 같이 종료되게 하려면..
		
		frame.add(imgLabel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(300, 200); // 프레임의 좌상단위 좌표[위치]
		
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
