package com.primes;


public class Main {

    public static void main(String[] args) {

       // int primeCount = countPrimes(2,100);

        System.out.println("od 1 do 1000 " + countPrimes(1,1000)+ " liczb pierwszych");

        System.out.println("od 1001 do 2000 " + countPrimes(1001,2000)+ " liczb pierwszych");
        System.out.println("od 2001 do 3000 " + countPrimes(2001,3000)+ " liczb pierwszych");
        System.out.println("od 3001 do 4000 " + countPrimes(3001,4000)+ " liczb pierwszych");
        System.out.println("od 4001 do 5000 " + countPrimes(4001,5000)+ " liczb pierwszych");

        int n = 10;
        int rangeSize = 10_000;
        for (int i = 0; i < n ; i++) {
            int begin = rangeSize*i +1;
            int end = rangeSize *(i +1);
            System.out.println("From " + begin + " to " + end + " is " + countPrimes(begin,end) +" primes number");
        }


    }

    private static int countPrimes(int from, int to) {
        int primeCounter = 0;


        for (int i = from; i <= to; i++) {
            if (isPrime(i))
            {
                ++primeCounter;
            }

        }
        return primeCounter;
    }
    private static boolean isPrime(int l)
    {
        if (l < 2) {
            return false;
        }
        for (int i = 2; i < l; i++) {
            if (l % i == 0) {
                return false;
            }
        }
        return true;
    }
}

