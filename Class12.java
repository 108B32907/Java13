class NotTriangle extends Exception{ //�ۭq�ҥ~
}
class EquilateralTriangle extends Exception{ //�ۭq�ҥ~
}
class NotEquilateralTriangle extends Exception{ //�ۭq�ҥ~
}
public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=3;
		int c=3;
		try {
			triangle(a,b,c); //�I�striangle���
		}
		catch(NotTriangle e) { //�����ҥ~
			System.out.println("�o���O�T����"); //
		}
		catch(EquilateralTriangle e) { //�����ҥ~
			System.out.println("�o�O���T����");
		}
		catch(NotEquilateralTriangle e) { //�����ҥ~
			System.out.println("�o���O���T����");
		}
	}
	public static void triangle(int a,int b,int c) throws NotTriangle,EquilateralTriangle,NotEquilateralTriangle{//���w���triangle�ߥX�ҥ~
		if((a+b)<c || (a+c)<b || (b+c)<a) {
			throw new NotTriangle(); //�Y�P�O�����߫h�ߥX�ҥ~
		}
		else if(a==b && a==c && b==c) {
			throw new EquilateralTriangle(); //�Y�P�O�����߫h�ߥX�ҥ~
		}
		else {
			throw new NotEquilateralTriangle(); //�_�h�ߥX�ҥ~
		}
	}

}
