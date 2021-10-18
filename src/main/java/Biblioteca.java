import java.util.Observable;

public class Biblioteca extends Observable {

    private Boolean novaEdicao;
    private String nomeLivro;
    private String autor;
    private String genero;

    public Biblioteca(Boolean novaEdicao, String nomeLivro, String autor, String genero) {
        this.novaEdicao = novaEdicao;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.genero = genero;
    }

    public void NotificarUser(){
        if(this.novaEdicao){
            setChanged();
            notifyObservers();
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nomeLivro='" + nomeLivro + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
