package padroescomportamentais.chainofresponsability;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InteracaoTest {


    UsuarioDesenvolvedor desenvolvedor;
    UsuarioComum comum;
    UsuarioAdministrador administrador;

    @BeforeEach
    void setUp(){
        desenvolvedor = new UsuarioDesenvolvedor(null);
        administrador = new UsuarioAdministrador(desenvolvedor);
        comum = new UsuarioComum(administrador);
    }

    @Test
    void deveRetornarDesenvolvedorParaCadastroInteracaoProgramacao(){
        assertEquals("Desenvolvedor", desenvolvedor.cadastrarInteracao(new Interacao(TipoInteracaoProgramacao.getTipoInterfaceProgramacao())));
    }

    @Test
    void deveRetornarAdministradorParaCadastroInteracaoFinancas(){
        assertEquals("Administrador", administrador.cadastrarInteracao(new Interacao(TipoInteracaoFinancas.getTipoInterfaceFinancas())));
    }

    @Test
    void deveRetornarComumParaCadastroInteracaoOperacional(){
        assertEquals("Comum", comum.cadastrarInteracao(new Interacao(TipoInteracaoOperacional.getTipoInterfaceOperacional())));
    }


}
