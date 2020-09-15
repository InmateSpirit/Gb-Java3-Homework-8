package GeekBrains;

public class Human extends Warrior{
    int luck;
    public Human(int attack, int evasion, int armor, String name,int luck) {
        super(attack, evasion, armor, name);
        this.health = 75;
        this.luck = luck;
    }

    @Override
    public double getDamage(Warrior newWarrior) {
        if (Math.random() > (double)evasion/100) {
            health = health - (newWarrior.getAttack() * (100 - armor) / 100);
            if (Math.random() < (double)luck/100){
                System.out.println("Medic");
                health += (75-health);
            }
        } else
            System.out.println("Miss");

        return health;
    }
}
