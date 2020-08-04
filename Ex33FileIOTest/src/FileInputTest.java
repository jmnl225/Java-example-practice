import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {
	public static void main(String[] args) {
		
		//읽어올 파일의 파일명을 가진 해임달 객체 생성
		File file= new File("aaa.txt");
		
		
		//파일과 연결할 무지개로드 (Stream)
		//그 중에서도 데이터를 읽어오는 InputStream 생성
		//그 중에서도 File 용으로 만들어진 FileInputStream 생성
		
		
		try {
			//fis는 파일이 존재하지 않으면 예외발생! **자동으로 만들어주지 않습니다.**
			FileInputStream fis= new FileInputStream(file);
			
			byte b=(byte)fis.read(); //1byte씩 읽어오기
			
			//스트림을 통해 읽어오기
			/*while( b != -1 ) { //아스키값이 아닌 더 이상 읽을 것이 없으면 -1를 리턴함
//				System.out.println(b); //아스키값이 나옴
				System.out.println((char)b);
				b= (byte)fis.read(); //다음 바이트 값 읽어오기
			}*/
			
			//위 방식보다는 한번에 읽어와서 byte[] 로 받는 것이 더 간결
			//읽기 전에 읽어 올 데이터들을 저장할 빈  byte[]배열을 준비
			
			byte[] bytes= new byte[1024]; // 좀 여유있는 크기로 만들어 놓음 [1024 byte= 1KB]
			fis.read(bytes); //전달된 빈 배열에 데이터들을 읽어와서 넣어줌
			
			//읽어온 값 byte[] 배열을 String으로 변환하여 출력
			//byte[] -> String 변환
			String s= new String(bytes); //생성자에 전달된 byte를 문자열로 변환
			
			System.out.println(s);
			
			//커서가 여기까지 왔다면 읽기 성공
			
			System.out.println("파일 로드 완료.");
			
			//데이터 읽기가 끝났으면 스트림이 필요 없으므로 닫아야 한다!
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("읽는 과정 중 오류가 발생하였습니다.");
		}
		
		//스트림을 통해 읽어오기...
		
		
	}

}
