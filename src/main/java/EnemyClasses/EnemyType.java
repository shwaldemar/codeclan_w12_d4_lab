package EnemyClasses;

public enum EnemyType {
    SKELETON("Skeleton",5,3),
    OGRE("Ogre",30,7),
    DRAGON("Dragon",200,25),
    EVILWIZARD("Evil Wizard",10,16);

    public final int HP;
    public final int dmg;
    public final String name;


    EnemyType(String name,int HP,int dmg){
        this.name=name;
        this.HP=HP;
        this.dmg=dmg;
    }

    public int getHP() {
        return HP;
    }

    public int getDmg() {
        return dmg;
    }

    public String getName(){return name;}
}
