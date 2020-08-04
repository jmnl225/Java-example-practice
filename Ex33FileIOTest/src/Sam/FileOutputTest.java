import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����ڷκ��� ���ڿ��� �Է¹޾� ������ ���Ͽ� �����ϴ� ���α׷�
		
		Scanner scan= new Scanner(System.in);
		System.out.print("������ ������ �Է� : ");
		//���Ͽ� ������ ������
		String data= scan.next();
		
		//������ ���ϰ��� �������ε�(Stream)�� ������ִ� ���Ӵ� ��ü(File) ����
		//�����ڷ� �������ε带 ������ ��ġ�� ��������� ��.
		//��, ���� ���� ��ġ ���� �� ���ϸ�.Ȯ���� ���� ...
		//Ư���� ��ũ�� ��ġ��θ� �������� ������ �� .java�� �ִ� ������Ʈ������ �����.
		File file= new File("aaa.txt");	
		
		
		//## ������ ������ġ �����غ���  ################
		
		//���� ������Ʈ �����ȿ� Ư�������ȿ� ���� ����
		//����� ���й���( ������ / )
		//Windows������ �������� \ �Ǵ� ������ / ��� ��� ����
		//Linux, Mac������ ������ / �� ��� ������
		//file= new File("kkk\\aaa.txt"); //���������� ""�ȿ��� Ư�����ڷ� �����ϹǷ� ����Ϸ��� �������ø� 2�� ��� 1���� �νĵ�
		file= new File("kkk/aaa.txt"); //kkk��� �����ȿ� ��������
		
		//������ ������ �ڵ����� �������� ������ �ڵ����� ������ ����
		
		//���α׷����� kkk������ ��������.
		//�켱, ���������� File��ü ����
		File path= new File("kkk");
		if(  !path.isDirectory() ) {//�� ������ ���°�?
			//���ٸ� ���丮�� ������( make directory )
			path.mkdirs(); //���������� �ִٸ� �Ѳ����� ������ֱ�
		}
		
		//������ ���� ��ο� ���ϸ�.Ȯ���ڱ��� �����ϴ� File��ü ���� ����
		file= new File(path, "aaa.txt"); //path�� ��ο� ���ϸ��� ���յ�.
		
		//�� ������Ʈ������ �ƴ� Ư�� ��ġ�� �ٷ� �����ϱ�..
		file= new File("D:/aaa.txt");
		
		//Ư���������� �����ϰ� �ʹٸ�..
		//���� ��θ����� �� File��ü �����
		path= new File("D:/files/kkk");
		if(!path.isDirectory()) path.mkdirs();
		
		//�� ��ο� ���ϸ��� ������ File��ü ������ ����
		file= new File(path, "hello.txt");	
		
		//#######################################
		
		
		
		//���ϰ�ü�� ���� ������ġ�� �����͸� ������ ���� �������ε�(Stream) ����
		//�����͸� �������� ���̹Ƿ� Stream�߿��� OutputStream�� ���.
		
		//OutputStream�߿��� File�� �����͸� �����ϴ� �뵵�� FileOutputStream���
		
		try {
			//���� "aaa.txt"������ ���ٸ� OutputStream�� �ڵ����� �� ������ ����
			//���� "aaa.txt"������ �ִٸ� �� ������ ���� �ȿ� �����͸� ������
			//�⺻������ FileOutputStream�� ���� �����͸� ����� ��.
			//FileOutputStream fos= new FileOutputStream(file);
			//����, ����� ���� �̾���̱⸦ �ϰ� �ʹٸ�..
			FileOutputStream fos= new FileOutputStream(file, true);//�ι�° �ĸ�����: append����[true, false]
			
			//��Ʈ���� ���� �����͸� ���Ͽ� �ۼ�(������)
			// fos�� �ѹ��� 1byte���� �����͸� ���� �� ����.
			//fos.write(65);//�빮�� 'A'�ۼ�
			// 1byte�� �����͸� �������� ���ڿ��������� ��� �� ¥����.
			//���ڿ�(String)��ü�� ������ ���� byte[]�� ��ȯ�ϴ� ����� ����.
			byte[] bytes= data.getBytes();//String->byte[]
			fos.write(bytes); //����Ʈ�迭�� ������
			fos.flush(); //[flush:��������] - ��Ʈ���� �ִ� �����͸� �о�� ���
			
			//������ ������ ������ ������ ��Ʈ���� ���̻� �ʿ����� �����Ƿ� 
			//��Ʈ���� �ݾ���� ��...
			fos.close();
			
			//������� Ŀ���� �Դٸ� ������ �� �Ǿ��´ٴ� ���̹Ƿ�...
			System.out.println("���� ���� ����!!!");			
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� ����..");
		} catch (IOException e) {
			System.out.println("�����۾� �� ������ �߻��߽��ϴ�.");
		}

	}

}
