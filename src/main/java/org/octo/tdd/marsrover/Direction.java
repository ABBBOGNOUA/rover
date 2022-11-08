package org.octo.tdd.marsrover;

public enum Direction {
    Nord("Ouest","Est", 1),
    Sud("Est", "Ouest", -1),
    Est("Nord", "Sud"),
    Ouest("Sud", "Nord");

    private String droite;
    private String gauche;
    private int deplacementY;

    Direction(String gauche, String droite) {
        this.gauche = gauche;
        this.droite = droite;
    }

    Direction(String gauche, String droite, int deplacementY) {
        this(gauche, droite);
        this.deplacementY = deplacementY;
    }

    public int getDeplacementY() {
        return this.deplacementY;
    }

    public Direction regarderADroite() {
        return Direction.valueOf(droite);
    }

    public Direction regarderAGauche() {
        return Direction.valueOf(gauche);
    }
}
