import java.util.Scanner;
import java.util.Random;
public class Task1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
    Random random = new Random();
int userNum;
int randomNum = random.nextInt(100)+1;
d0 {
    System.out.println("Gussed The Between Range Of 1-100");
   userNum = scanner.nextInt();
   if(userNum == randomNum){
    System.out.println("Congratulations! You Have Guessed Correct Number");
   
   }
   else if (userNum>randomNum){
   System.out.println(" You Have Guessed To High  Number");
   
   } else{
    System.out.println("Congratulations! You Have Guessed To Low Number");
    
   }

}
while (userNum!=randomNum);
sacnner.close();
}
}