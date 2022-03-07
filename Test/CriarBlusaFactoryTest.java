import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CriarBlusaFactoryTest {

    @Test
     public void retornaExcecaoMetodoInexistente() {
        try{
            ICriarBlusa blusa = CriarBlusaFactory.obterMetodo("Reformatar");
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Método inexistente", e.getMessage());
        }
    }

    @Test
    public void retornaExcecaoMetodoInvalido() {
        try{
            ICriarBlusa blusa = CriarBlusaFactory.obterMetodo("BlusaJordan");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Método inválido", e.getMessage());
        }
    }

}