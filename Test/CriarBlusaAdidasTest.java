import org.junit.Test;

import static org.junit.Assert.*;

public class CriarBlusaAdidasTest {

    @Test
    public void deveCriarBlusaAdidas() {
        ICriarBlusa blusa = CriarBlusaFactory.obterMetodo("BlusaAdidas");
        assertEquals("Blusa criada", blusa.Criar());
    }

    @Test
    public void deveRemoverBlusaAdidas() {
        ICriarBlusa blusa = CriarBlusaFactory.obterMetodo("Blusa adidas");
        assertEquals("Blusa removida", blusa.Remover());
    }
}