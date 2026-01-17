package pack1;

import java.util.*;

class pers{
	String name;
	float age;
	pers(){
	}
	pers(float age){
		
		this.age=age;
	}
	pers(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
		
}


class account extends pers {
	
	
	long accnumber;
	double balance;

	
	public account( String name, long accnumber, double balance) {
		super(name);
		this.accnumber = accnumber;
		this.balance = balance;
	}
 

	public long getAccnumber() {
		return accnumber;
	}
 
 
	public void setAccnumber(long accnumber) {
		this.accnumber = accnumber;
	}
 
 
//	public double getBalance() {
//		return balance;
//	}
 
 
	public void setBalance(double balance) {
		this.balance = balance;
	}
 
 
	public void depoist(int deposit_amount) {
		balance = balance+deposit_amount;
					
	}
	
	
	public void withdraw(int withdraw_amount) {
		if (balance >= 500 && balance > withdraw_amount ) {
		balance=balance-withdraw_amount;
	}
		else {
			System.out.println("Insuficient balance");
		}
	}
	
 
	public void getbalance() {
		System.out.print("Current balance is ");
		System.out.println(balance);
	}
	
}

class saving extends account{
	public saving(String name, long accnumber, double balance) {
		super(name,accnumber,balance);
	}

	final double min=500;
	@Override
	public void withdraw(int withdraw_amount) {
		if (balance>=min & balance>withdraw_amount ) {
		balance=balance-withdraw_amount;
	}
		else {
			System.out.println("Insuficient balance");
		}
	}
	
}

class current extends account{

	private double overdraftLimit;
	 
    public current(String name ,int accnumber, double balance, double overdraftLimit) {
        super(name,accnumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
 
    @Override
    public void withdraw(int amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Current Account withdrawal successful.");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded. Withdrawal denied.");
        }
    }
 
    public boolean withdrawWithStatus(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class detail  {
	Scanner sc = new Scanner(System.in);
	account a1;
	saving s1;
	current c1;
	 detail(String name, long accnumber, double balance){
		 a1=new account(name,accnumber,balance);
	}
	void menu() {
		
	int functionality;
	do {
		System.out.println();
		System.out.println("chose 1 for depoist");
		System.out.println("chose 2 for withdraw");
		System.out.println("chose 3 for get balance");
		System.out.println("chose 4 or any else for exit");
		
	functionality = sc.nextInt();
	switch(functionality) {
	case 1:
	System.out.println("enter amount to be depoist");
	int amount = sc.nextInt();
	a1.depoist(amount);
	a1.getbalance();
	break;
	case 2:
	System.out.println("enter amount to be withdraw");
	amount = sc.nextInt();
	a1.withdraw(amount);
	a1.getbalance();
	break;
	case 3:
	a1.getbalance();
	break;
	default:
		System.out.println("Exit..");
	}
	}while(functionality ==1 || functionality ==2 || functionality ==3);
	
	}
	

}

public class lab_21 {
	public static void main(String[] args) {
		
		detail d = new detail("Smith",00000001,2000);
		d.menu();
		
		
	}
}
		

