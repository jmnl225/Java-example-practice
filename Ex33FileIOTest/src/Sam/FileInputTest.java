import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 읽어올 파일의 파일명을 가진 해임달객체 생성
		File file= new File("aaa.txt");
		
		//파일과 연결할 무지개로드(Stream) 생성		
		//그 중에서도 데이터를 읽어오는 InputStream 생성
		//그 중에서도 File용으로 만들어진 FileInputStream 생성
		
		try {
			//fis는 파일이 존재하지 않으면 예외발생!! 자동으로 만들어주지 않음.
			FileInputStream fis= new FileInputStream(file);
			
			//스트림을 통해 읽어오기...
//			byte b= (byte)fis.read(); //1byte씩 읽어오기
//			while( b != -1 ) {
//				//System.out.println(b);//아스키값이 나옴
//				System.out.println( (char)b );
//				b= (byte)fis.read(); //다음 바이트값 읽어오기								
//			}
			
			// 위 방식보다는 한번에 읽어와서 byte[] 로 받는 것이 더 간결함
			//읽기전에, 읽어올 데이터들을 저장할 빈 byte[]을 준비해 놓아야 함
			byte[] bytes= new byte[1024]; // 좀 여유있는 크기로 만들어 놓음 [1024byte==1KB]
			fis.read(bytes); //전달된 빈 배열에 데이터들을 읽어와서 넣어줌
			
			//읽어온 byte배열을 String으로 변환하여 출력
			// byte[] -> String 변환
			String s= new String(bytes);//생성자에 전달된 byte배열을 문자열객체로 생성
			System.out.println(s);
			
			//여기까지 커서가 왔다면..읽기가 성공한 것이므로..
			System.out.println("파일로드가 완료되었습니다.");
			
			//데이터 읽기가 끝났으면 스트림이 필요없으므로 닫아야 함.
			fis.close();			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("읽기과정 중 오류가 발생하였습니다.");
		}

	}

}
