public class DogLauncher {
    public static void main(String[] args) {
        Dog d = new Dog(15); /** Declaration, Instantiation and Assignment */
        d.makeNoise();

        Dog d2 = new Dog(100);
        
        Dog biggerStatic = Dog.maxDog(d, d2);
        biggerStatic.makeNoise();

        Dog biggerNonstatic = d.maxDog(d2);
        biggerNonstatic.makeNoise();

        System.out.println(Dog.binomen);
        //System.out.println(d.binomen);
        //System.out.println(d2.binomen);
    }
    

}
