package week2.day2.abstract_classes;

/**
 * Created by gorobec on 29.05.16.
 */
public class LukKang extends Fighter{

    public LukKang(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void hit(Fighter fighter) {
        fighter.health -= damage;
        System.out.println(fighter.health);
    }
}
