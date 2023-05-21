public class TestMonster {
    public static void main(String[] args) {
        Monster harry1 = new Monster();
        System.out.println("Harry with default health and strength");
        System.out.println("health = " + harry1.getHealth() + " strength = " + harry1.getStrength());

        Monster harry2 = new Monster(99.0, 30.0);
        System.out.println("Harry with set health and strength");
        System.out.println("health = " + harry2.getHealth() + " strength = " + harry2.getStrength());

        System.out.println("Test damage, attackValue and isAlive");

        while (harry2.isAlive()) {
            double attackValue = harry2.attack();
            harry1.damage(attackValue);
            System.out.println("damage = " + attackValue + " isAlive = " + harry1.isAlive());
            System.out.println("health = " + harry1.getHealth() + " strength = " + harry2.getStrength());
        }

        System.out.println("Harry fights himself to the death");

        while (harry2.isAlive()) {
            double attackValue = harry2.attack();
            harry2.damage(attackValue);
            System.out.println("damage = " + attackValue + " isAlive = " + harry2.isAlive());
            System.out.println("health = " + harry2.getHealth() + " strength = " + harry2.getStrength());
        }
    }
}