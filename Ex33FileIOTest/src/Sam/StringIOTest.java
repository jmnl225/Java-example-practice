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
		
		//문자열 데이터를 한단어씩 입력받아 별도의 파일이 저장하고 읽어오는 프로그램
		
		//사용자로부터 문자열 데이터를 입력받기 위해 Scanner객체 생성
		Scanner scan= new Scanner(System.in);
		
		//사용자가  "no"라는 글씨를 입력하기 전까지는 계속 입력받도록
		while(true) {
			System.out.print("저장할 단어 입력(no를 입력하면 종료) : ");
			String str= scan.next();			
			
			//문자열비교는 절대로 == 연산자 사용하면 안됨!!! 
			if(str.equalsIgnoreCase("no")) {//대소문자 구별없이 비교하고 싶다면
				System.out.println("입력이 종료됩니다.");
				break;				
			}
			
			
			//별도의 파일에 저장하기 위해 File(해임달)객체 생성
			//목표위치 : "본인프로젝트폴더/files/data.txt"
			
			//먼저, 폴더는 자동으로 만들어주지 않으므로..
			//폴더위치까지만 지정된 File객체 생성
			File path= new File("files");//files라는 폴더명만
			if( !path.exists() ) path.mkdirs(); //폴더가 없다면 만들어라..
			
			//경로+파일명.확장자 를 가진 File객체 새로이 생성
			File file= new File(path, "data.txt");//"files/data.txt"
			
			//파일과 연결할 무지개로드(Stream) 생성
			//단, 바이트스트림(OutputStream)이 아니라 문자스트림(Writer)을 사용하고 자 함.
			//그 Writer중에서도 File 용으로 만들어진 FileWriter사용
			
			try {
				FileWriter fw= new FileWriter(file, true);//append모드 : true
//				fw.write(str+"\n");//저장은 됨
//				fw.flush();//스트림에 있는 데이터를 밀어 넣는 명령
//				fw.close();	
				
				//데이터를 저장할때 좀더 쉽게하기위해..
				//마치.. 콘솔창화면에 출력하듯이..파일에 저장할 수 있다면
				//더 쉽게 파일의 저장형태를 제어할 수 있음.
				//System.out.println();이런식으로 write()를 할 수 있다면
				//더 편하게 파일 저장이 가능함..
				//이를 위해 만들어진 보조 Wirter 클래스가 존재함.
				PrintWriter writer= new PrintWriter(fw);//기존의 FileWriter를 보조
				writer.println(str);//println() 줄바꿈 출력!!
				writer.flush();
				writer.close();//보조스트림을 닫으면 FileWriter도 같이 close()됨
								
				
			} catch (IOException e) {
				System.out.println("파일쓰기 작업중에 에러 발생!");
			}
			
			
			
			
		}//while...
		
		System.out.println();
		System.out.println("==============================");
		System.out.println("저장된 파일의 데이터를 화면에 출력합니다.");
		System.out.println("==============================");
		System.out.println();
		
		
		//파일의 한줄에 한 단어씩 저장되어 있으니 읽어들인 단어를 ArrayList에 추가시키기..
		ArrayList<String> datas= new ArrayList<String>();
		
		//읽어올 File객체 생성
		File file= new File("files/data.txt");
		
		//파일과 연결되는 무지개로드(Stream) 생성
		try {
			FileReader fr= new FileReader(file);
			
			//int a= fr.read(); //한 글자씩 읽어옴 : 영어면 1byte, 한글이면 2~3바이트가 읽어짐. 언어마다 읽어들일 바이트수가 결정됨
			//결국 이런식으로 한 글자씩 받으려면 반복문을 써야함..반복문써도 짜증날 수 있음.
			
			//입력을 편하게 한줄씩 입력받기 위해 보조스트림(BufferedReader) 클래스를 사용하고자함.
			//BufferedReader : FileReader가 한글자씩 준 데이터를 모아놓고 있는 녀석
			BufferedReader reader= new BufferedReader(fr);
			
			//BufferedReader에게 저장된 데이터를 한줄씩 읽어달라고 요청!!
			String line= reader.readLine();//한줄 읽기 [단, 줄바꿈문자는 사라짐 ]
			while(line!=null) { //여러줄일 수 있어서 반복
				
				//ArrayList에 추가
				datas.add(line);				
				//다음 줄 읽기
				line= reader.readLine();
			}
			
			//여기까지 왔으면 다 읽어들인 것이므로..
			//ArrayList에 있는 데이터들(문자열들)을 차례로 출력해보기
			for(int i=0; i<datas.size(); i++) {
				System.out.println(i +" : "+ datas.get(i));
			}
			
			//모든 입력작업이 종료되었으니...스트림을 닫기!!
			reader.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("문서가 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("읽는중에 오류가 발생하였습니다.");
		}
		

	}//main method...

}
