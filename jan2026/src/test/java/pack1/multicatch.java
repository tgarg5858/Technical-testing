package pack1;

public class multicatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    

    try {
    	String str = "Hello";
        int a = str.length();
        int b = 42 / 8;
        int c[] = {1};
        c[42] = 99;
    } catch (ArithmeticException e) {
        System.out.println("Divide by zero: " + e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException " + e.getMessage());
    } finally {
        System.out.println("Finally");
    }

    System.out.println("After try catch");


	}

}
