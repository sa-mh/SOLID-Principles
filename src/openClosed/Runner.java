package openClosed;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		FormalGreeting form = new FormalGreeting();
		CasualGreeting cas = new CasualGreeting();

		System.out.println(form.phrase());
		System.out.println(cas.phrase());

	}

}
