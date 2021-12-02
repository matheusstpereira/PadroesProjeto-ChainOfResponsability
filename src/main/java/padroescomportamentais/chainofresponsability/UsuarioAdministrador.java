package padroescomportamentais.chainofresponsability;

public class UsuarioAdministrador extends Usuario{

    public UsuarioAdministrador(Usuario superior) {
        listaInterfaces.add(TipoInteracaoFinancas.getTipoInterfaceFinancas());
        setUsuarioSuperior(superior);
    }

    public String getDescricaoInterface() {
        return "Administrador";
    }

}
