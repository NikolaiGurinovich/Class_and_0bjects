public class Main {
    public static void main(String[] args) {
        /*CreditCard cardOne = new CreditCard("BY123456FG", 1200);
        CreditCard cardTwo = new CreditCard("GB128456FG", 11400);
        CreditCard cardThree = new CreditCard("US723456FG", 43250);

        cardOne.increase(1000);
        cardTwo.increase(10000);
        cardThree.decrease(10000);

        System.out.println(cardOne.toString());
        System.out.println(cardTwo.toString());
        System.out.println(cardThree.toString());*/

        Bancomat firstBancomat = new Bancomat(5,2,1);
        firstBancomat.add(170);
        System.out.println(firstBancomat.take(280));
        System.out.println(firstBancomat.toString());

    }
}