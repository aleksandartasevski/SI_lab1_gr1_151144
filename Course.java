class Course {
	List<Student> students;
	
	public Course(){
		this.students = new ArrayList<Student>();
	}
	
	public void addStudent(Student newStudent){
		this.students.add(newStudent);
	}
	
	public int totalStudentsWithSignature(){
		int counter = 0;
		for(Student s : students){
			if(s.hasSignature()) counter++;
		}
		return counter;
	}
	
}