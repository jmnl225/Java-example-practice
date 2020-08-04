import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사용자로부터 문자열을 입력받아 별도의 파일에 저장하는 프로그램
		
		Scanner scan= new Scanner(System.in);
		System.out.print("저장할 데이터 입력 : ");
		//파일에 저장할 데이터
		String data= scan.next();
		
		//별도의 파일과의 무지개로드(Stream)를 만들어주는 해임달 객체(File) 생성
		//생성자로 무지개로드를 연결할 위치를 전달해줘야 함.
		//즉, 파일 저장 위치 지정 및 파일명.확장자 까지 ...
		//특별한 디스크의 위치경로를 지정하지 않으면 이 .java가 있는 프로젝트폴더에 저장됨.
		File file= new File("aaa.txt");	
		
		
		//## 파일의 저장위치 지정해보기  ################
		
		//본인 프로젝트 폴더안에 특정폴더안에 파일 저장
		//경로의 구분문자( 슬래시 / )
		//Windows에서는 역슬래시 \ 또는 슬래시 / 모두 사용 가능
		//Linux, Mac에서는 슬래시 / 만 사용 가능함
		//file= new File("kkk\\aaa.txt"); //역슬래스는 ""안에서 특수문자로 인자하므로 사용하려면 역슬래시를 2개 써야 1개로 인식됨
		file= new File("kkk/aaa.txt"); //kkk라는 폴더안에 파일저장
		
		//파일은 없으면 자동으로 만들지만 폴더는 자동으로 만들지 않음
		
		//프로그램으로 kkk폴더를 만들어야함.
		//우선, 폴더명만으로 File객체 생성
		File path= new File("kkk");
		if(  !path.isDirectory() ) {//그 폴더가 없는가?
			//없다면 디렉토리를 만들어라( make directory )
			path.mkdirs(); //하위폴더가 있다면 한꺼번에 만들어주기
		}
		
		//위에서 만들 경로와 파일명.확장자까지 포함하는 File객체 새로 생성
		file= new File(path, "aaa.txt"); //path의 경로와 파일명이 결합됨.
		
		//내 프로젝트폴더가 아닌 특정 위치에 바로 저장하기..
		file= new File("D:/aaa.txt");
		
		//특정폴더까지 지정하고 싶다면..
		//먼저 경로만으로 된 File객체 만들기
		path= new File("D:/files/kkk");
		if(!path.isDirectory()) path.mkdirs();
		
		//위 경로와 파일명을 결합한 File객체 새로이 생성
		file= new File(path, "hello.txt");	
		
		//#######################################
		
		
		
		//파일객체가 가진 파일위치에 데이터를 보내기 위해 무지개로드(Stream) 생성
		//데이터를 내보내는 것이므로 Stream중에서 OutputStream을 사용.
		
		//OutputStream중에서 File에 데이터를 저장하는 용도의 FileOutputStream사용
		
		try {
			//만약 "aaa.txt"문서가 없다면 OutputStream은 자동으로 그 문서를 만듦
			//만약 "aaa.txt"문서가 있다면 그 문서를 열고 안에 데이터를 저장함
			//기본적으로 FileOutputStream은 기존 데이터를 덮어쓰기 함.
			//FileOutputStream fos= new FileOutputStream(file);
			//만약, 덮어쓰기 말고 이어붙이기를 하고 싶다면..
			FileOutputStream fos= new FileOutputStream(file, true);//두번째 파리미터: append여부[true, false]
			
			//스트림을 통해 데이터를 파일에 작성(보내기)
			// fos은 한번에 1byte씩만 데이터를 보낼 수 있음.
			//fos.write(65);//대문자 'A'작성
			// 1byte씩 데이터를 보내려면 문자열데이터의 경우 좀 짜증남.
			//문자열(String)객체를 본인의 값을 byte[]로 변환하는 기능이 있음.
			byte[] bytes= data.getBytes();//String->byte[]
			fos.write(bytes); //바이트배열로 보내기
			fos.flush(); //[flush:물내리다] - 스트림에 있는 데이터를 밀어내는 기능
			
			//언제나 데이터 전송이 끝나면 스트림이 더이상 필요하지 않으므로 
			//스트림을 닫아줘야 함...
			fos.close();
			
			//여기까지 커서가 왔다면 저장이 잘 되었는다는 것이므로...
			System.out.println("파일 저장 성공!!!");			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않음..");
		} catch (IOException e) {
			System.out.println("쓰기작업 중 오류가 발생했습니다.");
		}

	}

}
