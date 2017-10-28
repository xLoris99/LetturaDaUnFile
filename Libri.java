import java.util.ArrayList;

/**
 * gestione libri
 * Legge da un file di testo i libri che deve gestire. 
 * 
 * @author lorenzo
 * @version 27-10-2017
 */
public class Libri
{
    ArrayList<Libro> elenco;

    /**
     * Costruttore degli oggetti di classe  Libri
     */
    public Libri()
    {
        elenco = TextFile.getData("libri.txt",Libro.class);
    }
    
    public void saveLibri()
    {
        TextFile.saveData("libri1.txt", elenco);
    }

  
}
