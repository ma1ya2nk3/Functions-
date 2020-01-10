import java.util.Scanner;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int snum =sc.nextInt();
		int db = sc.nextInt();
		System.out.println(anybase(snum,db));

	}
	public static int anybase(int snum,int db) {
		int mult = 1;
		int ans = 0;
				
		while(snum!=0) {
			int rem = snum%db;
		   ans = ans+(rem*mult);
			mult = mult*10;
			snum = snum/db;
			
			
		}
		return ans;
	}

}
