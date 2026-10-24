package LLD.SOLID.O.WithPrinciple;




public class main {
    public static void main(String[] args) {
        payment p1 = new UPI();
        payment p2 = new Card();
        payment p3 = new NetBanking();

        p1.pay();
        p2.pay();
        p3.pay();
    }
}
