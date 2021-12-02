package padroescomportamentais.chainofresponsability;

public class TipoInteracaoFinancas implements TipoInteracao {

    private static TipoInteracaoFinancas tipoInterfaceFinancas = new TipoInteracaoFinancas();

    private TipoInteracaoFinancas(){
    };

    public static TipoInteracaoFinancas getTipoInterfaceFinancas(){
        return tipoInterfaceFinancas;
    }


}
