package chap14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Classe de test pour la classe Livre.
 */
public class LivreTest {

    /**
     * Test que le titre du livre est correct.
     */
    @Test
    public void testGetTitre() {
        Livre livre = new Livre("Les Misérables", "Victor Hugo");
        assertEquals("Les Misérables", livre.getTitre(), "Le titre doit être 'Les Misérables'");
    }

    /**
     * Test que l'auteur du livre est correct.
     */
    @Test
    public void testGetAuteur() {
        Livre livre = new Livre("Les Misérables", "Victor Hugo");
        assertEquals("Victor Hugo", livre.getAuteur(), "L'auteur doit être 'Victor Hugo'");
    }
}
