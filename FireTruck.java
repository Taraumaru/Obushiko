package kadaikadai;

public class FireTruck extends Car
{
	FireTruck(Siren siren)
	{
		super(siren);
	}
	   
	public void siren()
	{
		System.out.println("サイレン鳴らしますよ"); 
	    super.siren();
	}
}
