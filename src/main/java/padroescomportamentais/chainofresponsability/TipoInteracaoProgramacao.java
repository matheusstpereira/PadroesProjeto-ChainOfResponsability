package padroescomportamentais.chainofresponsability;

public class TipoInteracaoProgramacao implements TipoInteracao {

    private static TipoInteracaoProgramacao tipoInterfaceProgramacao = new TipoInteracaoProgramacao();

    private TipoInteracaoProgramacao(){
    };

    public static TipoInteracaoProgramacao getTipoInterfaceProgramacao(){
        return tipoInterfaceProgramacao;
    }

}
