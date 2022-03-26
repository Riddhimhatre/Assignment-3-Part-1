
public class Nurse extends HospitalEmployee{
	 int numOfPatients;

	public Nurse(String name, int number,int numOfPatients) {
		super(name,number);
		this.numOfPatients = 6;
	}

	@Override
	public String toString() {
		return ""+getName()+" " +getNumber()+" has "+ numOfPatients + " patients.";
	}

	
	public void work() {
		System.out.println (getName() + " works for the hospital. Sonny is a nurse with 6 patients");
	}
	}


