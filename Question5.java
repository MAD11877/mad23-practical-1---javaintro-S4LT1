import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for numbers. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number: ");
     int number = in.nextInt();

     int[] integers = new int[number];
     System.out.println("Enter " + number + " integers: ");
     for (int i=0; i<number; i++){  
         integers[i]=in.nextInt();  
     }

     Arrays.sort(integers);

     int mode = 0;
     int maxCount = 0;
     int currentCount = 1;
     for (int i = 1; i < number; i++) {
            if (integers[i] == integers[i-1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mode = integers[i-1];
                }
                currentCount = 1;
            }
     }
     if (currentCount > maxCount) {
            mode = integers[number-1];
     }

     System.out.println("Mode: " + mode);

    }
}
