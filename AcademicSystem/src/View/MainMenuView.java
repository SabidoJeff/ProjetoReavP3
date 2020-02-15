package View;

public class MainMenuView {
	private Entry entry;
	
	public MainMenuView() {
		entry = Entry.GetInstance();
	}
	
	public int MainMenu() {
		System.out.println("\n\n\n\n\n");
		System.out.println("Bem-vindo ao menu principal");
		System.out.println("(1) Pessoal");
		System.out.println("(2) Projetos");
		System.out.println("(3) Sair.");
		System.out.printf("Digite uma opcao:");
		int option = entry.GetInt();
		System.out.println("\n\n\n\n");
		return option;
	}
	
	public void ErrorMessage(String Message) {
		System.out.println("\n\n\n\n");
		System.out.println("Erro:"+Message);
		System.out.println("Tecle ENTER para continuar...");
		this.entry.GetString();
		System.out.println("\n\n\n\n");
	}
	
	public void Message(String Message) {
		System.out.println("\n\n\n\n");
		System.out.println("Mensagem:"+Message);
		System.out.println("Tecle ENTER para continuar...");
		this.entry.GetString();
		System.out.println("\n\n\n\n");
	}
	
}
