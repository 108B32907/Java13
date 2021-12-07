
public class Class07 {
	public static int test(int num,int den) throws ArithmeticException { //定義函數test拋出例外
		return num/den; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			test(12,0); //呼叫函數
		}
		catch(ArithmeticException e) {
			System.out.println("除數為0"); //捕捉try區塊內的例外
		}
		finally {
			System.out.println("end of main() method!!");
		}
	}

}
