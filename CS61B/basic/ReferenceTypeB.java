public class ReferenceTypeB {
    public static void main(String[] args) {
        Walrus walrus = new Walrus();
        walrus.weight = 3500;
        walrus.tuskSize = 10.5;
        int x = 9;

        doStuff(walrus, x);
        System.out.println(walrus.weight);
        System.out.println(x);
        
    }

    public static void doStuff(Walrus W, int x){
        W.weight = W.weight - 100;
        x = x -5;
    }

    public static class Walrus {
        public int weight;
        public double tuskSize;
    }
    
}
