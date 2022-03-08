public class CriarBlusaFactory {

    public static ICriarBlusa obterMetodo(String metodo){
        Class classe = null;
        Object objeto = null;

        try{
            classe = Class.forName("Criar"+metodo);
            objeto = classe.newInstance();
        } catch (Exception ex){
            throw new IllegalArgumentException("Opção inexistente");
        }
        if(!(objeto instanceof ICriarBlusa)){
            throw new IllegalArgumentException(("Opção inválida"));
        }
        return (ICriarBlusa) objeto;
    }
}
