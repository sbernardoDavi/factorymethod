import org.junit.Test;

import static org.junit.Assert.*;

public class CriarBlusaJordanTest {

    @Test
    public void deveCriarBlusaJordan(){
        ICriarBlusa blusa = CriarBlusaFactory.obterMetodo("BlusaJordan");
        assertEquals("Blusa jordan criada", blusa.Criar());
    }

    @Test
    public void deveRemoverBlusaJordan(){
        ICriarBlusa blusa = CriarBlusaFactory.obterMetodo("BlusaJordan");
        assertEquals("Blusa jordan removida", blusa.Remover());
    }

}