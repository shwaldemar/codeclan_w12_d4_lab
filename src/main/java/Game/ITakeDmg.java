package Game;

public interface ITakeDmg {
    int getHP();
    int setHP();
    void loseHP();
    void gainHP();
    void die();
    boolean isAlive();
}
