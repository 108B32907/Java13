public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num=12;
			int den[]= {12,0,3,0,0,4};
			for(int i=0;i<10;i++) {
				System.out.println("ans="+num/den[i]);
			}
		}
		catch(ArithmeticException e){ //捕捉try區塊內的例外
			System.out.println("除數為0");
		}
		catch(ArrayIndexOutOfBoundsException e) { //捕捉try區塊內的例外
			System.out.println("陣列標註超出範圍");
		}
	}

}