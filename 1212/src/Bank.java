import java.util.List;

public class Bank {
	List<Account> accounts;
	int totalAccount;
	
	void createAccount(int num, String name) {}
	void findByNum() {}
	void findByName() {}
	void getAccoutList() {}
	void getTotalAcount() {}
}


class Account {
	int num;
	String name;
	long balance;
	List<bankStatement> bs;
	
	void deposit() {}
	void withdraw() {}
	void getBalance() {}
	void getBankStatement() {}
	
}

class bankStatement {
	String day, time, kind;
	long bankAmount, balance;
}