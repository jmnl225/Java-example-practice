
public class Main {
	
	//------------------- 6-6 �������� -----------------------
	
	//�� �� (x,y)�� (x1, y1)���� �Ÿ� ���ϱ�
	
	static double getDistance(int x, int y, int x1, int y1) {
		double dist;
		double a= y1-y;
		double b= x1-x;
		dist=Math.pow(a, 2)+Math.pow(b, 2);
		
		return Math.sqrt(dist);
	}
	
	public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));
	}
	
}
