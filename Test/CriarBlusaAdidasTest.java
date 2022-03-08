import org.junit.Test;

import static org.junit.Assert.*;

public class CriarBlusaAdidasTest {

    @Test
    public void deveCriarBlusaAdidas() {
        ICriarBlusa blusa = CriarBlusaFactory.obterMetodo("BlusaAdidas");
        assertEquals("Blusa adidas criada", blusa.Criar());
    }

    @Test
    public void deveRemoverBlusaAdidas() {
        ICriarBlusa blusa = CriarBlusaFactory.obterMetodo("BlusaAdidas");
        assertEquals("Blusa adidas removida", blusa.Remover());
    }
}