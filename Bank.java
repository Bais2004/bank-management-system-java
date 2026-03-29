import java.util.ArrayList;

class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount(int accNo, String name, double balance) {
        accounts.add(new Account(accNo, name, balance));
        System.out.println("Account created successfully.");
    }

    public Account findAccount(int accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }
}