package equipamentos.genericos;

public class ReprodutorMusicalImpl implements IReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando Música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música.");
    }
}
