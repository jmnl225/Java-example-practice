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
		
		//���ڿ� �����͸� �� �ܾ �Է¹޾� ������ ���Ͽ� �����ϰ� �о���� ���α׷�
		
		//����ڷκ��� ���ڿ� �����͸� �Է¹ޱ� ���� Scanner ��ü ����
		
		Scanner scan= new Scanner(System.in);
		
		//����ڰ� "no"��� �۾��� �Է��ϱ� ������ ��� �Է¹޵��� �ϱ� ����
		while(true) {
			System.out.print("������ �ܾ� �Է� (no�� �Է��ϸ� ����): ");
			String str= scan.next();
			
			//���ڿ� �񱳴� ������������ == ���� ����!!!!!!!!!!
			if(str.equalsIgnoreCase("no")) { //��ҹ��� �������� ���ϰ� �ʹٸ�, equals�� �ƴ϶� equalsIgnoreCase
				System.out.println("�Է��� ����˴ϴ�.");
				break;
			}
			
			//������ ���Ͽ� �����ϱ� ���� File(���Ӵ�)��ü ����
			//��ǥ��ġ: "����������Ʈ����/files/data.txt"
			
			//����, ������ �ڵ����� ��������� �����Ƿ�
			//�켱 ���� ��ġ������ ������ File��ü ����
			
			File path= new File("files"); //files��� ������ ����
			if(!path.exists()) path.mkdirs(); //������ ������ ������
			
			//���+���ϸ�.Ȯ���� �� ���� File ��ü ���� ����
			
			File file= new File(path, "data.txt"); // ���� �ǹ� == files/data.txt
			
			//���ϰ� ������ �������ε�(Stream) ����
			//��, bytestream(OutputStream) �� �ƴ� StringStream(Writer)�� ���!
			
			//�� Writer �߿����� File ������ ������� FileWriter ���
			
			try {
				FileWriter fw= new FileWriter(file, true); //append���(�����̱�): true
		
//				fw.write(str); //������ ��			
//				fw.flush(); //strea�� �ִ� �����͸� �Ф�����..				
//				fw.close();
				
				//�����͸� ������ �� �� �����ϱ�����,
				//�ܼ�â ȭ�鿡 ����ϵ� ���Ͽ� ������ �� �ִٸ� �������¸� ���� ���� ����
				//���� Writer Ŭ����
				
				PrintWriter writer= new PrintWriter(fw); //������ FileWriter�� ����
				writer.println(str); // printrn() �ٹٲ����
				writer.flush();
				writer.close(); // ������Ʈ�� 
				
			} catch (IOException e) {
				System.out.println("���� ���� �۾� �߿� ���� �߻�");
			}

//			writer = new PrintWriter(file);

			
		}//while end.
		
		
		System.out.println();
		System.out.println("====================================");		
		System.out.println("����� ������ �����͸� ȭ�鿡 ����մϴ�.");
		System.out.println("====================================");		
		System.out.println();
		
		
		//���� �� �ٿ� �� �ܾ ����Ǿ� ������ �о���� �ܾ ArrayList�� �߰���Ű��..
		ArrayList<String> datas= new ArrayList<String>();
		
		//�о�� File ��ü ����
		
		File file= new File("files/data.txt");
		
		
		
		//���ϰ� ����Ǵ� �������ε�(Stream) ����
		try {
			FileReader fr= new FileReader(file);
			
//			int a= fr.read(); // �� ���ھ� �о��: ����� 1byte, �ѱ��̸� 2~3byte : ���� �о���� ����Ʈ���� ������
			//�ᱹ �̷� ������ �� ���ھ� �������� �ݺ����� �����. -> ������ �ݺ����� �ᵵ ����� ==> �� �� ��!!
			
			
			
			//�Է��� ���ϰ� ���پ� �ޱ����� ������Ʈ��(BufferedReader) Ŭ������ ����ϰ��� ��
			//BufferedReader: FileReader�� �ѱ��ھ� �� �����͸� ��Ƶ�
			
			BufferedReader reader= new BufferedReader(fr);
			
			//BufferedReader���� ����� �����͸� ���پ� �о�޶�� ��û!
			String line = reader.readLine(); //�� �� �б� [��, �ٹٲ� ���ڴ� �����]
			while(line!=null) { //������ �� �� �־ �ݺ�
//				if(line==null) break;
				
				//ArrayList�� �߰�
				datas.add(line);
								
				//���� �� �б�
				line= reader.readLine();
			}
			
			//������� ������ �� �о����Ƿ�
			//ArrayList�� �ִ� �����͵��� ���ʷ� ����غ���
			for(int i=0; i<datas.size(); i++) {
				System.out.println(i+" : "+ datas.get(i));
			}
			
			//��� �Է��۾��� ����Ǿ����� stream�� �ݱ�!
			reader.close();
			
		}catch (FileNotFoundException e ) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}catch (IOException e) {
			System.out.println("�д� �߿� ������ �߻��Ͽ����ϴ�.");
		}
		
		
		
		
	}//static end.

}//main end.
