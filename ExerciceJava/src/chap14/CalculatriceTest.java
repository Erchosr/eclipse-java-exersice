package chap14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Classe de test pour la classe Calculatrice.
 */
public class CalculatriceTest {

    /**
     * Test de la méthode additionner() pour des nombres positifs et négatifs.
     */
    @Test
    public void testAdditionner() {
        Calculatrice calc = new Calculatrice();

        // Cas positifs
        assertEquals(5, calc.additionner(2, 3), "2 + 3 devrait retourner 5");

        // Cas négatifs
        assertEquals(-1, calc.additionner(2, -3), "2 + (-3) devrait retourner -1");
        assertEquals(-5, calc.additionner(-2, -3), "-2 + (-3) devrait retourner -5");

        // Cas zéro
        assertEquals(3, calc.additionner(3, 0), "3 + 0 devrait retourner 3");
    }

    /**
     * Test de la méthode soustraire() pour des nombres positifs et négatifs.
     */
    @Test
    public void testSoustraire() {
        Calculatrice calc = new Calculatrice();

        // Cas positifs
        assertEquals(1, calc.soustraire(3, 2), "3 - 2 devrait retourner 1");

        // Cas négatifs
        assertEquals(5, calc.soustraire(2, -3), "2 - (-3) devrait retourner 5");
        assertEquals(1, calc.soustraire(-2, -3), "-2 - (-3) devrait retourner 1");

        // Cas zéro
        assertEquals(-3, calc.soustraire(0, 3), "0 - 3 devrait retourner -3");
    }
}