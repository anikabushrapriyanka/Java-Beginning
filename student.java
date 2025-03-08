public class student{
	private String name;
	private String id;
	private int age;
	private float cgpa;
	public student(){
		System.out.println("E-Constructor");
	}
	public student(String name, String id, int age, float cgpa){
		System.out.println("P-Constructor");
		setName(name);
		setId(id);
		setAge(age);
		setCgpa(cgpa);
		
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setAge(int age){
		if(age>=0){
		this.age=age;
		} else{
			System.out.println("Age must be positive");
		}
	}
	public int getAge(){
		return age;
	}
	public void setCgpa(float cgpa){
		if(cgpa>0 && cgpa<=4){
		this.cgpa=cgpa;
		} else{
			System.out.println("Invalid CGPA");
		}
	}
	public float getCgpa(){
		return cgpa;
	}

public void showDetails(){
	System.out.println("Name: "+ name);
	System.out.println("Id: "+id);
	System.out.println("Age: "+age);
	System.out.println("Cgpa: "+cgpa);
}
}