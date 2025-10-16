package com.batallas;



public abstract class Criatura {
    protected String nombre;
    protected int salud;
    protected int fuerza;
    protected Arma arma;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public abstract void atacar(Criatura objetivo);
    public abstract void defender(int daño);


    public boolean estaViva() {
        return salud > 0;
    }


    public void equiparArma(Arma arma) {
        this.arma = arma;
        System.out.println(nombre + " ha equipado el arma: " + arma.getNombre());
    }

    public void desequiparArma() {
        System.out.println(nombre + " ha desequipado su arma.");
        this.arma = null;
    }
    public void recibirDanio(int cantidad) {
    this.salud -= cantidad;
    if (this.salud < 0) this.salud = 0;
    System.out.println(nombre + " recibe " + cantidad + " de daño. Salud restante: " + salud);
}


    


    public Arma getArma() {
        return arma;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getFuerza() {
        return fuerza;
    }
}




