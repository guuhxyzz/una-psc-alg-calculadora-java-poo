
public class Multiplicacao extends OperacaoMatematica {

    @Override
    public double executar(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }

    @Override
    public String getDescricao() {
        return "Multiplicação (*)";
    }
}
