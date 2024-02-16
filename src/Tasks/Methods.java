package Tasks;

public class Methods {
    public double loanAmount;
    public double years;
    public double percentage;
    public double endingBalance;
    public double startingBalance;
    public double interest;
    public double principal;
    public double totalInterest;
    public double monthPercentage;
    double payment;

    public Methods(double loanAmount, double years, double percentage) {
        this.years = years;
        this.loanAmount = loanAmount;
        this.percentage = percentage / 100;

    }
    public void payment() {
        monthPercentage = percentage / 12;
        double pow = Math.pow((1 + monthPercentage), years * 12);
        double annuitet = ((monthPercentage * pow)) / (pow - 1);
        payment = loanAmount * annuitet;
        System.out.println(payment);
    }

    public void startingBalance(){
        if(endingBalance <= 0) {
            startingBalance = loanAmount;
        }else{
            startingBalance = endingBalance;
        }
        System.out.println(startingBalance);
    }

    public void calcInterest() {
        interest = startingBalance * monthPercentage;
        System.out.println(interest);
    }


    public void principal() {
        principal = payment - interest;
        System.out.println(principal);
    }

    public void endingBalance() {
        if(startingBalance <= 0){
            endingBalance = loanAmount - principal;
        }else {
            endingBalance = startingBalance - principal;
        }
        System.out.println(endingBalance);
    }

    public void totalInterest() {
        totalInterest += interest;
        System.out.println(totalInterest);
    }
}
