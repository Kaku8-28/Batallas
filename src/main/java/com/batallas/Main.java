package com.batallas;

public class Main {
    public static void main(String[] args) {
    
        Arma espada = new Arma("Espada Legendaria", 10);
        Arma baston = new Arma("Bastón de Poder", 8);

        
        Dragon dragon = new Dragon("Drogo", 150, 25);
        Mago mago = new Mago("Gandalf", 100, 20);
        Guerrero guerrero = new Guerrero("Kratos", 120, 22);

        
        mago.aprenderHechizo("Rayo de Luz");

        
        mago.equiparArma(baston);
        guerrero.equiparArma(espada);

        
        SimulacionBatalla simulador = new SimulacionBatalla();

        System.out.println("\n===== BATALLA 1: DRAGÓN vs MAGO =====");
        simulador.simularBatalla(dragon, mago);

        System.out.println("\n===== BATALLA 2: GUERRERO vs DRAGÓN =====");
        simulador.simularBatalla(guerrero, dragon);
    }
}
