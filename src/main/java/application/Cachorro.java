package application;

public class Cachorro extends Animal {
    protected Cachorro(String nome) {
        super(nome);
    }
    
    @Override
    public String comunicar() {
        return "AU, AU";
    }
    
}
