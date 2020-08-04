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
		
		//문자열 데이터를 한 단어씩 입력받아 별도의 파일에 저장하고 읽어오는 프로그램
		
		//사용자로부터 문자열 데이터를 입력받기 위해 Scanner 객체 생성
		
		Scanner scan= new Scanner(System.in);
		
		//사용자가 "no"라는 글씨를 입력하기 전까진 계속 입력받도록 하기 위해
		while(true) {
			System.out.print("저장할 단어 입력 (no를 입력하면 종료): ");
			String str= scan.next();
			
			//문자열 비교는 절대절대절대 == 쓰지 않음!!!!!!!!!!
			if(str.equalsIgnoreCase("no")) { //대소문자 구별없이 비교하고 싶다면, equals가 아니라 equalsIgnoreCase
				System.out.println("입력이 종료됩니다.");
				break;
			}
			
			//별도의 파일에 저장하기 위해 File(해임달)객체 생성
			//목표위치: "본인프로젝트폴더/files/data.txt"
			
			//먼저, 폴더는 자동으로 만들어주지 않으므로
			//우선 폴더 위치까지만 지정된 File객체 생성
			
			File path= new File("files"); //files라는 폴더명만 만듦
			if(!path.exists()) path.mkdirs(); //폴더가 없으면 만들어라
			
			//경로+파일명.확장자 를 가진 File 객체 새로 생성
			
			File file= new File(path, "data.txt"); // 같은 의미 == files/data.txt
			
			//파일과 연결할 무지개로드(Stream) 생성
			//단, bytestream(OutputStream) 이 아닌 StringStream(Writer)을 사용!
			
			//그 Writer 중에서도 File 용으로 만들어진 FileWriter 사용
			
			try {
				FileWriter fw= new FileWriter(file, true); //append모드(덧붙이기): true
		
//				fw.write(str); //저장은 됨			
//				fw.flush(); //strea에 있는 데이터를 밀ㅇ넣음..				
//				fw.close();
				
				//데이터를 저장할 때 더 쉽게하기위해,
				//콘솔창 화면에 출력하듯 파일에 저장할 수 있다면 저장형태를 쉽게 제어 가능
				//보조 Writer 클래스
				
				PrintWriter writer= new PrintWriter(fw); //기존의 FileWriter를 보조
				writer.println(str); // printrn() 줄바꿈출력
				writer.flush();
				writer.close(); // 보조스트림 
				
			} catch (IOException e) {
				System.out.println("파일 쓰기 작업 중에 에러 발생");
			}

//			writer = new PrintWriter(file);

			
		}//while end.
		
		
		System.out.println();
		System.out.println("====================================");		
		System.out.println("저장된 파일의 데이터를 화면에 출력합니다.");
		System.out.println("====================================");		
		System.out.println();
		
		
		//파일 한 줄에 한 단어씩 저장되어 있으니 읽어들인 단어를 ArrayList에 추가시키기..
		ArrayList<String> datas= new ArrayList<String>();
		
		//읽어올 File 객체 생성
		
		File file= new File("files/data.txt");
		
		
		
		//파일과 연결되는 무지개로드(Stream) 생성
		try {
			FileReader fr= new FileReader(file);
			
//			int a= fr.read(); // 한 글자씩 읽어옴: 영어면 1byte, 한글이면 2~3byte : 언어마다 읽어들일 바이트수가 결정됨
			//결국 이런 식으로 한 글자씩 받으려면 반복문을 써야함. -> 하지만 반복문을 써도 어려움 ==> 잘 안 씀!!
			
			
			
			//입력을 편하게 한줄씩 받기위해 보조스트림(BufferedReader) 클래스를 사용하고자 함
			//BufferedReader: FileReader가 한글자씩 준 데이터를 모아둠
			
			BufferedReader reader= new BufferedReader(fr);
			
			//BufferedReader에게 저장된 데이터를 한줄씩 읽어달라고 요청!
			String line = reader.readLine(); //한 줄 읽기 [단, 줄바꿈 문자는 사라짐]
			while(line!=null) { //여러줄 일 수 있어서 반복
//				if(line==null) break;
				
				//ArrayList에 추가
				datas.add(line);
								
				//다음 줄 읽기
				line= reader.readLine();
			}
			
			//여기까지 왔으면 다 읽었으므로
			//ArrayList에 있는 데이터들을 차례로 출력해보기
			for(int i=0; i<datas.size(); i++) {
				System.out.println(i+" : "+ datas.get(i));
			}
			
			//모든 입력작업이 종료되었으니 stream을 닫기!
			reader.close();
			
		}catch (FileNotFoundException e ) {
			System.out.println("문서가 존재하지 않습니다.");
		}catch (IOException e) {
			System.out.println("읽는 중에 오류가 발생하였습니다.");
		}
		
		
		
		
	}//static end.

}//main end.
