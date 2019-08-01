package EnemyClasses;

public enum EnemyType {
    SKELETON(5,3),
    OGRE(30,7),
    DRAGON(200,25),
    EVILWIZARD(10,16);

    public final int HP;
    public final int dmg;


    EnemyType(int HP,int dmg){
        this.HP=HP;
        this.dmg=dmg;
    }

    public int getHP() {
        return HP;
    }

    public int getDmg() {
        return dmg;
    }
}
