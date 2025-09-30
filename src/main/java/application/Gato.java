package application;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String getNome() {
        return "[Gato]" + this.nome;
    }
    @Override
    public String comunicar() {
        return "MIAU";
    }
    
    public String comunicar(String prefixo) {
        return prefixo + ":" + this.comunicar();
    }
}
