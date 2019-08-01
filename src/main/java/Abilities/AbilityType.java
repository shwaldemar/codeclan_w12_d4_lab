package Abilities;

public enum AbilityType {
    SWINGWEAPON(0,AbilityBehaviour.DOESDMG,AbilityTargetType.ENEMY),
    HEAL(15,AbilityBehaviour.HEALS,AbilityTargetType.ALLY),
    FIREBALL(1,AbilityBehaviour.DOESDMG,AbilityTargetType.ALLENEMIES),
    LIGHTINGBOLT(4,AbilityBehaviour.DOESDMG,AbilityTargetType.ENEMY);

    private final AbilityTargetType targetType;
    private final int value;
    private final AbilityBehaviour behaviour;

    AbilityType(int value,AbilityBehaviour behaviour,AbilityTargetType targetType) {
        this.value = value;
        this.behaviour = behaviour;
        this.targetType = targetType;
    }

    public AbilityTargetType getTargetType() {
        return targetType;
    }

    public int getValue() {
        return value;
    }

    public AbilityBehaviour getBehaviour() {
        return behaviour;
    }
}
