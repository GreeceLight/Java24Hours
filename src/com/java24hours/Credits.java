package com.java24hours;

public class Credits {
    public static void main(String[] args) {
        String title = "Sharknado";
        int year = 2013;
        String director = "Anothony Ferrante";
        String  role1 = "Fin";
        String  actor1 = "Ian Ziering";
        String  actor12 = actor1.toUpperCase();
        String  role2 = "April";
        String  actor2 = "Tara Reid";
        String actor22 = actor2.toUpperCase();
        String  role3 = "George";
        String  actor3 = "John Heard";
        String  actor32 = actor3.toUpperCase();
        String  role4 = "Nove";
        String  actor4 = "Cassie Scerbo";
        String  actor42 = actor4.toUpperCase();
        
        System.out.println(title + " (" + year + ")\n" + "A " + director + 
            " film.\n\n" + 
            role1 + "\t" + actor12 + "\n" +
            role2 + "\t" + actor22 + "\n" +
            role3 + "\t" + actor32 + "\n" +
            role4 + "\t" + actor42);
    }
}