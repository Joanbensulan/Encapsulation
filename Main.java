public class Main {
     public static void main(String[]args){
         Bankaccount account= new Bankaccount ("Joan", 20,104556,100);
         
         account.deposit(15.0);
         account.deposit(10.0);
           
           System.out.println(account.getSummary());
     }
}