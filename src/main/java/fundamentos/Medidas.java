package fundamentos;

import java.util.Scanner;

public class Medidas {
    static Scanner entrada = new Scanner(System.in); // variavel global

    public static void main(String[] args) {
        String opcao;
        int area = 0 ;

//        entrada = new Scanner(System.in); // instanciar objeto de entrada // refatorado deixando o entrada global

        System.out.println("Escolha o calculo desejado");
        System.out.println("(1) Area do quadrado");
        System.out.println("(2) Area do retangulo");
        System.out.println("(3) Area do triangulo");
        System.out.println("(4) Area do circulo");

        opcao = entrada.nextLine(); //leitura da opção
        switch (opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                break;
            default:
                System.out.println("Opcao invalida: " + opcao);
        }
        if (area > 0) {
            System.out.println("A area e de " + area + "m2");
        }
    }

    public static int calcularAreaDoQuadrado(){
        int lado;

//        Scanner entrada = new Scanner(System.in); // refatorado tornando a variavel entrada Global
        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); //leitura do tamanho do lado a partir do teclado
        return lado * lado;
        //return area; // refatorado retornando direto o calculo na linha acima
    }
}
