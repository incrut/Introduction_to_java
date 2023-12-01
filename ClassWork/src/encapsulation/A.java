package encapsulation;

class B{
	protected String name;
	public void display_Emp(String x){
		name=x;
		System.out.println(name+"");
	}
}

class A extends B{
	
	public static void main(){

	
	A obj=new A();
	obj.name="John";
	System.out.println(obj.name+ " is his name");
}
}