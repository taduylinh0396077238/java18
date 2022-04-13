package Java1843;

public class TestMonster {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("Duy ");
        Monster m2 = new WaterMonster("Linh");
        Monster m3 = new StoneMonster("Duy");

        // Invoke the actual implementation
        System.out.println(m1.attack());  // Run FireMonster's attack()
        //Attack with fire!
        System.out.println(m2.attack());  // Run WaterMonster's attack()
        //Attack with water!
        System.out.println(m3.attack());  // Run StoneMonster's attack()
        //Attack with stones!

        // m1 dies, generate a new instance and re-assign to m1.
        m1 = new StoneMonster("a2b2");  // upcast
        System.out.println(m1.attack());  // Run StoneMonster's attack()
        //Attack with stones!

        // We have a problem here!!!
        Monster m4 = new Monster("u2u2");
        System.out.println(m4.attack());  // garbage!!!
        //!^_&^$@+%$* I don't know how to attack!
    }
}
