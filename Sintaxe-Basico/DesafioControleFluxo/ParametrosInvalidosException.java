package desafios.SintaxeBasico.DesafioControleFluxo;

public class ParametrosInvalidosException extends Throwable {
    public String getMessage() {
        return "O segundo parâmetro deve ser maior que o primeiro";
    }
}