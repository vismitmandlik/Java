import java.util.*;
 
class Account {
    private int id;
    private double balance;  
    private  double annualInterestRate;
    private java.util.Date dateCreated;
 
    public Account() {
        dateCreated = new java.util.Date();
    }
 
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }
    
    public int getId() {
        return id;
    }
 
    public double getBalance() {
        return balance;
    }
 
    public  double getAnnualInterestRate() {
        return annualInterestRate;
    }
 
    public void setId(int newId) {
        id = newId;
    }
 
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
 
    public  void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }
 
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }
 
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
 
    public void withdraw(double amount) {
        balance = balance - amount;
    }
 
    public void deposit(double amount) {
        balance = balance + amount;
    }
 
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
 
    public void getAccountdetailes() {
        System.out.println("id : " + getId());
        System.out.println("Balance : " + getBalance());
        System.out.println("annualInterestRate : " + getAnnualInterestRate());
        System.out.println("Monthly interest is : " + getMonthlyInterest());
        System.out.println("This account was created at :  " + getDateCreated());
    }
}
class Code1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your credential id:");
        int id=sc.nextInt();
        System.out.println("Enter account balance:");
        double balance=sc.nextDouble();
        System.out.println("Enter rate of interest:");
        double interest=sc.nextDouble();
        System.out.println("Enter amount to be withdrawn:");
        double withdrawamount=sc.nextDouble();
        System.out.println("Enter deposit amount:");
        double depositamount=sc.nextDouble();
        System.out.println("by 21ce068");
        Account a = new Account(id, balance);
        a.setAnnualInterestRate(interest);
        a.withdraw(withdrawamount);
        a.deposit(depositamount);
        a.getAccountdetailes();
    }
}
