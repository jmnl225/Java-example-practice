
public class Marine implements Unit, Levelupable{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("총알 발사");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("걸어서 이동");
	}

	@Override
	public void levelup() {
		// TODO Auto-generated method stub
		System.out.println("레벨업 마린!");
	}
	
}
