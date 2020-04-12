class Student {
	String index;
	String firstName;
	String lastName;
	
	List<Integer> labPoints;

	public Student(String index; String firstName; String lastName, List<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}
	
	public String getIndex(){
		return index;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public List<Student> getLabPoints(){
		return labPoints;
	}
	
	public void setIndex(String index){
		this.index = index;
	}
	
	public void setFirstName(String FirstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String LastName){
		this.lastName = lastName;
	}
	
	public void setLabPoints(List<Integer> LabPoints){
		this.labPoints = labPoints;
	}

	public double getAverage() {
		double avg = 0;
		for(Integer lab : labPoints){
			avg += lab;
		}
		return avg / labPoints.size();
	}

	public boolean hasSignature() {
		return labPoints.size() > 8;
	}
}
