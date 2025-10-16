package com.batallas;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




public class CriaturasTest {
    private Dragon dragon;
    private Mago mago;
    private Guerrero guerrero;
    private Arma espada;
    private Arma baston;

    @BeforeEach
    void setup() {
        espada = new Arma("Espada de Fuego", 10);
        baston = new Arma("Bastón Arcano", 5);

        dragon = new Dragon("Alduin", 150, 25);
        mago = new Mago("Merlín", 100, 15);
        guerrero = new Guerrero("Conan", 120, 20);

        mago.equiparArma(baston);
        guerrero.equiparArma(espada);
    }

    @Test
    void testAtaqueDelDragon() {
        int saludInicial = mago.getSalud();
        dragon.atacar(mago);
        assertTrue(mago.getSalud() < saludInicial, "El ataque del dragón debe reducir la salud del mago");
    }

    @Test
    void testAtaqueDelMagoConHechizo() {
        int saludInicial = dragon.getSalud();
        mago.lanzarHechizo(dragon);
        assertTrue(dragon.getSalud() < saludInicial, "El hechizo del mago debe reducir la salud del dragón");
    }

    @Test
    void testAtaqueDelGuerreroConArma() {
        int saludInicial = dragon.getSalud();
        guerrero.atacar(dragon);
        assertTrue(dragon.getSalud() < saludInicial, "El ataque del guerrero debe reducir la salud del dragón");
    }

    @Test
    void testBatallaCompleta() {
        SimulacionBatalla batalla = new SimulacionBatalla();
        String resultado = batalla.simularBatalla(dragon, mago);
        assertTrue(resultado.contains("Ganador"), "El resultado de la batalla debe incluir la palabra 'Ganador'");
    }
}
