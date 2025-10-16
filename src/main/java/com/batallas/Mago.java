package com.batallas;

import com.batallas.interfaces.Magico;

public class Mago extends Criatura implements Magico {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        lanzarHechizo(objetivo);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }

    @Override
    public void lanzarHechizo(Criatura objetivo) {
        int daño = fuerza;
        if (arma != null) {
            daño += arma.atacarConArma();
        }
        System.out.println(nombre + " lanza un hechizo a " + objetivo.getNombre() + " causando " + daño + " de daño mágico.");
        objetivo.defender(daño);
    }

    @Override
    public void aprenderHechizo(String hechizo) {
        System.out.println(nombre + " ha aprendido el hechizo: " + hechizo);
    }
}
