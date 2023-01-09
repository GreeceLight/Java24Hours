package com.java24hours;

public class PrimeFinder implements Runnable{
    Thread go;
    StringBuffer primes = new StringBuffer();
    int time = 0;
    PrimeHelper helper = new PrimeHelper();
    boolean isDone = false;

    public PrimeFinder(){
        start();
        while(primes != null){
            System.out.println(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            time++;
        }
    }

    public void start(){
        if(go == null){
            go = new Thread(this);
            go.start();
            helper.go = new Thread(this);
            helper.start();
        }
    }

    public void run(){
        int quantity = 1_000_000;
        int numPrimes = 0;
        int candidate = 2;

        primes.append("\nFirst ").append(quantity).append(" primes:\n\n");
        while(numPrimes < quantity){
            if(isPrime(candidate)){
                primes.append(candidate).append(" ");
                numPrimes++;
            }
            candidate++;
        }
        isDone = true;
        //TO OUTPUT TO FILE
        if(helper.isDone == true && isDone == true){
            System.out.println(primes);
            System.out.println(helper.threes);
            primes = null;
            System.out.println("\nTime Elapsed: " + time + " seconds");
        }
    }

    public static boolean isPrime(int checkNumber){
        double root = Math.sqrt(checkNumber);
        for (int i = 2; i <= root; i++) {
            if(checkNumber % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new PrimeFinder();
    }
}
