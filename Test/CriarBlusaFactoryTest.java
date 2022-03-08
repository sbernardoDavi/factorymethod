import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CriarBlusaFactoryTest {

    @Test
     public void retornaExcecaoMetodoInexistente() {
        try{
            ICriarBlusa blusa = CriarBlusaFactory.obterMetodo("Reformatar");
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Opção inexistente", e.getMessage());
        }
    }

    @Test
    public void retornaExcecaoMetodoInvalido() {
        try{
            ICriarBlusa blusa = CriarBlusaFactory.obterMetodo("Casaco");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Opção inválida", e.getMessage());
        }
    }

}