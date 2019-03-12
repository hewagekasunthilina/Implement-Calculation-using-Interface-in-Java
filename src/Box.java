
public class Box implements ICompute {

	private int length, width, height;
	   private int volume;
	
	   
	   
	public Box(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	
	}

	@Override
	public void calculate() {
		volume = width * length * height;
		
		   
	}

	@Override
	public void display() {
		
		System.out.println("Volume :" +volume);

	}

}
