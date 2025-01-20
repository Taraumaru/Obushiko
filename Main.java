package kadaikadai;

public class Main 
{
	public static void main(String[] args) 
    { 
            System.out.println("-----救急車を作ります-----"); 
            Ambulance amb = new Ambulance(new AmbulanceSiren()); 
            amb.siren(); 
            System.out.println("-----消防車を作ります-----"); 
            FireTruck fir = new FireTruck(new FireTruckSiren()); 
            fir.siren();
    }
}
