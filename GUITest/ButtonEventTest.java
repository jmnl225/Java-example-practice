import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonEventTest extends JFrame{
	
	//������Ʈ���� ���������� ��������� ����� ���� ����.
	JButton btn;    //�⺻�� null
	JLabel label;   //�⺻�� null
	
	JLabel imgLabel;
	JButton btn2;
	
	public ButtonEventTest() {
		// TODO Auto-generated constructor stub
		setTitle("Button click Event");
		setSize(400, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//������Ʈ�� �߰��ϱ�
		JPanel panel= new JPanel();//�гΰ�ü ����
		// * JPanel�� �⺻������ FlowLayout���� �����Ǿ� ����.
		
		//�гο� ������Ʈ�� ���̱�
		//���������� ����� �� ������Ʈ���� �����ϱⰡ �������!!
		//�׷��� ������ ������Ʈ ������������ ��������� ������� ������!!!
		//JButton btn= new JButton("button");
		//JLabel label= new JLabel("Hello world");
		btn= new JButton("button");
		label= new JLabel("Hello world");
		
		panel.add(btn);
		panel.add(label);
		
		//�г��� �����ӿ� ���̱�
		add(panel);
		
		//��ư(btn)�� Ŭ������ �� JLabel(label)�� �۾� ����
		
		//��ư�� Ŭ���Ǵ� �׼�(Action)�� ��� ������(����Ŀ)��ü ���� �� ��ư �ޱ�!!
		//ActionListener�� �������̽����� ���� new�� �̿��ؼ� ��ü ���� �Ұ�!!
		//ActionListener listener= new ActionListener(); //error
		//�������̽� ����(implements)�� ���ο� Ŭ������ �����ؼ� ��ü�� �����Ͽ� ���
		// ActioinListener �������̽��� ������ ClickListenerŬ���� ����
		//ClickListener listener= new ClickListener();
		
		//��ó�� �ص� ������... ������ class�� ����� �̸��� ����ϴ� ������
		//�������� ¥��!!
		//������ Ŭ������ ���θ���� ���ٴ� �͸�Ŭ������ ����� ���� ��찡 �� ����
		ActionListener listener= new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("�͸�Ŭ���� �̿�!!!");				
			}			
		};		
		
		//������ ���� �����ʰ�ü�� Button(btn)��ü�� �߰�..
		btn.addActionListener(listener);
		
		
		
		//�̹��� ����
		imgLabel= new JLabel();
		ImageIcon icon= new ImageIcon("images/ms16.png");
		
		Image img= icon.getImage();
		img= img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		icon= new ImageIcon(img);//���ο� �������� �̹��������� ��ü ����
		
		imgLabel.setIcon(icon);		
		panel.add(imgLabel);
		
		btn2= new JButton("change image");
		panel.add(btn2);
		
		//��ư Ŭ���ÿ� �̹��� ����
		btn2.addActionListener(  new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�̹��� ����
				ImageIcon icon= new ImageIcon("images/ms19.png");
				Image img= icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				icon= new ImageIcon(img);				
				imgLabel.setIcon(icon);
				
			}
		} );
		
	
		
	
		
		
		
		
		
		setVisible(true);		
	}//constructor

	
	// ActionListener�� ������ ���ο� InnerŬ���� ����////////////
	class ClickListener implements ActionListener{

		//�� �����ʰ�ü�� �ٶ󺸰� �ִ� ��ư�� Ŭ���Ǹ� �ڵ����� �ߵ��ϴ� �ݹ�(call back)�޼ҵ�
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("clicked!!!!");
			
			//JLabel��ü(label)�� �۾� ����!!
			//�����ڸ޼ҵ� �ȿ� �ִ� �������� label�� �ٸ� �޼ҵ忡����
			//�ν��� �� ����...
			//��������� ����� �� Ŭ���� �ȿ����� ��𼭵� �νĵ�
			label.setText("Nice to meet you.");
		}		
		
	}/////////////////////////////////////////////////////
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEventTest();
	}

}//class....






