import java.util.Scanner;
    public class IT24102517Lab4Q1
    {
         public static void main(String[]args)
            {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number:");
            int num = input.nextInt();


               if (num>0){System.out.println("Positive");}

                 else if (num<0){System.out.println("Negative");}

                    else {System.out.println("The number is Zero");}
     }
}