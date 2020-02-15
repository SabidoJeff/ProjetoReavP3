package Controls;
import View.*;
import Models.*;

public class PersonTools {
	
	private DataBase DataBase ;

	private PersonsMenuView PersonsView;
	
	public PersonTools(PersonsMenuView PersonsView) {
		this.PersonsView = PersonsView;
		this.DataBase = DataBase.GetInstance();
	}
	
	public boolean RegisterPerson() {
		
		String Name = PersonsView.GetName();
		int Age = PersonsView.GetAge();
		String Registration = PersonsView.GetRegistration();
		String Email = PersonsView.GetEmail();
		int option = PersonsView.TypePerson();
		boolean result = true;
		
		while(option<1 || option>3) {
			option = PersonsView.TypePerson();
		}
		
		switch(option) {
		case 1:
			
			int Period = PersonsView.GetPeriod();
			Student NewStudent = new Student(Name, Age, Registration, Email, Period);
			result = DataBase.AddStudent(NewStudent);
			break;
			
		case 2:
			
			Researcher NewResearcher = new Researcher(Name,Age,Registration,Email);
			result = DataBase.AddResearcher(NewResearcher);
			
		case 3:
			
			Professor NewProfessor = new Professor(Name,Age,Registration,Email);
			result = DataBase.AddProfessor(NewProfessor);
		}
		
		return result;
	}
	
	public boolean DeletePerson() {
		String Registration = PersonsView.GetRegistration();
		boolean result = DataBase.DeletePerson(Registration);
		return result;
	}
	
	public void ShowPersons() {
		String Name = PersonsView.GetName();
		String info = DataBase.TakeInfo(Name);
		PersonsView.PrintInfo(info);
	}
	
	
}
