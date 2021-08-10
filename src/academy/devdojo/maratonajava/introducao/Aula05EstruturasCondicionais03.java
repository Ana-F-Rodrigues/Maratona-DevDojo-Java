package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 3000;
        String mensagemDoar= "Vou doar 500 pro DevDojo";
        String mensagemNaoDoar= "Ainda nao tenho condiçoes";
        //(Condicao) ? verdadeiro : falso

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;


        System.out.println(resultado);
    }
}
