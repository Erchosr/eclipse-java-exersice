package chap14;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Classe de test pour la classe Calcul.
 */
public class CalculTest {

    /**
     * Test de la méthode carre() pour plusieurs valeurs.
     */
    @Test
    public void testCarre() {
        Calcul calc = new Calcul();

        // Test carre(3) == 9
        assertEquals(9, calc.carre(3), "carre(3) devrait retourner 9");

        // Test carre(5) == 25
        assertEquals(25, calc.carre(5), "carre(5) devrait retourner 25");

        // Extension : Test carre(0) == 0
        assertEquals(0, calc.carre(0), "carre(0) devrait retourner 0");
    }
}