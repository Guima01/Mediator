public class ControleDeTrafegoMaritmo {
    private static ControleDeTrafegoMaritmo instancia = new ControleDeTrafegoMaritmo();

    private ControleDeTrafegoMaritmo () {}

    public static ControleDeTrafegoMaritmo getInstancia(){
        return instancia;
    }

    public String recebePermissaoDoPorto(String mensagem){
        return  "Recebemos o seu contato.\n"+
                "O Porto responde conforme a solicitação\n"+
                ">>" +  Porto.getInstancia().recebePermissaoDeAncorar(mensagem);
    }
    public String recebeAvisoDeColisaoParaPorto(String mensagem){
        return  "Recebemos o seu contato.\n"+
                "O Porto responde conforme a solicitação\n"+
                ">>" +  Porto.getInstancia().recebeAvisoDeColisao(mensagem);
    }
    public String recebeAvisoDeFalhaMecanicaNoPorto(String mensagem){
        return  "Recebemos o seu contato.\n"+
                "O Porto responde conforme a solicitação\n"+
                ">>" +  Porto.getInstancia().recebeAvisoDeFalhaMecanica(mensagem);
    }
}