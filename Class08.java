class ctest{ //�w�q���O
	public int test(int num,int den) throws ArithmeticException { //�w�q�Ѩ��test�ߥX�ҥ~
		return num/den;
	}
}
public class Class08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctest ct=new ctest();
		try{
			ct.test(12,0); //�I�s���O����test���
		}
		catch(ArithmeticException e) { //����try�϶������ҥ~
			System.out.println("���Ƭ�0");
		}
		finally { 
			System.out.println("end of main() method!!");
		}
	}

}

