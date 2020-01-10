import java.util.Scanner;

public class Anybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int snum =sc.nextInt();
		int sb = sc.nextInt();
		System.out.println(anybase(snum,sb));

	}
	public static int anybase(int snum,int sb) {
		int mult = 1;
		int ans = 0;
				
		while(snum!=0) {
			int rem = snum%10;
		   ans = ans+(rem*mult);
			mult = mult*sb;
			snum = snum/10;
			
			
		}
		return ans;
	}

}
