class NotTriangle extends Exception{ //自訂例外
}
class EquilateralTriangle extends Exception{ //自訂例外
}
class NotEquilateralTriangle extends Exception{ //自訂例外
}
public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=3;
		int c=3;
		try {
			triangle(a,b,c); //呼叫triangle函數
		}
		catch(NotTriangle e) { //捕捉例外
			System.out.println("這不是三角形"); //
		}
		catch(EquilateralTriangle e) { //捕捉例外
			System.out.println("這是正三角形");
		}
		catch(NotEquilateralTriangle e) { //捕捉例外
			System.out.println("這不是正三角形");
		}
	}
	public static void triangle(int a,int b,int c) throws NotTriangle,EquilateralTriangle,NotEquilateralTriangle{//指定函數triangle拋出例外
		if((a+b)<c || (a+c)<b || (b+c)<a) {
			throw new NotTriangle(); //若判別式成立則拋出例外
		}
		else if(a==b && a==c && b==c) {
			throw new EquilateralTriangle(); //若判別式成立則拋出例外
		}
		else {
			throw new NotEquilateralTriangle(); //否則拋出例外
		}
	}

}
