import java.io.*;
import java.util.*;

class Test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
    
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {

                    System.out.println(i);
                }
            
        }


        /*for(int i=0;i<n;i++)
         * if(n%i==0)
         *  check i wether i is prime or not
         * and print it
         * 
         */


    }
}