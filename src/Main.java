
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        int[] userNums = new int[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < userNums.length; i++)
        {
            int input;
            System.out.print("Enter a Number from 0-50: ");

            input = scan.nextInt();

            if(input >= 0 && input <= 50)
            {
                userNums[i] = input;
            }
            else
            {
                System.out.println("That Number is Not In The Range. ");
                i--;
            }//end if else
        }//end for loop


        for(int i : userNums)
        {
            ArrayList<Integer> checked = new ArrayList<Integer>();
            int counter =0;

            for (int j = 0; j < userNums.length; j++)
            {
                if (i == userNums[j])
                {
                    counter++;
                }
                
                checked.add(i);
            }
            System.out.println(i + " appeared " + counter + " times.");
        }
    }//end main method
}//end class