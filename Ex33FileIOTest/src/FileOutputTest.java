import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5/7
		//사용자로부터 문자열을 입력받아 별도의 파일에 저장하는 프로그램
		
		Scanner scan= new Scanner(System.in);
		System.out.println("저장할 데이터 입력: ");
		String data= scan.next();
		
		
		//별도의 파일과의 무지개로드(Stream)를 만들어주는 해임달 객체(File) 생성
		//생성자로 무지개 로드를 연결할 위치를 전달해줘야함
		//즉, 파일 저장 위치 지정 및 파일명.학장자 까지!
		//특별한 디스크의 위치경로를 지정하지 않으면 이 .java문서가 있는 프로젝트 원복
		
		
		File file= new File("aaa.txt");
		
		//############### 파일 저장위치 지정 #################
		
		
		//본인 프로젝트 폴더 안에 특정 폴더 안에 파일저장
		//경로의 구분문자 (슬래시 / )
		//Windows에선 역슬래시 \또는  슬래시 / 모두 사용 가능
		//Linux, Mac 에서는 슬래시만 가능
		
//		file= new File("kkk\\aaa.txt"); // 역슬래시는 "" 안에서 특수문자로 인지하므로 사용하려면 역슬래시 2개를 써야 1개로 인식
		file= new File("kkk/aaa.txt"); //kk라는 폴더 안에 파일 저장
		
		//파일은 없으면 자동으로 만들지만 폴더는 만들지 않는다
		
		//프로그램으로 kkk폴더를 만들어야 함. 아 귀찮
		//폴더명만으로 File객체 생성
		File path= new File("KKK");
		if(!path.isDirectory()){ //그 폴더가 없는가?
			//없다면 디렉토리를 만들어라 (make directory)
			path.mkdirs(); //하위폴더가 있다면 한꺼번에 만들기
		}
		
		//위에서 만들 경로와 파일명.확장자까지 포함한 File객체를 새로 생성
		file = new File(path, "aaa.txt"); //path의 경로와 파일명이 결합됨.
		
		//내 프로젝트 폴더가 아닌 특정 위치에 바로 저장하기..
		file= new File("D:/aaa.txt");
		
		//특정 폴더까지 지정하고 싶다면?
		//먼저 경로만으로 된 file객체 만들기
		path= new File("D:/files/kkk");
		if(!path.isDirectory()) path.mkdirs();
		
		//위 경로와 파일명을 결합한 File 객체 새로 생성
		file= new File(path, "hello.txt");
		
		//#################################
		
		
		//파일 객체가 가진 파일위치에 데이터를 보내기 위해 무지개로드 (stream ) 생성
		
		//OutputStream중에서 File에 데이터를 저장하는 용도의 File output stream
		
		try {
			//만약 "aaa.txt"문서가 없다면 OutputStream은 자동으로 그 문서를 만듦
			//만약 "aaa.txt"문서가 있다면 그 문서를 열고 안에 데이터를 저장
			//기본적으로 FileOutputStream은 기존 데이터를 덮어쓰기
//			FileOutputStream fos= new FileOutputStream(file);
			
			//만약, 덮어쓰기가 아니라 이어붙이기를 하고싶다면
			FileOutputStream fos= new FileOutputStream(file, true); // 두번째 파라미터
			
			//스트림을 통해 데이터를 파일에 작성(보내기)
			// fos.write(65); 한번에 1 byte씩만 데이터를 보낼 수 있음
			
//			fos.write(65);
			//대문자 'A'작성
			
			//1byte씩 데이터를 보내려면 문자열데이터의 경우 어려움
			//문자열 (String) 객체를 본인의 값을 byte[]로 변환하는 기능이 있음
			
			byte[] bytes= data.getBytes(); // String ->byte[]
			fos.write(bytes); // 바이트배열로 보내기
			fos.flush(); // 스트림에 있는 데이터를 밀어내는 기능
			
			//언제나 데이터 전송이 끝나면 스트림이 더 이상 필요하지 않으므로
			//스트림을 닫아줘야 함
			
			fos.close();
			
			//여기까지 커서가 왔다면 저장이 잘 되었다는 것
			System.out.println("파일 저장 완료");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않음");
		} catch (IOException e1) {
			System.out.println("쓰기 작업 중 ");
		}

		
	}

}
