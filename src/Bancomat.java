public class Bancomat {
    private int cash20;
    private int cash50;
    private int cash100;

    public Bancomat(int count20, int count50, int count100) {
        this.cash20 = count20;
        this.cash50 = count50;
        this.cash100 = count100;
    }
    public void add (int value) {
        if (value / 100 >= 1 ){
            cash100 = cash100 + (value / 100);
            value = value - (value / 100 * 100);
        }
        if (value / 50 >= 1 ) {
            cash50 = cash50 + (value / 50);
            value = value - (value / 50 * 50);
        }
        if (value / 20 >= 1) {
            cash20 = cash20 + (value / 20);
            value = value - (value / 20 * 20);
        }
    }
    public String take (int value) {
        boolean enough = (cash100 * 100) + (cash50 * 50) + (cash20 * 20) >= value ?  true : false;
        String stringResult;
        if (enough) {
            int result100 = 0;
            int result50 = 0;
            int result20 = 0;
            if (value / 100 >= 1 ){
                result100 = (value / 100);
                cash100 = cash100 - (value / 100);
                value = value - (value / 100 * 100);
            }
            if (value / 50 >= 1 ) {
                result50 = (value / 50);
                cash50 = cash50 - (value / 50);
                value = value - (value / 50 * 50);
            }
            if (value / 20 >= 1) {
                result20 = (value / 20);
                cash20 = cash20 - (value / 20);
                value = value - (value / 20 * 20);
            }
            stringResult = "Количесьво купюр : " + "\n"
                    + "100 - " +  result100 + "\n"
                    + "50 - "  + result50 + "\n"
                    + "20 - " + result20;
        } else stringResult = "Недостаточно средств" ;
        return stringResult ;
    }

    public String toString() {
        return "Bancomat{" +
                "cash20=" + cash20 +
                ", cash50=" + cash50 +
                ", cash100=" + cash100 +
                '}';
    }
}
