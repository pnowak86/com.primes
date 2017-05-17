package com.primes;


public class Main {

    public static void main(String[] args) {

        printPrimes(100);


    }

    private static void printPrimes(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " isPrime");
            }

        }
    }
    private static boolean isPrime(int l) {
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

