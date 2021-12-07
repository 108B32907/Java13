public class Class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int num=12;
			int den[]= {12,0,3,0,0,4};
			for(int i=0;i<10;i++) {
				System.out.println("ans="+num/den[i]);
			}
		}
		catch(Exception e) { //捕捉try區塊內的例外
			System.out.println("捕捉到例外了");
		}
	}

}