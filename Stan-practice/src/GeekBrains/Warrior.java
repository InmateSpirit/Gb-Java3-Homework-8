package GeekBrains;

public abstract class Warrior {
    protected double health;
    protected int attack;
    protected int evasion;
    protected int armor;
    protected String name;

    public Warrior(int attack, int evasion, int armor, String name) {
        this.health = 100;
        this.attack = attack;
        this.evasion = evasion;
        this.armor = armor;
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamage(Warrior newWarrior) {
        if (Math.random() > (double)evasion/100) {
            health = health - (newWarrior.getAttack() * (100 - armor) / 100);
        } else
            System.out.println("Miss");
        return health;
    }

}
