public class Main {
    public static void main(String[] args) {

        Bug dude = new Bug();   // instantiation
        Bug dudette = new Bug();
        Bug dudekid = new Bug();
        Bug duck = new Bug();

        dudette.speak();
        dudekid.speak();
        dudekid.speak();
        dudette.sayName();
        dude.sayName();
        int bee = duck.multiplicator(7,9);
        System.out.println("Mr. Black says " + bee +".");
        int ans = dudette.multiplicator(7,9);
        System.out.println("the answer is " + ans);

        // static methods
        // mostly in library/helper classes

        // The Math Class

        System.out.println(Math.pow(3,5));
        System.out.println(Math.abs(-45));
        System.out.println(Math.multiplyExact(16,16));

        // Random Numbers (RNG) and (PNG)
        // Math.random() ==> [0.0, 1.0)

        // range = upper - lower + 1
        // (int)(Math.random() * range + lower)
        int d6 = (int)(Math.random()*6 + 1);
        System.out.println(d6);
    }
}

        // actual parameters are in the main
        // actual is usage


