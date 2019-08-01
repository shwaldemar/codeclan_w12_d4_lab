package EnemyClasses;

import Game.IDealDmg;
import Game.ITakeDmg;

public class Enemy implements ITakeDmg{
    private EnemyType type;
    private int HP;
    private int dmg;

    public Enemy(EnemyType type) {
        this.type = type;
        this.HP = type.getHP();
        this.dmg = type.getDmg();
    }

    public EnemyType getType() {
        return type;
    }

    public int getHP() {
        return HP;
    }

    public int getDmg() {
        return dmg;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void loseHP(int dmg){
        setHP(getHP()-dmg);
    }

    public void gainHP(int value){
        setHP(getHP()+value);
    }

    public boolean isAlive(){
        if (getHP()>0)
            return true;
        return false;
    }

    public void die(){
        System.out.println(type.getName()+" has been defeated");
    }
}
