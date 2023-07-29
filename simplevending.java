import java.io.*;
public class simplevending
{
  public static void main(String[]args) throws IOException
  {
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    int can,pay,choice,a,b;
    System.out.println("Welcome To Vending Machine!Choose your drink");
    System.out.println("Press 1 for Coca-Cola(₹25)");
    System.out.println("Press 2 for Sprite(₹35)");
    System.out.println("Press 3 for Mirinda(₹45)");
    choice=Integer.parseInt(in.readLine());
    switch(choice)
    {
        case 1:System.out.println("You have chosen Coca-Cola.Please pay at the counter");
               pay=Integer.parseInt(in.readLine());
               
               
               if(pay==25)
               System.out.println("Drink has been dispensed.Enjoy your drink");
               else
                if(pay>25)
               System.out.println("Here is the balance amount:"+(pay-25));
               else
               System.out.println("Sorry,Payment not sufficient");
               
               System.out.println("Press 0 to cancel order or press 5 to exit");
               can=Integer.parseInt(in.readLine());
               if(can==0)
               System.out.println("Order has been cancelled,payment will be returned");
               
               break;
        case 2:System.out.println("You have chosen Sprite.Please pay at the counter");
               pay=Integer.parseInt(in.readLine());
               if(pay==35)
               System.out.println("Drink has been dispensed.Enjoy your drink");
               else
                if(pay>35)
                System.out.println("Here is the balance amount:"+(pay-35));
                else
                System.out.println("Sorry,Payment not sufficient");
                
               System.out.println("Press 0 to cancel order or press 5 to exit");
               can=Integer.parseInt(in.readLine());
               if(can==0)
               System.out.println("Order has been cancelled,payment will be returned");
               
               break;
        case 3:System.out.println("You have chosen Mirinda.Please pay at the counter");
               pay=Integer.parseInt(in.readLine());
               if(pay==45)
               System.out.println("Drink has been dispensed.Enjoy your drink");
               else 
                if(pay>45)
               System.out.println("Here is the balance amount:"+(pay-45));
               else
               System.out.println("Sorry,Payment not sufficient");
               
               System.out.println("Press 0 to cancel order or press 5 to exit");
               can=Integer.parseInt(in.readLine());
               if(can==0)
               System.out.println("Order has been cancelled,payment will be returned");
               
               break;
        default:System.out.println("You have chose an invalid option,sorry.");
                break;
    }
  }
}
    
    
  

