package UIRS.flightSimulation.program1.MathModel;

enum TypeTime {
    SEC, MIN, HOUR, DAY;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
