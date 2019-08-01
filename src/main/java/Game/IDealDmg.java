package Game;

public interface IDealDmg {
    int calculateAttackValue();
    void attack(ITakeDmg victim);
}
