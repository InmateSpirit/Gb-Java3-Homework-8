package GeekBrains;

public class Main {

    public static void main(String[] args) {
        Orc Brgh = new Orc(20, 17, "Brgh");
        Elf High = new Elf(20, 12, 15, "Elderon");
        Human Stan = new Human(15, 0, 12, "Stan", 20);
        fight(Brgh, High);
        High.setHealth(100);
        fight(Stan, High);

    }

    public static void fight(Warrior a, Warrior b) {
        do {
            b.getDamage(a);
            if (b.getHealth() <= 0) {
                break;
            }
            a.getDamage(b);
            if (a.getHealth() <= 0) {
                break;
            }
        }
        while (a.getHealth() > 0 || b.getHealth() > 0);
        if (a.getHealth() <= 0) {
            info(a, b);
        } else if (b.getHealth() <= 0) {
            info(a, b);
        }

    }

    public static void info(Warrior a, Warrior b) {
        System.out.println(String.format("%s is dead, %s wins", a.getName(), b.getName()));
        System.out.println(String.format("%s HP: %s", b.getName(), b.getHealth()));
        System.out.println(String.format("%s HP: %s", a.getName(), a.getHealth()));
    }
}
