package padroescomportamentais.chainofresponsability;

public class TipoInteracaoOperacional implements TipoInteracao {

    private static TipoInteracaoOperacional tipoInterfaceOperacional = new TipoInteracaoOperacional();

    private TipoInteracaoOperacional(){
    };

    public static TipoInteracaoOperacional getTipoInterfaceOperacional(){
        return tipoInterfaceOperacional;
    }

}
