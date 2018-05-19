package com.anna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PrimeSum {
    public ArrayList<Integer> primesum(int A) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> ans = new ArrayList<>();

        ArrayList<Integer> generatePrimes = helper(A);

        for (int i = 0; i < generatePrimes.size(); i++){

            int leftover = A - generatePrimes.get(i);
            if (generatePrimes.contains(leftover)) {
                ans.add(generatePrimes.get(i));
                ans.add(leftover);
            }
        }

        return ans;

    }

    public static  ArrayList<Integer> helper(int x){
        int n = x;

        // initially assume all integers are prime
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= n using Sieve of Eratosthenes
        for (int factor = 2; factor*factor <= n; factor++) {

            // if factor is prime, then mark multiples of factor as nonprime
            // suffices to consider mutiples factor, factor+1, ...,  n/factor
            if (isPrime[factor]) {
                for (int j = factor; factor*j <= n; j++) {
                    isPrime[factor*j] = false;
                }
            }
        }

        // count primes
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                ans.add(i);
            }

        }
        return ans;

    }



    public static void main(String[] args) {

        System.out.println(helper(100));
    }
}
