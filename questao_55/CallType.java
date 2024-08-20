package questao_55;

public enum CallType {
    ANOTHER_OPERATOR('o'),
    VAI_VAI('v'),
    LAND_LINE('f');

    private final char type;
    CallType(char type) {
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public static CallType fromChar(char type) {
        for(CallType c: CallType.values()) {
            if(c.getType() == type)  {
                return c;
            }
        }

        return null;
    }
}
