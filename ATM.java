
package codesoft;

import java.util.Scanner;


public class ATM {
    static int totalAmount=0;
    
    static void checkBalance(){
        System.out.println("Total Balance is "+totalAmount);
    }
    
    static void deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        int a=sc.nextInt();
        if(a>0){
        totalAmount+=a;
        System.out.println("Amount " +a+ " deposited and available balance is "+totalAmount);
        }
        else
            System.out.println("You have entered negative amount");
    }
    static void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        int a=sc.nextInt();
        if(a<totalAmount){
        totalAmount-=a;
        System.out.println("Amount " +a+ " withdraw and available balance is "+totalAmount);
        }else
        {
            System.out.println("insufficient amount");
            checkBalance();
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        while(true){
        System.out.println("1. Deposit."); 
        System.out.println("2. Withdraw.");
        System.out.println("3. Check Balance.");
        System.out.println("4. Exit.");
        System.out.print("Enter choice: ");
        int choice=sc.nextInt();
        
        switch(choice){
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.exit(1);
                break;
            default:
                System.out.println("Wrong input");
    }
    }
    }
}
