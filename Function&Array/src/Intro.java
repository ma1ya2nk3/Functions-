
public class Intro {
	
    public static int val=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition();
		addition(10,25);
		int val = 200;
		System.out.println(val);
		System.out.println(Intro.val);
	  int sum =	additionReturn(25,45);
	  System.out.println(sum);

	}
	public static void addition() {
		int a= 10;
		int b= 20;
		int c= a+b;
		System.out.println(c);
	}
	public static void addition(int a,int b) {
		
		int z = a+b;
		System.out.println(z);
	}
	public static int additionReturn(int a,int b) {
		int add = a+b;
		return add;
	}

}
