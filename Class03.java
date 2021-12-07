public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 								//檢查程式區塊
			int num=12,den=0;
			int ans=num/den;  
			System.out.println("ans="+ans);
		}
		catch(ArithmeticException e){	//try區塊內的捕捉例外
			System.out.println("除數為0");
		}
		finally {
			System.out.println("end of main() method!!"); 
		}
	}

}