package pack1;

class base
{
	public void basemethod()
	{
		System.out.println("Base Method");
	}
}
class Derived extends base
{
	public void derivedmethod(){
		System.out.println("Derived Method");
	}
}

public class TC_inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived derived=new Derived();
		System.out.println(derived instanceof Derived);
		
		derived.basemethod();
		derived.derivedmethod();
		
	}

}
