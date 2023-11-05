package Lab21;
import java.util.*;
class Account{
int AccountNo;
String AccountType,AccountName;
double balance;
void DisplayAccount() {
System.out.println("Account Details are : ");
System.out.println("Account Number : "+AccountNo);
System.out.println("Account Name : "+AccountName);
System.out.println("Account Type : "+AccountType);
System.out.println("Balance : "+balance);
}
void openAccount() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Account Details");
System.out.println("Enter the Account Name");
AccountName=sc.next();
System.out.println("Enter the Account Number");
AccountNo=sc.nextInt();
System.out.println("Enter the Account Type");
AccountType=sc.next();
System.out.println("Enter the Balance");
balance=sc.nextDouble();
}
int SearchAccount(int num)
{
if(AccountNo==num)
{
return 1;
}
else {
return 0;
}
}
void Deposit() {
Scanner sc= new Scanner(System.in);
try {
System.out.println("Enter the amount to be Deposited");
double amount=sc.nextDouble();
if(amount<=0) {
throw new InvalidAmountException("Enter an amount more than zero!!!");
}
balance=balance+amount;
System.out.println(amount+" : Deposited");
System.out.println("current Balance :"+balance);
}
catch(InvalidAmountException e) {
System.out.println("InvalidAmountException"+e.getmessage());
}
}
void Withdraw() {
Scanner sc=new Scanner(System.in);
try {
System.out.println("Enter the amount to be Withdrawed");
double amount=sc.nextDouble();
if(amount<=0) {
throw new InvalidAmountException("Enter an amount more than zero!!!");
}
balance=balance-amount;
if(amount>balance) {
throw new InsufficientFundsException("The Account is Insufficient of fund!!!");
}
System.out.println(amount+" : Withdrawed");
System.out.println("current Balance :"+balance);
}
catch(InvalidAmountException e) {
System.out.println("InvalidAmountException"+e.getmessage());
}
catch(InsufficientFundsException e) {
System.out.println("InsufficientFundsException"+e.getmessage());
}
}
}
public class CustomException {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int choice,num,i,n,flag=0;
System.out.println("Enter the Number of Accounts : ");
n=sc.nextInt();
Account[] a=new Account[n];
for(i=0;i<n;i++)
{
a[i]=new Account();
}
while(true)
{
System.out.println("\nEnter your choice : \n1.Create an account\n2.Display all account
details\n3.Search by account number\n4.Deposit the amount\n5.Withdraw the
amount\n6.exit");
choice=sc.nextInt();
switch(choice)
{
case 1 : for(i=0;i<n;i++)
{
a[i].openAccount();
}
break;
case 2 :for(i=0;i<n;i++)
{
a[i].DisplayAccount();
}
break;
case 3 :System.out.println("Enter the account number to be searched : ");
num=sc.nextInt();
flag=0;
for(i=0;i<n;i++)
{
if(a[i].SearchAccount(num)==1)
{
System.out.println("Account is Valid");
flag=1;
a[i].DisplayAccount();
break;
}
}
if(flag==0)
System.out.println("Invalid AccountNumber!!!");
break;
case 4 :System.out.println("Enter the Account number : ");
num=sc.nextInt();
flag=0;
for(i=0;i<n;i++)
{
if(a[i].AccountNo==num)
{
System.out.println("Account is Valid");
flag=1;
a[i].DisplayAccount();
a[i].Deposit();
break;
}
}
if(flag==0)
{
System.out.println("Invalid AccountNumber!!!");
}
break;
case 5 :System.out.println("Enter the Account number : ");
num=sc.nextInt();
flag=0;
for(i=0;i<n;i++)
{
if(a[i].AccountNo==num)
{
System.out.println("Account is Valid");
flag=1;
a[i].DisplayAccount();
a[i].Withdraw();
break;
}
}
if(flag==0)
{
System.out.println("Invalid AccountNumber!!!");
}
break;
case 6 : System.exit(0);
break;
default : System.out.println("Wrong choice!!!");
break;
}
}
}
}

public class InvalidAmountException extends Exception {
private String message;
public InvalidAmountException(String msg)
{
message=msg;
}
public String getmessage()
{
return message;
}
}

public class InsufficientFundsException extends Exception {
private String message;
public InsufficientFundsException(String msg)
{
message=msg;
}
public String getmessage()
{
return message;
}
}
