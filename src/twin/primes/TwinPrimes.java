
package twin.primes;

import java.util.*;

/**
 *
 * @author emphelps
 */
public class TwinPrimes {
    
    static List<String> twinPrimes = new ArrayList<String>();
    static List<Integer> primeNums = new ArrayList<Integer>();
    static int previousPrime = 0;

    public static void main(String[] args) 
    {
        long start = System.currentTimeMillis();
        
        int count = 1000;
        for(int index = 0; index < count; index++)
        {
            if(index % 2 == 0) continue;
            
            isPrime(index); 
        }
         
        long end = System.currentTimeMillis();
        long total = end - start;
        
        for(String data : twinPrimes)
        {
            System.out.println(data);
        }
        
        System.out.println("time: " + total);
    }
    
    static void isPrime(int num)
    {
        boolean prime = true;
        for(int counter = 3; counter <= Math.sqrt(num); counter++) // check if i is prime
        {
            if(num % counter == 0)
            {
                prime = false;
                break;
            }
        }

        if(prime)
        {
            if((num - 2) == previousPrime)
            {
                twinPrimes.add(previousPrime + " " + num);
            }
            else
            {
                previousPrime = num;
            }
        }
    }
}
