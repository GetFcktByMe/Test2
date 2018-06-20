

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse KommentarTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KommentarTest
{
    private Produkt produkt1;
    private Produkt produkt2;

    /**
     * Konstruktor fuer die Test-Klasse KommentarTest
     */
    public KommentarTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        produkt1 = new Produkt("Apfel", 13);
        produkt2 = new Produkt("Birne", 3);
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testMethode()
    {
        Produkt produkt1 = new Produkt("Coconut", 300000000);
        Kommentar kommenta1 = new Kommentar("Patrick Patrickovic Lehmannovic", "Very Nice", 1);
        assertEquals(true, produkt1.kommentarHinzufuegen("aknfk", "sfg", 5));
        assertEquals(true, produkt1.kommentarHinzufuegen("Patrick Patrickovic Lehmannovic", "Mega das scheiß Produkt", 1 ));
    }

    @Test
    public void test0Punkte()
    {
        assertEquals(false, produkt2.kommentarHinzufuegen("Peter Peterovic Steinovic", "Keine Ahnung", 0));
    }
}


