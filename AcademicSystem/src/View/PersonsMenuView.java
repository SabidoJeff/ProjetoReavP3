package View;

public class PersonsMenuView {
	
	private Entry entry;
	
	public PersonsMenuView() {
		this.entry = Entry.GetInstance();
	}
	
	public int MainMenu() {
		System.out.println("\n\n\n\n");
		int option;
		System.out.println("Bem-Vindo ao menu de pessoal:");
		System.out.println("(1) Cadastrar um novo colaborador");
		System.out.println("(2) Deletar algum colaborador");
		System.out.println("(3) Incluir colaborador a um projeto");
		System.out.println("(4) Relação de colaboradores");
		System.out.println("(5) Voltar");
		System.out.printf("Digite uma opcao:");
		option = this.entry.GetInt();
		System.out.println("\n\n\n\n");
		return option;
	}
	
	public String GetName() {
		System.out.println("\n\n\n\n");
		String name;
		System.out.printf("Digite o Nome:");
		name = entry.GetString();
		System.out.println("\n\n\n\n");
		return name;
	}
	
	public int GetAge() {
		System.out.println("\n\n\n\n");
		System.out.printf("Digite a idade:");
		int age=entry.GetInt();
		while(age<=0) {
			System.out.println("Idade invalida, digite uma idade valida:");
			age=entry.GetInt();
		}
		return age;
	}
	
	public String GetRegistration() {
		System.out.println("\n\n\n\n");
		System.out.printf("Digite a Matricula:");
		String Registration = entry.GetString();
		return Registration;
	}
	
	public String GetEmail() {
		System.out.println("\n\n\n\n");
		System.out.printf("Digite o Email:");
		String Email = entry.GetString();
		return Email;
	}
	
	public int TypePerson() {
		System.out.println("\n\n\n\n");
		System.out.println("Digite o tipo de colaborador:");
		System.out.println("(1) Aluno");
		System.out.println("(2) Pesquisador");
		System.out.println("(3) Professor");
		System.out.printf("Digite a opcao:");
		int option = entry.GetInt();
		return option;
	}
	
	public int GetPeriod() {
		System.out.println("\n\n\n\n");
		System.out.println("Digite o periodo:");
		int period = entry.GetInt();
		return period;
	}
	
	public void PrintInfo(String Info) {
		System.out.println("\n\n\n\n");
		System.out.println(Info);
		System.out.println("Tecle ENTER para continuar...");
		entry.GetString();
		System.out.println("\n\n\n\n");
	}
	
	
}
