class RadiusIsNegative extends Exception{	 //�ۭq���ҥ~
}
class RadiusTooLarge extends Exception{	//�ۭq���ҥ~
}
class ccircle{ //�w�q���O
	private double radius;  
	public void setRadius(double r) throws RadiusIsNegative,RadiusTooLarge //�w�qsetRadius��ƩߥX�ҥ~
	{
		if(r<0) 
			throw new RadiusIsNegative(); //�Y�P�O�����߫h�ߥX�ҥ~
		else if(r>100)
			throw new RadiusTooLarge(); //�Y�P�O�����߫h�ߥX�ҥ~
		else
			radius=r;//�_�h�ߥX�ҥ~
	}
	public void show() {
		System.out.println("area="+3.14*radius*radius);
	}
}
public class Class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ccircle cir=new ccircle(); 
		try {
			cir.setRadius(120); //�I�s���O�����
		}
		catch(RadiusTooLarge e) { //����try�϶������ҥ~
			System.out.println(e+"throwed");  
		}
		catch(RadiusIsNegative e) { //����try�϶������ҥ~
			System.out.println(e+"throwed");  
		}
		cir.show();
	}

}
