
public class Main {


	public static void main(String[] args) {
		
		 ICompute ob2 = new Box(10, 20, 30);
	      ob2.calculate();
	      ob2.display();
	      System.out.println();
	      
	     ICompute ob1=new Person("mala", 766, 9, 8);
	      ob1.calculate();
	      ob1.display();
	      
	     
	}

}
