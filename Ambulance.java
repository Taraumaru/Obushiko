package kadaikadai;

public class Ambulance extends Car
{
	Ambulance(Siren siren)
	{
		super(siren);
	}
    
    public void siren()
    {
    	System.out.print("サイレン鳴らしますよ"); 
        super.siren();
    }
}
