class Kids extends Account {
    
    public Kids(String a, String n, double b) {
        this.accNo = a;
        this.name = n;
        this.balance = b;
    }

    @Override
    public void withdraw(double amount) {
        if (amount<balance) {
            if (amount<=500) {
                balance -= amount;
            }else{
                System.out.println("Balance should be greater than 500/=");
            }
        }else{
            System.out.println("Error on withdrawal");
        }
    }
}
