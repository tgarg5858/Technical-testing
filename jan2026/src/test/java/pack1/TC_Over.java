package pack1;

class car
{
	int nocyc;
	int noval;
	int enginepower;
	boolean ispowersteering;
	
	car()
	{
		nocyc=3;
		noval=4;
		enginepower=46;
		ispowersteering=false;
	}
	car(boolean ispowersteering)
	{
		this.ispowersteering=ispowersteering;
		
	}
	car(int nocyc,int noval,int enginepower){
		this.nocyc=nocyc;
		this.noval=noval;
		this.enginepower=enginepower;
		this.ispowersteering=true;
	}
}

public class TC_Over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj=new car();
		System.out.println(obj.nocyc);
		
		car obj2=new car(true);
		System.out.println(obj2.ispowersteering);
		
		car obj3=new car(4,50,4);
		System.out.println("noOfCyclinder: " + obj.nocyc);
		System.out.println("noofValves:"+obj3.noval);
		System.out.println("enginePower: "+obj3.enginepower);
		System.out.println("ispoersteering:"+obj3.ispowersteering);
	}

}
