import java.math.*;
import java.io.*;
class ArgumentOutOfBound extends Exception{ 	//自訂的例外
	
}
public class Class15 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String n=buf.readLine(); //輸入n
		int num=Integer.parseInt(n); //將字串n轉換成整數形式
		mysqrt(num); //呼叫mysqrt函數
	}
	public static void mysqrt(int n) { //定義mysqrt函數
		try{							
			if(n<0) {
				throw new ArgumentOutOfBound(); //若n<0則拋出例外
			}
			else {
				System.out.println(Math.sqrt(n)); //否則輸出n的開根號的值
			}
		}
		catch(ArgumentOutOfBound e) { //捕捉到try區塊地拋出的例外
			System.out.println("n小於0");  
		}
	}
	
}
