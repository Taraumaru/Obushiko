package kadaikadai;

public class Car
{ 
        private Siren siren;
        Car(Siren siren)
        {
        	this.siren=siren;
        }
        
        public void siren()
        {
        	siren.siren();
        }
}
