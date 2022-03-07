public class CriarBlusaFactory {

    public static ICriarBlusa obterMetodo(String metodo){
        Class classe = null;
        Object objeto = null;

        try{
            classe = Class.forName("factorymethod.Criar" + metodo);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex){
            throw new IllegalArgumentException("Método inexistente");
        }
        if(!(objeto instanceof ICriarBlusa)){
            throw new IllegalArgumentException(("Método inválido"));
        }
        return (ICriarBlusa) objeto;
    }
}
