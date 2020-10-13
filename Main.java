import java.util.Scanner;
/**
 *
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    int[] firstVector = new int[3];
    int[] secondVector = new int[3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the 3 values for the first vector");
    
   firstVector[0] =  sc.nextInt();
   firstVector[1] =  sc.nextInt();
   firstVector[2] =  sc.nextInt();

   System.out.println("Please enter the 3 values for the second vector");
    
   secondVector[0] =  sc.nextInt();
   secondVector[1] =  sc.nextInt();
   secondVector[2] =  sc.nextInt();

   int result = firstVector[0] * secondVector[0] + firstVector[1] * secondVector[1] + firstVector[2] * secondVector[2];


   System.out.println("The dot product is " + result);
    
    
  }
}
