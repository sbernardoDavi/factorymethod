import org.junit.Test;

import static org.junit.Assert.*;

public class CriarBlusaNikeTest {

    @Test
    public void deveCriarBlusaNike() {
        ICriarBlusa blusa = CriarBlusaFactory.obterMetodo("BlusaNike");
        assertEquals("Blusa nike criada.", blusa.Criar());
    }

    @Test
    public void deveRemoverBlusaNke() {
        ICriarBlusa blusa = CriarBlusaFactory.obterMetodo("BlusaNike");
        assertEquals("Blusa nike removida.", blusa.Remover());
    }
}