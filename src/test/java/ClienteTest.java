import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void notificandoUsuario(){

        Biblioteca biblioteca = new Biblioteca(true, "Mitologia Nórdica","Desconhecido", "Aventura");
        Cliente cliente = new Cliente("Carlos");
        cliente.Cadastro(biblioteca);
        biblioteca.NotificarUser();
        assertEquals("Carlos Nova edição disponível! Segue os Dados: Biblioteca{nomeLivro='Mitologia Nórdica', autor='Desconhecido', genero='Aventura'}", cliente.getNotificacao());
    }

    @Test
    void notificandoUsuarios(){

        Biblioteca biblioteca = new Biblioteca (true,"Livro Teste","Autor Teste","Romance");
        Biblioteca biblioteca2= new Biblioteca(true,"48 leis do poder", "Teste", "não-fictício");
        Cliente cliente = new Cliente("Sandra");
        Cliente cliente2 = new Cliente("Felipe");
        cliente.Cadastro(biblioteca);
        cliente2.Cadastro(biblioteca2);
        biblioteca.NotificarUser();
        biblioteca2.NotificarUser();
        assertEquals("Sandra Nova edição disponível! Segue os Dados: Biblioteca{nomeLivro='Livro Teste', autor='Autor Teste', genero='Romance'}", cliente.getNotificacao());
        assertEquals("Felipe Nova edição disponível! Segue os Dados: Biblioteca{nomeLivro='48 leis do poder', autor='Teste', genero='não-fictício'}", cliente2.getNotificacao());
    }

    @Test
    void semNotificacoes(){
        Biblioteca biblioteca = new Biblioteca(false,"Pai Rico Pai Pobre", "Desconhecido","Desconhecido");
        Cliente cliente = new Cliente("Amanda");
        biblioteca.NotificarUser();
        assertEquals(null,cliente.getNotificacao());
    }

}