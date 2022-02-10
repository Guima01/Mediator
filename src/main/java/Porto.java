public class Porto implements ComunicacaoMaritma{
    private static Porto instancia = new Porto();

    private Porto() {}

    public static Porto getInstancia(){
        return instancia;
    }

    public String recebePermissaoDeAncorar(String mensagem){
        return "O Porto, recebeu o seu comunicado, seu navio tem permissão";
    }

    public  String recebeAvisoDeColisao(String mensagem){
        return "O Porto, estara enviando apoio, mais rápido possível";
    }

    public  String recebeAvisoDeFalhaMecanica(String mensagem){
        return "O Porto, enviamos equipe de manutenção ao seu local";
    }

}