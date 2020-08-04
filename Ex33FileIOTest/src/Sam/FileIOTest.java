import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 파일을 copy하는 프로그램
		
		// 원본파일의 경로와 파일명.확장자!
		String srcPath= "D:/files/aaa.txt";
		
		
		try {
			//원본파일을 읽어오기 위해 무지개로드 생성 - 해임달없이 해보기
			FileInputStream fis= new FileInputStream(srcPath);
			
			//읽어온 데이터를 저장할 파일의 경로와 파일명지정
			File path= new File("D:/copy");//경로만 지정
			if( !path.isDirectory() ) path.mkdirs(); //없으면 만들어라
			
			//경로와 파일명을 결합한 새로운 File객체 생성
			File file= new File(path, "bbb.txt");
			
			//위에서 만든 파일과 연결된 OutputStream 생성
			FileOutputStream fos= new FileOutputStream(file);
			
			//원본파일에서 1byte씩 읽어오면서 곧바로 1byte씩 카피할 파일에 저장
			while(true) {
				byte b= (byte)fis.read();//1byte 읽기
				if(b == -1) break;
				
				fos.write(b); //위에서 읽어온 1byte를 쓰기
			}
			
			//파일쓰는 Stream에 데이터가 걸려있을 수 있으므로 밀어내기
			fos.flush();
			
			//여기까지 오면 잘 끝났다...
			//끝났으니 스트림 닫기..
			fis.close();
			fos.close();
			
			System.out.println("복사가 완료되었습니다.");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("복사중에 오류가 발생했습니다.");
		}
		

	}

}
