import java.util.Scanner;
class Exception520 extends Exception{ //�ۭq���ҥ~
	
}
public class Class13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		try {
			if(n.equals("520")){
				throw new Exception520();  //�P�_�r��n�O�_����r��520 �Y���߫h�ߥX�ҥ~ 
			}
			else {
				System.out.println(n); //�_�h�L�Xn
			}
		}
		catch(Exception520 e) {
			System.out.println("�o�O�Ѧr��520�ް_"); //������try�϶��ߥX���ҥ~
			
		}
	}

}
