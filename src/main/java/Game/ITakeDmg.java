package Game;

public interface ITakeDmg {
    int getHP();
    void setHP(int value);
    void loseHP(int dmg);
    void gainHP(int value);
    void die();
    boolean isAlive();
}
