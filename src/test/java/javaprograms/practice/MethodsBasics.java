package javaprograms.practice;

public class MethodsBasics 
{

	public static void main(String[] args) 
	{
		
		MethodsBasics d=new MethodsBasics();
		d.getData();
		String rd=d.getData2();
		System.out.println(rd);
		getData3();
		
		CalledMethod cd=new CalledMethod();
		cd.getData();
		

	}
	
	void getData()
	{
		System.out.println("cs");
	}
	
	String getData2()
	{
		return "sarath";
	}
	
	static void getData3()
	{
		System.out.println("cs");
	}

}
