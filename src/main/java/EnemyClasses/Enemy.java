package EnemyClasses;

public class Enemy {
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
}
