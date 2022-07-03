public class Main {
    public static void main(String[] args) {
        int cash = 57;
        int refill = 1450;
        if (refill >= 1000) {
            cash = cash + refill + refill / 100;
        }
        else {
            cash = cash + refill;
        }
        System.out.println(cash);

    }
}
