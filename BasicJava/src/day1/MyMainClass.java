package day1;

public class MyMainClass {

	public static void main(String[] args) {
		
		// --- from jobSeekerUser-Job Seek 
		JobSeeker jobSeekerUser = new JobSeeker(); // code to create object
		
		jobSeekerUser.setUsername("ramesh123");
		jobSeekerUser.setFullName("Ramesh Kumar");
		jobSeekerUser.setAddress("123-Pune");
		jobSeekerUser.setEducationStream("BTech- IT");
		jobSeekerUser.setWorkingExperiance(0);
		jobSeekerUser.setCurrentCTC(500000);
		
		// ----------  print/ read the values of object ----
		// --- From jobSeekerUsers as HR 
		
		System.out.println(" Candidate  full Name "+jobSeekerUser.getFullName());
		System.out.println(" Candidate Education :- "+jobSeekerUser.getEducationStream());
		
		
	}
}
