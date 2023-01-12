package com.java24hours;


public class PrimeHelper implements Runnable{
    Thread go;
    StringBuffer threes = new StringBuffer();
    boolean isDone = false;
    
    public PrimeHelper(){
        start();
    }

    public void start(){
        if(go == null){
            go = new Thread(this);
            go.start();
        }
    }

    public void run(){
        int quantity = 1_000_000;
        int numThrees = 0;
        int candidate = 1;

        threes.append("\nFirst ").append(quantity).append(" numbers evenly divisible by 3\n\n");
        while(numThrees < quantity){
            if(candidate % 3 == 0){
                threes.append(candidate).append(" ");
                numThrees++;
            }
            candidate++;
        }
        //TO OUTPUT TO FILE
        isDone = true;
    }

    public static void main(String[] args) {
        new PrimeHelper();
    }
}
