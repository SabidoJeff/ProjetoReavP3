package Models;

import java.util.ArrayList;

public class Professor extends Person{
	
	private ArrayList<Project> Projects;
	
	public Professor(String Name, int Age, String Registration, String Email) {
		super(Name, Age, Registration, Email);
		this.Projects = new ArrayList();
	}
	
	public boolean AddProject(Project New) {
		Projects.add(New);
		return true;
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
		return super.toString() + "Projetos:\n" + Projects.toString()+ "\n"; 
	}
}
