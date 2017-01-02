
public class TestAccount {

public static void main(String[] args) {
		
		Account1 a1 = new Account1("Ulf");
		Account1 a2 = new Account1("Anna");
		
		a1.deposit(200);
		a1.withdraw(100);
		a1.withdraw(50);
		
		a2.deposit(300);
		a2.transferTo(100, a1);
		a2.withdraw(50);
		a2.withdraw(50);
		a2.deposit(20);
		
		Account1 a3 = new Account1("Xiaoyi");
		a3.deposit(50);
		a3.transferTo(20, a1);
		
		a1.printAll();
		a2.printAll();
		a3.printAll();

	}
}

