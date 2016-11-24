package iswtp5.model;

public enum DiaSemana {
    /*Lunes(1),
    Martes(2),
    Miercoles(3),
    Jueves(4),
    Viernes(5),
    Sabado(6),
    Domingo(7);
    */Lunes(0),
    Martes(1),
    Miercoles(2),
    Jueves(3),
    Viernes(4),
    Sabado(5),
    Domingo(6);
    // private final int value;
    private int value;
    private DiaSemana(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
