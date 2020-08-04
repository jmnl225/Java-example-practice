import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonEventTest extends JFrame{
	
	//������Ʈ���� ���������� ������ ��������� ������ ��.
	JButton btn;
	JLabel label;
	
	JLabel imgLabel;
	JButton btn2;
	
	public ButtonEventTest() {
		// TODO Auto-generated constructor stub
		
		setTitle("Button click Event");
		setSize(600, 550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//������Ʈ�� �߰��ϱ�
		JPanel panel= new JPanel(); //�гΰ�ü ����
		// JPanel�� �⺻������ FlowLayout���� ������
		
		
		//�гο� ������Ʈ�� ���̱�
		//���������� ����� �� ������Ʈ�� ��� �����...
		// ������ ������Ʈ ������������ ��������� ������� ����
//		JButton btn= new JButton("button");
//		JLabel label= new JLabel("Hello world");
		
		btn= new JButton("button");
		label= new JLabel("Hello World");
		
		panel.add(btn);
		panel.add(label);
		
		//�г��� �����ӿ� ���̱�
		add(panel);
		
		//��ư(btn)�� Ŭ������ �� JLabel(label)�� �۾� ����
		
		//��ư�� Ŭ���Ǵ� �׼�(Action)�� ��� �����ʰ�ü ���� �� ��ư �ޱ�
		//ActionListener�� �������̽����� ���� new�� �̿��� ��ü���� �Ұ�!
		//ActionListener listener=new ActionListener();		
		
		//�������̽��� ����(implements) �� ���ο� Ŭ������ �����ؼ� ��ü�� �����Ͽ� ���
		// ActionListener �������̽��� ������ ClickListener Ŭ������ ����
//		ClickListener listener= new ClickListener();
		
		//��ó�� �ص� ������ ������ class�� ����� ����ϴ� ���� ����
		
		//�����δ� ������ Ŭ������ ����⺸�� �͸�Ŭ������ �� ���� ��
		ActionListener listener= new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("�͸�Ŭ���� �̿�!!!");				
			}			
		};	
		
		/*ActionListener listener= new ActionListnener() {
			private void ActionP(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("�͸�Ŭ���� �̿�!");

			}
			
		};*/
		
		
		
		//������ ���� �����ʰ�ü�� Button(btn)��ü�� ����
		btn.addActionListener(listener);
		
		
		
		//�̹��� ����
		imgLabel= new JLabel();
		ImageIcon icon= new ImageIcon("images/dog1.jpg");
		
		Image img= icon.getImage();
		img.getScaledInstance(100, 200, Image.SCALE_SMOOTH);
		icon= new ImageIcon(img); //���ο� �������� �̹��������� ��ü ����
		
		imgLabel.setIcon(icon);
		
		btn2= new JButton("change image");
		panel.add(btn2);
		panel.add(imgLabel);
		
		//��ư Ŭ�� �� �̹��� ����
		
		
		btn2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�̹��� ����
				ImageIcon icon= new ImageIcon("images/dog2.jpg");
				Image img=icon.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
				
				icon= new ImageIcon(img);
				
				imgLabel.setIcon(icon);
			}
		});
		
		
		setVisible(true);
		
	}// constructor end.
	
	
	//ActionListener�� ������ ���ο� InnerŬ���� ����///////////////////////////////////////////////////////////////
	
	class ClickListener implements ActionListener{
		
		//�� �����ʰ�ü�� �ٶ󺸰� �ִ� ��ư�� Ŭ���Ǹ� �ڵ����� �ߵ��ϴ� �ݹ�(call back) �޼ҵ�
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Clicked XD");
			
			
			//Jlabel ��ü(label)�� �۾� ����!
			//�����ڸ޼ҵ� �ȿ� �ִ� �������� label�� �ٸ� �޼ҵ忡���� �ν��� �� ����
			//�ν��� �� ����..
			//��������� ����� �� Ŭ���� �ȿ����� ��𼭵� �ν� ��
			label.setText("Nice to Meet you.");
			
		}
		
	}/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	public static void main(String[] args) {
		
		new ButtonEventTest();

		
		
	} // mainthread end.

}//main end.
