import org.junit.Test;
import static org.junit.Assert.*;
public class TesteBuscaInimigo {

    @Test
    public void testeBuscaInimigo(){

        InimigoService service = new MockInimigoService();
        BuscaInimigo buscaInimigo = new BuscaInimigo(service);

        Inimigo SKELETON = buscaInimigo.buscaInimigo(10);

        assertEquals("Skeleton", SKELETON.getNome());
        assertEquals(200.0, SKELETON.getQtdvida());
        assertEquals("Espada do Skeleton", SKELETON.getArma());

    }

}
