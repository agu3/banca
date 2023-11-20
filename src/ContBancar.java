class ContBancar{
    private double balance;

    public ContBancar(){
        this.balance = 0.0;
    }

    public void depozit(double amount){
        if(amount >0){
            balance += amount;
            System.out.println("Depozitul de " + amount + "efectuata");

        }
        else{
            System.out.println("suma depozitata trebuie sa fie mia mare decat 0");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 & amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("suma de retragere trebuie sa fie mai mare d 0");
        }
    }

    public double getBalance(){
        return balance;
    }
}