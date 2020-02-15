package Models;
import java.util.*;

public class Student extends Person{
	private int Period;
	private ArrayList<Project> Projects;
	public Student(String Name, int Age, String Registration, String Email, int Period) {
		super(Name, Age, Registration, Email);
		Projects = new ArrayList();
		this.Period = Period;
	}

	public int getPeriod() {
		return Period;
	}

	public void setPeriod(int period) {
		Period = period;
	}
	
	public boolean AddProject(Project New) {
		if(Projects.size() < 2) {
			Projects.add(New);
			return true;
		}
		return false;
	}
	
	public boolean RemoveProject(Project Removed) {
		int index = Projects.indexOf(Removed);
		if(index >=0) {
			Projects.remove(index);
			return true;
		}
		return false;
	}
	
	public String ToString() {
		return super.ToString() + 
				"Periodo: " + String.valueOf(Period) + "\n" +
				"Projetos: " + Projects.toString();
	}
	
}
