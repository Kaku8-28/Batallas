package com.batallas;

public class SimulacionBatalla {

    public String simularBatalla(Criatura c1, Criatura c2) {
        System.out.println("=====================================");
        System.out.println(" \n¡Comienza la batalla! ");
        System.out.println(" \nEntre " + c1.getNombre() + " y " + c2.getNombre());
        System.out.println("=====================================");

        int turno = 1;
        while (c1.estaViva() && c2.estaViva()) {
            System.out.println("\n-----TURNO " + turno + "-----");
            c1.atacar(c2);

            if (!c2.estaViva()) {
                System.out.println("\n*****" + c2.getNombre() + " ha muerto*****");
                System.out.println("\n====" + c1.getNombre() + " ha ganado la batalla====");
                return "Ganador: " + c1.getNombre();
            }

            c2.atacar(c1);
            if (!c1.estaViva()) {
                System.out.println("\n*****" + c1.getNombre() + " ha muerto*****");
                System.out.println("\n====" + c2.getNombre() + " ha ganado la batalla====");
                return "Ganador: " + c2.getNombre();
            }
            turno++;
        }
        return "Empate";
    }
}
