import java.util.Scanner;

public class Tracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o preço de compra de cada ação: ");
        double buyingPrice = input.nextDouble();
        int day = 1;
        double closePrice;
        double[] weekly = new double[7];

        int i = 0;
        while (i < weekly.length) {
            System.out.println("Insira o valor de fechamento da ação: " + day);
            closePrice = input.nextDouble();
            double earnings = closePrice - buyingPrice;
            weekly[i] = earnings;



            if (earnings > 0) {
                System.out.printf("Depois do dia %d você teve um ganho de R$%.2f comparado ao dia anterior%n", day, earnings);
            } else if (earnings < 0) {
                System.out.printf("Depois do dia %d você teve uma perda de R$%.2f comparado ao dia anterior%n", day, (-earnings));
            } else {
                System.out.printf("Depois do dia %d, sem ganhos ou perdas.%n", day);
            }

            day += 1;
            i += 1;
        }
        System.out.println("Seus ganhos na semana: ");
        double totalWeekEarnings = 0;
        for (int j = 0; j < weekly.length; j++) {
            System.out.printf("O ganho do dia " + j + " foi R$%.2f",weekly[j]);
            System.out.println("");
            totalWeekEarnings += weekly[j];
        }
        System.out.printf("Ganhos totais " + "R$%.2f " + "por ação.", totalWeekEarnings);
        input.close();
    }
}
