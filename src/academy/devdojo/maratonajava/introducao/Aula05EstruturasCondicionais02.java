package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // se idade < 15 categoria infantil
        //se idade >= 15 && idade < 18 categoria juvenil
        // se idade >=18 categoria adulto

        int idade = 15;
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        } else
            System.out.println("Categoria Adulto");

    }
}
