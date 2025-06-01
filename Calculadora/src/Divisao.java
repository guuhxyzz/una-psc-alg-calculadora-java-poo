
public class Divisao extends OperacaoMatematica {

    @Override
    public double executar(double numeroUm, double numeroDois) {
        if (numeroDois == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
            return Double.NaN; // Retorna Not a Number 
        }
        return numeroUm / numeroDois;
    }

    @Override
    public String getDescricao() {
        return "Divisão (/)";
    }
}
