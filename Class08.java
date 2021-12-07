class ctest{ //定義類別
	public int test(int num,int den) throws ArithmeticException { //定義由函數test拋出例外
		return num/den;
	}
}
public class Class08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctest ct=new ctest();
		try{
			ct.test(12,0); //呼叫類別內的test函數
		}
		catch(ArithmeticException e) { //捕捉try區塊內的例外
			System.out.println("除數為0");
		}
		finally { 
			System.out.println("end of main() method!!");
		}
	}

}

