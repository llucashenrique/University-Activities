package secondsemester.fixationexercises;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de motoristas: ");
        int numMotoristas = scanner.nextInt();

        int totalMotoristas = 0;
        int motoristasMenosDe21 = 0;
        int mulheresCapital = 0;
        int motoristasInteriorMaior60 = 0;
        boolean existeMulherMaior60 = false;

        for (int i = 0; i < numMotoristas; i++) {
            System.out.println("\nDigite o ano de nascimento: ");
            int anoNascimento = scanner.nextInt();
            System.out.println("Digite o sexo (M para Masculino, F para Feminino): ");
            char sexo = scanner.next().charAt(0);
            System.out.println("Digite a procedência (0 - Capital, 1 - Interior, 2 - Outro estado): ");
            int procedencia = scanner.nextInt();

            int idade = 2024 - anoNascimento;
            totalMotoristas++;

            if (idade < 21) {
                motoristasMenosDe21++;
            }

            if (sexo == 'F' && procedencia == 0) {
                mulheresCapital++;
            }

            if (procedencia == 1 && idade > 60) {
                motoristasInteriorMaior60++;
            }

            if (sexo == 'F' && idade > 60) {
                existeMulherMaior60 = true;
            }
        }


        double porcentagemMenosDe21 = ((double) motoristasMenosDe21 / totalMotoristas) * 100;
        System.out.print("\nPorcentagem de motoristas com menos de 21 anos: %.2f%%\n"+ porcentagemMenosDe21);
        System.out.println("Número de mulheres da capital: " + mulheresCapital);

        System.out.println("Número de motoristas do interior com idade maior que 60 anos: " + motoristasInteriorMaior60);

        if (existeMulherMaior60) {
            System.out.println("Existe pelo menos uma mulher com idade maior que 60 anos.");
        } else {
            System.out.println("Não existe mulher com idade maior que 60 anos.");
        }

        scanner.close();
    }
}

