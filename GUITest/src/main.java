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
		
		//GUI ������ ���� Swing�� ���
		
		
		//1. �ֻ��� �����̳� ��ü ����
		JFrame frame= new JFrame("GUI Test");
		frame.setSize(500, 400);
		
		//*������Ʈ�� �߰��ϱ� ���� ��ġ������(Layout Manager)�� �����ؾ�
		// ���ϴ� �����ǿ� ������Ʈ���� ������ �� ����
		// ���� ��ġ������ �߿��� ���� ������ Flowlayout�� ����
		
		LayoutManager layoutManager= new FlowLayout(); //���������Ʈ�� ������ ��ġ
		frame.setLayout(layoutManager);
		
		
		//2. ������Ʈ �߰�
		JButton b1= new JButton("button #1");
		JButton b2= new JButton("button #2");
		
		//JFrame�� ��ư �߰��ϱ�
		frame.add(b1);
		frame.add(b2);
		
		//JLable �۾��� �����ִ� ������Ʈ
		JLabel label= new JLabel("This is a Lable");
		frame.add(label);
		
		
		//JTextField- ����ڷκ��� �۾� �Է¹޴� ������Ʈ
		JTextField tf= new JTextField(20); //�ּ� 20���� ������
		frame.add(tf);
		
		
		//�̹��� - Java���� �̹����� ������Ʈ�� ����.
		//JLabel�� ������(�̹���)�� �����ִ� ��� �̿�.
		
		//JLabel�� ������ ������ �̹��� ��ü�� ���� �����ؾ���.
		ImageIcon icon= new ImageIcon("images/dog1.jpg");
		//���� ������� �����Ǿ�����.
		//�̹����� ������¡ - > imageicon��ü ���� ��¥ �̹����� �����ִ� �� �ٸ� ��ü(=image)�� ����
		Image img= icon.getImage();
		//�̾ƿ� �̹��� ��ü�� �̿��Ͽ� ���ο� �������� �̹��� ���� �����
		Image img2= img.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
		
		//���� ������� img2�� JLabel�� �����ϱ� ���� ���ο� ImageIcon��ü ����
		ImageIcon icon2= new ImageIcon(img2);
		
		JLabel imgLabel= new JLabel();
		imgLabel.setIcon(icon2);
		
		
		//3. JFrmae ȭ�鿡 ���̱�
		//�⺻������ JFrame�� X��ư�� ������ â�� ���������� ���α׷��� Main thread�� ������ ����
		//�׷��� �̸� ���� ����ǰ� �Ϸ���..
		
		frame.add(imgLabel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(300, 200); // �������� �»���� ��ǥ[��ġ]
		
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
