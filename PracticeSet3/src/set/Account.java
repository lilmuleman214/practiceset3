package set;
import java.util.Date;
import java.io.*;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date(); //Check
	
	public Account()
	{}
	
	public Account(int i, double b){
		id = i;
		balance = b;
	}
	
	public int getID()
	{
		return id;
	}
	
	public void setID(int i){
		id = i;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double b)
	{
		balance = b;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double i)
	{
		annualInterestRate = i / 100;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	public void withdraw(double i) throws InsufficientFundsException{
		if(i <= balance)
	      {
	         balance -= i;
	      }
	      else
	      {
	         double needs = i - balance;
	         throw new InsufficientFundsException(needs);
	      }
	}
	
	public void deposit(double i){
		balance += i;
	}
}
