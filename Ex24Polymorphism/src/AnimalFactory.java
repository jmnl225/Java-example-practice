

public class AnimalFactory {
	
	//AnimalÀ» ............................. ¸¸µé¾î³¿.........................................
	
	
	Animal makeAnimal(int n) {
		
		Animal ani=null;
	
		switch(n) {
		
		case 1:
			ani= new Dog();
			break;
		case 2:
			ani= new Cat();
			break;
		case 3:
			ani= new Pig();
			break;	
		
		}
		
		return ani;
		
	}
	
	
	
	
	
	
	
	
	
	
	/*
	 Animal makeAnimal(int n) {
		
		switch(n) {
		case 1:
			Dog d= new Dog();
			return d;			
		
			
		case 2:
			Cat c= new Cat();
			return c;
			
			
		case 3:
			Pig p= new Pig();
			return p;
			
			
		default:
			return null;
			
		}
		
	}
		*/
	
	
}
