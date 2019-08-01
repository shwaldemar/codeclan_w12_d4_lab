package Items;

public enum WandType {

    BAD(2),
    GOOD(6);

    private final int value;

    WandType(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}
