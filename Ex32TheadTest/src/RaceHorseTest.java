
public class RaceHorseTest {
	public static void main(String[] args) {
		
		
		Horse h1= new Horse("õ����");
		Horse h2= new Horse("���丶");
		Horse h3= new Horse("ĳ��");
		
		System.out.println("���� ����!");
		
		h1.start();
		h2.start();
		h3.start();
		
		
		
		
	}

}








class Horse extends Thread{
	
	String name;
	
	//������
	public Horse(String name) {
		this.name= name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<20; i++) {
			System.out.println(name+" : �ٱ״� �ٱ״�");
			
			//0.4�� ��� == 400ms
			try {
				Thread.sleep(400);
			} catch (Exception e) {}
		}
		
		System.out.println(name+ " ����");
	}
	
	
}