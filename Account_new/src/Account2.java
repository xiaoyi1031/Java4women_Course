

public class Account2 {
	private String owner;
	private int number;
	private int balance;
	
	private static int numberOfAccounts = 0;
	private static int nTransactions = 0;
	private Transaction[] transactionList;
	
	
	private int nlocal=0;
	
	public Account2(String o){
		owner = o;
		balance = 0;
		numberOfAccounts++;
		number = numberOfAccounts;
		transactionList = new Transaction[1000];
		transactionList[nlocal] = new CreationTransaction();
		nTransactions++;
		this.nlocal++;
	}
	
	public void deposit (int amount){
		balance += amount;
		transactionList[nlocal] = new DepositTransaction(amount);
		nTransactions++;
		this.nlocal++;
	}
	
	public void withdraw (int amount){
		balance -= amount;
		transactionList[nlocal] = new WithDrawTransaction(amount);
		nTransactions++;
		this.nlocal++;
	}
	
	public void transferTo(int amount, Account2 to){
		this.balance -= amount;
		this.transactionList[nlocal] = new TransferFromTransaction(amount, to.owner);
		nTransactions++;
		this.nlocal++;
		
		to.balance += amount;		
		to.transactionList[nlocal] = new TransferToTransaction(amount, owner);
		nTransactions++;
		to.nlocal++;
		
	}
	
	public void printAll() {
		System.out.println(number + "/" + owner + ":" + balance);
		System.out.println("Transaction amount is :" + nTransactions);
		System.out.println("Account local transaction amount is :" + this.nlocal);
		System.out.println("Transactions:");
		for (int i = 0; i < nlocal; i++){
			transactionList[i].printTransaction();
		}
	}
}

