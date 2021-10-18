import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String notificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNotificacao() {
        return notificacao;
    }

    public void Cadastro(Biblioteca biblioteca){
        biblioteca.addObserver(this);
    }

    @Override
    public void update(Observable biblioteca, Object arg) {

        this.notificacao = this.nome + " Nova edição disponível! Segue os Dados: "+ biblioteca.toString();
    }
}
