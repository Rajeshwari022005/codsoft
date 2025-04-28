import java.util.Scanner;
 class Task2 {
    public static void main(String[] args){
        int Number, n1,n2;
        Scanner sc= new Scanner (System.in);
    
        System.out.println("Enter the First Number");
        n1 = sc.nextInt();
        System.out.println("Enter The Second Number");
        n2 = sc.nextInt();
        System.out.println("1.addition /n 2.substraction /n 3.multiplication /n 4.division /n  5.exit");
        System.out.println("choice the Number");
        
        Number = sc.nextInt();
       
        

        switch(Number){
            case 1:
           int addition = n1 + n2;
           System.out.println("Addition:"+addition);

            break;
            case 2:
          int  substration = n1 - n2;
          System.out.println("Substraction:"+ substration);
            break;
            case 3:
         int multiplication = n1 * n2;
         System.out.println("Multiplication:"+ multiplication);
            break;
            case 4:
           float division = (float)n1 / n2;
           System.out.println("Division:"+ division);
            break;
            case 5:
            break;
default:
System.out.println("not valid");
        }

        }
        }
    
10
