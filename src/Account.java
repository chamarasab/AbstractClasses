abstract class Account {
    protected String accNo;
    protected String name;
    protected double balance;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    /*public void setBalance(double balance) {
        this.balance = balance;
    }*/

    public void deposit(double amount){
        this.balance += amount; 
    }

    public abstract void withdraw(double amount);

    public void display(){
        System.out.println("Account No : " + getAccNo());
        System.out.println("Name : " + getName());
        System.out.println("Balance : " + getBalance());
    }
}
