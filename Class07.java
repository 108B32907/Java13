
public class Class07 {
	public static int test(int num,int den) throws ArithmeticException { //�w�q���test�ߥX�ҥ~
		return num/den; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			test(12,0); //�I�s���
		}
		catch(ArithmeticException e) {
			System.out.println("���Ƭ�0"); //����try�϶������ҥ~
		}
		finally {
			System.out.println("end of main() method!!");
		}
	}

}
