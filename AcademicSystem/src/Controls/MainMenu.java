package Controls;
import View.*;

public class MainMenu {
	
	private MainMenuView MainView;
	private PersonsMenuView PersonsView;
	
	private PersonTools PersonTools;
	
	public MainMenu() {
		this.MainView = new MainMenuView();
		this.PersonsView = new PersonsMenuView();
		
		this.PersonTools = new PersonTools(PersonsView);
	}
	
	public void StartMenu() {
		int option = 0;
		while(option != 3) {
			option = this.MainView.MainMenu();
			if(option <1 || option >3) {
				this.MainView.ErrorMessage("A opção inserida não é válida!");
			}else {
				switch (option) {
				case 1:
					PersonsMenu();
					break;
				case 2:
					//ProjectsMenu();
					break;
				case 3:
					break;
				default:
					this.MainView.ErrorMessage("A opção inserida não é válida!");
				}
					
			}
		}
	}
	
	private void PersonsMenu() {
		int option=1;
		while(option!=5) {
			
			option = this.PersonsView.MainMenu();
			
			if(option < 1 || option > 5) {
				MainView.ErrorMessage("A opção inserida não é válida!");
			}else {
				switch(option) {
				
				case 1:
					if(this.PersonTools.RegisterPerson()) {
						this.MainView.Message("Pessoa inserida com sucesso");
					}else {
						this.MainView.Message("Pessoa nao inserida, verificar se ja nao esta registrada");
					}
					break;
					
				case 2:
					if(this.PersonTools.DeletePerson()) {
						this.MainView.Message("Colaborador excluido com sucesso");
					}else {
						this.MainView.Message("Colaborador nao econtrado");
					}
					break;
					
				case 3:
					break;
				case 4:
					this.PersonTools.ShowPersons();
					break;
				}
			}
		}
		
	}
	
}
