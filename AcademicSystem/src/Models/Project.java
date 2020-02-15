package Models;
import java.util.*;

public class Project {
	
	private String Title;
	private String Agency;
	private int Value;
	private String Objective;
	private String Description;
	private ArrayList<Professor> Professors;
	private ArrayList<Researcher> Researchers;
	private ArrayList<Student> Students;
	
	public Project(String Title, String Agency, int Value, String Objective, String Description) {
		this.Professors = new ArrayList();
		this.Researchers = new ArrayList();
		this.Students = new ArrayList();
		this.Title = Title;
		this.Agency = Agency;
		this.Value = Value;
		this.Objective = Objective;
		this.Description = Description;
	}

	public String getTitle() {
		return Title;
	}

	public String getAgency() {
		return Agency;
	}

	public int getValue() {
		return Value;
	}

	public String getObjective() {
		return Objective;
	}

	public String getDescription() {
		return Description;
	}
	
	public boolean AddStudent(Student New) {
		if(New.AddProject(this)) {
			Students.add(New);
			return true;
		}
		return false;
	}
	
	public boolean RemoveStudent(Student Removed) {
		if(Removed.RemoveProject(this)) {
			int index = Students.indexOf(Removed);
			Students.remove(index);
			return true;
		}
		return false;
	}
	
	public boolean AddProfessor(Professor New) {
		if(New.AddProject(this)) {
			Professors.add(New);
			return true;
		}
		return false;
	}
	
	public boolean RemoveProfessor(Professor Removed) {
		if(Removed.RemoveProject(this)) {
			int index = Professors.indexOf(Removed);
			Professors.remove(index);
			return true;
		}
		return false;
	}
	
	public boolean AddResearcher(Researcher New) {
		if(New.AddProject(this)) {
			Researchers.add(New);
			return true;
		}
		return false;
	}
	
	public boolean RemoveResearcher(Researcher Removed) {
		if(Removed.RemoveProject(this)) {
			int index = Researchers.indexOf(Removed);
			Researchers.remove(index);
			return true;
		}
		return false;
	}
	
	
	
	
}
