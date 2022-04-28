public class Dog {

    /**  instance variable */
    public int weightInPounds;

    /**  static variable */
    public static String binomen = "Canis familiaris";

    /** One integer constructor for dogs */
    public Dog(int startingWeight) {
        weightInPounds = startingWeight;
    }

    /** non-static methods */
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark!");
        } else {
            System.out.println("woooof!");
        }
    }

    /** static method and compare two dogs */
    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        } else {
            return d2;
        }
    }

    /** non-static method and compare the object itself with other dog */
    public Dog maxDog(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
            return this;
        } else {
            return d2;
        }
    }
}
