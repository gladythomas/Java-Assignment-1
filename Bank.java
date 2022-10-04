//package brush_up_java;
import java.util.Scanner;
abstract class Customer_Details{

    Scanner sc=new Scanner(System.in);
   long [] Account_Number={1003807660,100387456,1003805698,1003874568};
   String []Account_Name={"Glady","Mukul","Suman","Rishab"};
   int [] Account_Balance={9800,1587,2000,9500};
   long getinput;
   String user;
   int add;
   public abstract void loginInfo(); 
   public abstract void getAccountInfo();
   public abstract void withDrawalRequest();
}
class Customer_Deposit extends Customer_Details{

    //getAccount and withdrawal methods are inherited.

    public void loginInfo(){

            System.out.println("Welcome to Virtual Bank:");
            System.out.println("If you are a new User Plz Sign up:");
            System.out.println("Type Yes=New User or No= Existing Customer:");
            

    }
    public void getAccountInfo(){
    
        for(int i=0;i<Account_Balance.length;i++){
           if(Account_Balance[i]<=100){
               //System.out.println(Account_Name[i]+"  Your Account Balance is less than 100");
               System.out.println("Your Exact Amount is "+Account_Balance[i]);
           }
           
        }
   
      }
      public  void withDrawalRequest(){
        System.out.println("Do you Want to withdraw money");
        System.out.println("You Cannot Withdraw if the amout is below 100");
       // System.out.println("Type YES or NO");
        System.out.println("Enter your Account Number:");
        getinput=sc.nextLong();
        System.out.println("Do you want to withdraw money:");
        user=sc.next();
        if(user.equalsIgnoreCase("yes")){
          for(int i=0;i<Account_Number.length;i++){
              if(Account_Number[i]==getinput && Account_Balance[i]<=100){
               System.out.println("Your Account Balance is below 100. So you cannot withdraw the balance");
              }else if(Account_Number[i]==getinput){
  
              System.out.println("Enter the amount to be withdrawn: ");
              getinput=sc.nextLong();
              long sub=Account_Balance[i]-getinput;
              System.out.println("Remaining Balance is:"+sub);
  
              }
  
          }
      }
       
     }

     public  void Deposit(){

        System.out.println("Do you want to deposit money:");
        System.out.println("Enter your Account Number:");
        getinput=sc.nextLong();
        for(int i=0;i<Account_Number.length;i++){
                if(getinput==(Account_Number[i])){
                    System.out.println("How much do you want to deposit:");
                    int deposit=sc.nextInt();
                    add=deposit+Account_Balance[i];
                    System.out.println("Sucessfully Deposited:");
                    System.out.println("Your Current Balance is :"+add);

                }
        }
        
        
        


       }






}
public class Bank {
    public static void main(String[] args) {
        Customer_Deposit C=new Customer_Deposit();
        C.getAccountInfo();
        C.withDrawalRequest();
        C.Deposit();


    }
}
