
public class Tank implements Unit, Levelupable{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("포 발사");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("이동");
	}

	@Override
	public void levelup() {
		// TODO Auto-generated method stub
		System.out.println("레벨업 탱크!");
	}
	
	
}
