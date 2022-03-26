
public class Surgeon extends HospitalEmployee {
	 String Operating ;
	 Boolean True  ;
	
	

	public Surgeon(String name, int number,String operating, Boolean true1) {
		super (name,number);
		Operating = operating;
		True = true;
	}

	@Override
	public String toString() {
		return ""+getName()+ " "+ getNumber()+" " + Operating + " Operating: "  +  True + "";
	}

	public void work() {
		System.out.println (getName() + " works for the hospital. Vincent is operating now");		
	}

}
