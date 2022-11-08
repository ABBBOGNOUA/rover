package org.octo.tdd.marsrover;

public enum Direction {
    Nord("Ouest","Est"),
    Sud("Est", "Ouest"),
    Est("Nord", "Sud"),
    Ouest("Sud", "Nord");

    private String droite;
    private String gauche;

    Direction(String gauche, String droite) {
        this.gauche = gauche;
        this.droite = droite;
    }

    public Direction regarderADroite() {
        return Direction.valueOf(droite);
    }

    public Direction regarderAGauche() {
        return Direction.valueOf(gauche);
    }
}
