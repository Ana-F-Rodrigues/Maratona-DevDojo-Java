package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {

        int numero1= 10;
        int numero2= 20;
        int resultado = numero1  * numero2;
        System.out.println(resultado);

         // % resto de divisão
         int resto= 20 % 2;
        System.out.println(resto);

        Boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);

        Boolean isDezMenorQueVinte = 10 < 20;

        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);

        Boolean isDezIgualVinte = 10 == 20;
        System.out.println("isDezIgualVinte "+isDezIgualVinte);

        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        //AND
       int idade =29;
       float salario = 3500;
       boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
       boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        // OR
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation= 5000;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

         // aritmeticos
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //contador
        int contador = 0;
        contador += 1;
        contador++;
        System.out.println(contador);


    }

}
