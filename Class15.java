import java.math.*;
import java.io.*;
class ArgumentOutOfBound extends Exception{ 	//�ۭq���ҥ~
	
}
public class Class15 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String n=buf.readLine(); //��Jn
		int num=Integer.parseInt(n); //�N�r��n�ഫ����ƧΦ�
		mysqrt(num); //�I�smysqrt���
	}
	public static void mysqrt(int n) { //�w�qmysqrt���
		try{							
			if(n<0) {
				throw new ArgumentOutOfBound(); //�Yn<0�h�ߥX�ҥ~
			}
			else {
				System.out.println(Math.sqrt(n)); //�_�h��Xn���}�ڸ�����
			}
		}
		catch(ArgumentOutOfBound e) { //������try�϶��a�ߥX���ҥ~
			System.out.println("n�p��0");  
		}
	}
	
}
