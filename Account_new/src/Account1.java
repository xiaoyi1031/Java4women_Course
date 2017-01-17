
public class Account1 {
	private String owner;
	private int number;
	private int balance;
	
	private static int numberOfAccounts = 0;
	
	private Transaction[] transactionList;
	private int nTransactions;
	
	public Account1(String o){
		this.owner = o;
		this.balance = 0;
		numberOfAccounts++;
		number = numberOfAccounts;
		this.transactionList = new Transaction[1000];
		this.nTransactions = 0;
		this.transactionList[nTransactions] = new CreationTransaction();
		this.nTransactions++;
	}
	
	public void deposit (int amount){
		this.balance += amount;
		this.transactionList[nTransactions] = new DepositTransaction(amount);
		this.nTransactions++;
	}
	
	public void withdraw (int amount){
		this.balance -= amount;
		this.transactionList[nTransactions] = new WithDrawTransaction(amount);
		this.nTransactions++;
	}
	
	public void transferTo(int amount, Account1 to){
		this.balance -= amount;
		this.transactionList[this.nTransactions] = new TransferToTransaction(amount, to.owner);
		this.nTransactions++;
		
		to.balance += amount;
		to.transactionList[to.nTransactions] = new TransferFromTransaction(amount,owner);
		to.nTransactions++;	
	}
	
	public void printAll() {
		System.out.println(number + "/" + owner + ":" + balance);
		System.out.println("Transactions:");
		System.out.println(this.nTransactions);
		
			
		for (int i = 0; i < this.nTransactions; i++){
			transactionList[i].printTransaction();
		}
	}

}
