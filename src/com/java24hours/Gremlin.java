package com.java24hours;
public class Gremlin {
    static int gremlinCount = 0;
    private static int guid = 42069;

    public Gremlin() {
        gremlinCount++;
    }
    static int getGremlinCount(){
        return gremlinCount;
    }
    public int getGUID(){
        return guid;
    }
    public void changeGUID(int change){
        guid = change;
    }
}
