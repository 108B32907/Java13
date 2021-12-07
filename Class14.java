import java.util.InputMismatchException;
import java.util.Scanner;
class IntergerTooSmall extends Exception{ //自訂的例外
	
}
class IntergerTooLarge extends Exception{ //自訂的例外
	
}
public class Class14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		int  n=sc.nextInt();
		try {
			if(n<10) { 						
				throw new IntergerTooSmall(); //若n<10 拋出例外 
			}
			else if(n>70) {
				throw new IntergerTooLarge(); //若n>70 拋出例外
			}
			else {
				System.out.println(n); //否則輸出n
			}
		}
		catch(IntergerTooSmall e) { 		//捕捉try區塊內n<10的例外
			System.out.println("您輸入的整數的值太小");
		}
		catch(IntergerTooLarge e) {			//捕捉try區塊內n>70的例外
			System.out.println("您輸入的整數的值太小");
		}
		catch(InputMismatchException e) { //捕捉try區塊內 n不為整數的例外
			System.out.println("您輸入的不是整數");
		}
	}

}
