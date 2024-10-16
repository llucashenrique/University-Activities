package secondsemester.listexercises;

public class Mes {
    public String getMesPorExtenso(int numeroMes, int idioma) {
        String[][] meses = {
                {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"},
                {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}
        };

        if (numeroMes < 1 || numeroMes > 12 || (idioma != 1 && idioma != 2)) {
            return "Entrada inválida";
        }

        return meses[idioma - 1][numeroMes - 1];
    }

    public static void main(String[] args) {
        Mes mes = new Mes();

        System.out.println("Mês 1 em Português: " + mes.getMesPorExtenso(1, 1)); // Janeiro
        System.out.println("Mês 2 em Inglês: " + mes.getMesPorExtenso(2, 2)); // February
        System.out.println("Mês 3 em Português: " + mes.getMesPorExtenso(3, 1)); // Março
        System.out.println("Mês 4 em Inglês: " + mes.getMesPorExtenso(4, 2)); // April
        System.out.println("Mês 5 em Português: " + mes.getMesPorExtenso(5, 1)); // Maio
        System.out.println("Mês 6 em Inglês: " + mes.getMesPorExtenso(6, 2)); // June
    }
}
