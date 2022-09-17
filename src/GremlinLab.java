public class GremlinLab {
    public static void main(String[] args) {
        int numGremlins = Integer.parseInt(args[0]);
        if (numGremlins > 0){
            Gremlin[] gremlins = new Gremlin[numGremlins];
            for(int i = 0; i < numGremlins; i++){
                gremlins[i] = new Gremlin();
            }
            System.out.println("There are " + Gremlin.getGremlinCount() + " gremlins");
        }
        newGUID();
    }
    
    static void newGUID() {
        Gremlin Jason = new Gremlin();
        if(Jason.getGUID() >  40000 && Jason.getGUID() < 50000){
            Jason.changeGUID(69420);
        }
        System.out.println(Jason.getGUID());
    }
}
