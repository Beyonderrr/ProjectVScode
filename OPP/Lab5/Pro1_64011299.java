public class Pro1_64011299 {
    public static void main(String[] args){
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("balance : " + account.getBalance());
        System.out.println("monthly interest : " + account.getMonthlyInterest());
        System.out.println("date when this account was created : " + account.getdateCreated());
    }
}
