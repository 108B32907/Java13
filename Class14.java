import java.util.InputMismatchException;
import java.util.Scanner;
class IntergerTooSmall extends Exception{ //�ۭq���ҥ~
	
}
class IntergerTooLarge extends Exception{ //�ۭq���ҥ~
	
}
public class Class14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		int  n=sc.nextInt();
		try {
			if(n<10) { 						
				throw new IntergerTooSmall(); //�Yn<10 �ߥX�ҥ~ 
			}
			else if(n>70) {
				throw new IntergerTooLarge(); //�Yn>70 �ߥX�ҥ~
			}
			else {
				System.out.println(n); //�_�h��Xn
			}
		}
		catch(IntergerTooSmall e) { 		//����try�϶���n<10���ҥ~
			System.out.println("�z��J����ƪ��ȤӤp");
		}
		catch(IntergerTooLarge e) {			//����try�϶���n>70���ҥ~
			System.out.println("�z��J����ƪ��ȤӤp");
		}
		catch(InputMismatchException e) { //����try�϶��� n������ƪ��ҥ~
			System.out.println("�z��J�����O���");
		}
	}

}
