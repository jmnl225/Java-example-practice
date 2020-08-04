import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StringIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���ڿ� �����͸� �Ѵܾ �Է¹޾� ������ ������ �����ϰ� �о���� ���α׷�
		
		//����ڷκ��� ���ڿ� �����͸� �Է¹ޱ� ���� Scanner��ü ����
		Scanner scan= new Scanner(System.in);
		
		//����ڰ�  "no"��� �۾��� �Է��ϱ� �������� ��� �Է¹޵���
		while(true) {
			System.out.print("������ �ܾ� �Է�(no�� �Է��ϸ� ����) : ");
			String str= scan.next();			
			
			//���ڿ��񱳴� ����� == ������ ����ϸ� �ȵ�!!! 
			if(str.equalsIgnoreCase("no")) {//��ҹ��� �������� ���ϰ� �ʹٸ�
				System.out.println("�Է��� ����˴ϴ�.");
				break;				
			}
			
			
			//������ ���Ͽ� �����ϱ� ���� File(���Ӵ�)��ü ����
			//��ǥ��ġ : "����������Ʈ����/files/data.txt"
			
			//����, ������ �ڵ����� ��������� �����Ƿ�..
			//������ġ������ ������ File��ü ����
			File path= new File("files");//files��� ������
			if( !path.exists() ) path.mkdirs(); //������ ���ٸ� ������..
			
			//���+���ϸ�.Ȯ���� �� ���� File��ü ������ ����
			File file= new File(path, "data.txt");//"files/data.txt"
			
			//���ϰ� ������ �������ε�(Stream) ����
			//��, ����Ʈ��Ʈ��(OutputStream)�� �ƴ϶� ���ڽ�Ʈ��(Writer)�� ����ϰ� �� ��.
			//�� Writer�߿����� File ������ ������� FileWriter���
			
			try {
				FileWriter fw= new FileWriter(file, true);//append��� : true
//				fw.write(str+"\n");//������ ��
//				fw.flush();//��Ʈ���� �ִ� �����͸� �о� �ִ� ���
//				fw.close();	
				
				//�����͸� �����Ҷ� ���� �����ϱ�����..
				//��ġ.. �ܼ�âȭ�鿡 ����ϵ���..���Ͽ� ������ �� �ִٸ�
				//�� ���� ������ �������¸� ������ �� ����.
				//System.out.println();�̷������� write()�� �� �� �ִٸ�
				//�� ���ϰ� ���� ������ ������..
				//�̸� ���� ������� ���� Wirter Ŭ������ ������.
				PrintWriter writer= new PrintWriter(fw);//������ FileWriter�� ����
				writer.println(str);//println() �ٹٲ� ���!!
				writer.flush();
				writer.close();//������Ʈ���� ������ FileWriter�� ���� close()��
								
				
			} catch (IOException e) {
				System.out.println("���Ͼ��� �۾��߿� ���� �߻�!");
			}
			
			
			
			
		}//while...
		
		System.out.println();
		System.out.println("==============================");
		System.out.println("����� ������ �����͸� ȭ�鿡 ����մϴ�.");
		System.out.println("==============================");
		System.out.println();
		
		
		//������ ���ٿ� �� �ܾ ����Ǿ� ������ �о���� �ܾ ArrayList�� �߰���Ű��..
		ArrayList<String> datas= new ArrayList<String>();
		
		//�о�� File��ü ����
		File file= new File("files/data.txt");
		
		//���ϰ� ����Ǵ� �������ε�(Stream) ����
		try {
			FileReader fr= new FileReader(file);
			
			//int a= fr.read(); //�� ���ھ� �о�� : ����� 1byte, �ѱ��̸� 2~3����Ʈ�� �о���. ���� �о���� ����Ʈ���� ������
			//�ᱹ �̷������� �� ���ھ� �������� �ݺ����� �����..�ݺ����ᵵ ¥���� �� ����.
			
			//�Է��� ���ϰ� ���پ� �Է¹ޱ� ���� ������Ʈ��(BufferedReader) Ŭ������ ����ϰ�����.
			//BufferedReader : FileReader�� �ѱ��ھ� �� �����͸� ��Ƴ��� �ִ� �༮
			BufferedReader reader= new BufferedReader(fr);
			
			//BufferedReader���� ����� �����͸� ���پ� �о�޶�� ��û!!
			String line= reader.readLine();//���� �б� [��, �ٹٲ޹��ڴ� ����� ]
			while(line!=null) { //�������� �� �־ �ݺ�
				
				//ArrayList�� �߰�
				datas.add(line);				
				//���� �� �б�
				line= reader.readLine();
			}
			
			//������� ������ �� �о���� ���̹Ƿ�..
			//ArrayList�� �ִ� �����͵�(���ڿ���)�� ���ʷ� ����غ���
			for(int i=0; i<datas.size(); i++) {
				System.out.println(i +" : "+ datas.get(i));
			}
			
			//��� �Է��۾��� ����Ǿ�����...��Ʈ���� �ݱ�!!
			reader.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println("�д��߿� ������ �߻��Ͽ����ϴ�.");
		}
		

	}//main method...

}
