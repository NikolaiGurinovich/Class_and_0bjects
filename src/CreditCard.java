public class CreditCard {
    private String number;
    private  double ballance;


    public CreditCard(String number, double ballance) {
        this.number = number;
        this.ballance = ballance;
    }

    public void increase (double value) {
        ballance = ballance + value;
    }

    public void decrease (double value) {
        ballance = ballance + value;
    }

    public String toString() {
        return "CreditCard{" +
                "number='" + number + '\'' +
                ", ballance=" + ballance +
                '}';
    }


}
