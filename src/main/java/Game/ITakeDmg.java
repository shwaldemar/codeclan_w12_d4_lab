package Game;

public interface ITakeDmg {
    int getHP();
    void loseHP();
    void gainHP();
    void die();
    boolean isAlive();
}
