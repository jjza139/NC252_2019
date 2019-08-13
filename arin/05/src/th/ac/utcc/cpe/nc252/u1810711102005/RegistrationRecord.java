package th.ac.utcc.cpe.nc252.u1810711102005;

public class RegistrationRecord {
	int x=0;
	private Student student;
	private Subject[] subjects;
	
	public RegistrationRecord() {
		x=0;
		student = new Student();
		subjects = new Subject[10];
		for(int i=0; i<10;i++) {
			subjects[i] = new Subject();
		}
	}
	
	public RegistrationRecord(int n) {
		x=0;
		student = new Student();
		subjects = new Subject[n];
		for(int i=0; i<n; i++) {
			subjects[i] = new Subject();
		}
	}
	
	void addSubject(Subject sub){
		if(x < subjects.length-1) {
			subjects[x]= sub;
			x++;
		}
	}
	
	void display () {
		for(int i=0; i<subjects.length-1; i++) {
			if (subjects[i] != null)
			System.out.println(subjects[i].getName());
		}
	}
	
	
	
	
	
	
}
