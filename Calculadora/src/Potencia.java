
public class Potencia extends OperacaoMatematica {

    @Override
    public double executar(double numeroUm, double numeroDois) {
        if (numeroDois == 0) {
            System.out.println("Todo número elevado a zero será igual a 1.");
            return 1.0;
        }
        return Math.pow(numeroUm, numeroDois);
    }

    @Override
    public String getDescricao() {
        return "Potência (^)";
    }
}
