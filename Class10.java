class RadiusIsNegative extends Exception{	 //自訂的例外
}
class RadiusTooLarge extends Exception{	//自訂的例外
}
class ccircle{ //定義類別
	private double radius;  
	public void setRadius(double r) throws RadiusIsNegative,RadiusTooLarge //定義setRadius函數拋出例外
	{
		if(r<0) 
			throw new RadiusIsNegative(); //若判別式成立則拋出例外
		else if(r>100)
			throw new RadiusTooLarge(); //若判別式成立則拋出例外
		else
			radius=r;//否則拋出例外
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
			cir.setRadius(120); //呼叫類別內函數
		}
		catch(RadiusTooLarge e) { //捕捉try區塊內的例外
			System.out.println(e+"throwed");  
		}
		catch(RadiusIsNegative e) { //捕捉try區塊內的例外
			System.out.println(e+"throwed");  
		}
		cir.show();
	}

}
