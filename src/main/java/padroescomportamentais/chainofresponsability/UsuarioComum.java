package padroescomportamentais.chainofresponsability;

public class UsuarioComum extends Usuario{

    public UsuarioComum(Usuario superior) {
        listaInterfaces.add(TipoInteracaoOperacional.getTipoInterfaceOperacional());
        setUsuarioSuperior(superior);
    }

    public String getDescricaoInterface() {
        return "Comum";
    }

}
