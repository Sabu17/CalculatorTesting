import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("please enter the first number");
                int num1 = input.nextInt();
                System.out.println("please enter the secound number");
        int num2 = input.nextInt();
        System.out.println("Enter your selection: 1 for s, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = input.nextInt();
        switch (choose){
        case 1:
            System.out.println(sum( num1,num2));
            break;
        case 2: 
            System.out.println(sub( num1,num2));
            break;      
        case 3:
            System.out.println(mult( num1,num2));
            break;
        case 4:
            System.out.println(div( num1,num2));
            break;}

    }


    public static int sum(int x,int y){
      int result=x+y;
      return result;
    }

    public static int sub(int x,int y){
      int result=x-y;
      return result;
    }

    public static int mult(int x,int y){
      int result=x*y;
      return result;
    }

    public static int div(int x,int y){
      int result=x/y;
      return result;
    }

   

    
    
}
