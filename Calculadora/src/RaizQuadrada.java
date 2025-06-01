
public class RaizQuadrada extends OperacaoMatematica {

    @Override
    public double executar(double numeroUm, double numeroDois) {
        if (numeroUm < 0) {
            System.out.println("Não existe raiz de número negativo.");
            return Double.NaN; // Retorna Not a Number
        }
        return Math.sqrt(numeroUm);
    }

    @Override
    public String getDescricao() {
        return "Raiz Quadrada (√)";
    }
}
