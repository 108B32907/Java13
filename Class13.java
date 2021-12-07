import java.util.Scanner;
class Exception520 extends Exception{ //自訂的例外
	
}
public class Class13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		try {
			if(n.equals("520")){
				throw new Exception520();  //判斷字串n是否等於字串520 若成立則拋出例外 
			}
			else {
				System.out.println(n); //否則印出n
			}
		}
		catch(Exception520 e) {
			System.out.println("這是由字串520引起"); //捕捉由try區塊拋出的例外
			
		}
	}

}
