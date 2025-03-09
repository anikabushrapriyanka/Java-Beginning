public class Triangle{
	private int x;
	private int y;
	private int z;
	public  Triangle (){
		System.out.println("E-Constructor");
	}
	public  Triangle(int x, int y, int z){
		System.out.println("P-Constructor");
		setX(x);
		setY(y);
		setZ(z);
	}
	public void setX(int x){
		this.x=x;
	}
	public int getX(){
		return x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int getY(){
		return y;
	}
	public void setZ(int z){
		this.z=z;
	}
	public int getZ(){
		return z;
	}
	public void showInfo(){
		System.out.println("Triangle: "+ x+","+y+","+z);
	}
	public void testTriangle(){
		if(x==y && y==z){
			System.out.println("The triangle is equilateral(All sides are equal)");
		}else if(x==y|| y==z || z==x){
		    System.out.println("The triangle is isosceles(Two sides are equal)");

		}else{
		    System.out.println("The triangle is scalene(No sides are equal)");

		}
	}
}

