package Controls;
import Models.*;
import java.util.*;

public class DataBase {
	
	private ArrayList<Project> Projects;
	private ArrayList<Professor> Professors;
	private ArrayList<Student> Students;
	private ArrayList<Researcher> Researchers;
	
	private static DataBase Instance;
	
	private DataBase() {
		
		this.Projects = new ArrayList();
		this.Professors = new ArrayList();
		this.Students = new ArrayList();
		this.Researchers = new ArrayList();
	}
	
	
	public static DataBase GetInstance() {
		if(Instance == null) {
			Instance = new DataBase();
		}
		return Instance;
	}
	
	public boolean AddStudent(Student New) {
		String Registration = New.getRegistration();
		Student Check;
		
		int i, index = Students.size();
		
		for(i=0; i<index; i++) {
			Check = Students.get(i);
			if(Check.getRegistration() == Registration) {
				return false;
			}
		}
		Students.add(New);
		
		return true;
	}
	
	public boolean AddResearcher(Researcher New) {
		
		String Registration = New.getRegistration();
		Researcher Check;
		
		int i, index = Researchers.size();
		
		for(i=0; i<index; i++) {
			Check = Researchers.get(i);
			if(Check.getRegistration() == Registration) {
				return false;
			}
		}
		Researchers.add(New);
		
		return true;
	}
	
	public boolean AddProfessor(Professor New) {
		String Registration = New.getRegistration();
		Professor Check;
		
		int i, index = Professors.size();
		
		for(i=0; i<index; i++) {
			Check = Professors.get(i);
			if(Registration.equals(Check.getRegistration())) {
				return false;
			}
		}
		Professors.add(New);
		
		return true;
	}
	
	public boolean DeletePerson(String Registration) {
		
		Student TestStudent;
		Professor TestProfessor;
		Researcher TestResearcher;
		
		int i, index;
		
		index = Professors.size();
		for(i=0; i<index; i++) {
			TestProfessor = Professors.get(i);
			if(Registration.equals(TestProfessor.getRegistration())) {
				Professors.remove(i);
				return true;
			}
		}
		
		index = Students.size();
		for(i=0; i<index; i++) {
			TestStudent = Students.get(i);
			if(Registration.equals(TestStudent.getRegistration())) {
				Students.remove(i);
				return true;
			}
		}
		
		index = Researchers.size();
		for(i=0; i<index; i++) {
			TestResearcher = Researchers.get(i);
			if(Registration.equals(TestResearcher.getRegistration())) {
				Researchers.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	public String TakeInfo(String Name) {
			
		Student TestStudent;
		Professor TestProfessor;
		Researcher TestResearcher;
		
		int i, index;
			
		index = Professors.size();
		for(i=0; i<index; i++) {
			TestProfessor = Professors.get(i);
			if(Name.equals(TestProfessor.getName())) {
				return TestProfessor.ToString();
			}
		}
			
		index = Students.size();
		for(i=0; i<index; i++) {
			TestStudent = Students.get(i);
			if(Name.equals(TestStudent.getName())) {
				return TestStudent.ToString();
			}
		}
			
		index = Researchers.size();
		for(i=0; i<index; i++) {
			TestResearcher = Researchers.get(i);
			if(Name.equals(TestResearcher.getName())) {
				return TestResearcher.ToString();
			}
		}
		
		return "Colaborador nao encontrado";
	}
	
	
}
