package com.batallas;

import com.batallas.interfaces.Volador;

public class Dragon extends Criatura implements Volador {

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza * 2;
        if (arma != null) {
            daño += arma.atacarConArma();
        }
        System.out.println(nombre + " lanza fuego sobre " + objetivo.getNombre() + " causando " + daño + " de daño.");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }

    @Override
    public void volar() {
        System.out.println(nombre + " levanta vuelo majestuosamente.");
    }

    @Override
    public void aterrizar() {
        System.out.println(nombre + " aterriza con fuerza.");
    }
}

