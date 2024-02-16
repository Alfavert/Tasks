package Tasks;

import java.util.Scanner;

public class Tasks {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите сумму кредита");
            double loanAmount1 = input.nextInt();
            System.out.println("Введите количество лет");
            double years1 = input.nextDouble();
            System.out.println("Введите процентную ставку по кредиту, годовую");
            double percentage1 = input.nextDouble();
            Methods calculation = new Methods(loanAmount1, years1, percentage1);
            System.out.println();
            for (int i = 1; i <= (calculation.years * 12); i++) {
                System.out.println("Месяц - "+i);
                System.out.print("Остаток задолжности - ");
                calculation.startingBalance();
                System.out.print("Выплата - ");
                calculation.payment();
                System.out.print("Начисленные проценты - ");
                calculation.calcInterest();
                System.out.print("Сумма в уплату долга - ");
                calculation.principal();
                System.out.print("Остаток задолжности - ");
                calculation.endingBalance();
                System.out.print("Прибыль Банка - ");
                calculation.totalInterest();
                System.out.println();
            }
        }}

