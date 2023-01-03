package day3.abstr;

abstract class Student   // class is abstract becoz of having abstract method inside
{
	public abstract void giveExam();
	public void accessLibrary()  // abstract class may have non-abstract methods as well
	{
		System.out.println("Show Library Card and Access Books");
	}
}

class BtectStudent extends Student
{
	public void doTechincalProject()
	{
		System.out.println(" Do Full Stack Project");
	}

	@Override   // child class of abstract class , should have to override abstract methods
	public void giveExam() {
		System.out.println(" Virtual Exams , Only MCQ Question");
		
	}

}
class MBAStudents extends Student
{
	public void productMarketing()
	{
		System.out.println("  Do Product reasearch in Local Market");
	}

	@Override
	public void giveExam() {
		System.out.println("Offline Exam , Subjective Questions and Interview");
	}
	
	
}

public class DemoClass {

	public static void main(String[] args) {
		
		DemoClass obj = new DemoClass();
		
		Student s = new BtectStudent();
		obj.printStudentDetails(s);
		
		s = new MBAStudents();
		obj.printStudentDetails(s);
		
		
		
	}
	
	public void printStudentDetails(Student s)
	{
		s.accessLibrary();
		s.giveExam();
		
		if(s instanceof BtectStudent) // avoiding class cast exception
		{
			BtectStudent stu = (BtectStudent)s; 
			stu.doTechincalProject(); // calling native method of child class
		}
		if(s instanceof MBAStudents)
		{
			MBAStudents stu = (MBAStudents)s;
			stu.productMarketing();
		}
	}
	
}






























