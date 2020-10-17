import java.util.Scanner;

public class inves {
    public static void main(String[] args) {

        int pick, many, what, pay, price, total = 0;
        String initial = null;

        Scanner s = new Scanner (System.in);

        System.out.println("Welcome to HDK Security. A place for good investors!");

        String name = new String();
        String id = new String();


        tor to = new tor();

        name = to.setName();
        id = to.setId();

        System.out.println("What will you do?");
        System.out.println("1. Buy");
        System.out.println("2. Sell");

        pick = s.nextInt();

        if (pick == 1) {
            System.out.println("What STOCK do you wanna buy?");
            System.out.println("1. Telekomunikasi Indonesia Tbk PT (TLKM) - 2750");
            System.out.println("2. Bank Rakyat Indonesia Tbk PT - (BBRI) - 3250 ");
            System.out.println("3. Aneka Tambang Tbk PT - (ANTM) - 940");
            System.out.println("4. Vale Indonesia Tbk PT - (INCO) - 3960");
            System.out.println("Nice! You choose:");

            what = s.nextInt();

            if (what == 1) {
                System.out.println("Telekomunikasi Indonesia Tbk PT - (TLKM) - 2750");
                initial = "Telekomunikasi Indonesia Tbk PT - (TLKM)";
            }
            if (what == 2) {
                System.out.println("Bank Rakyat Indonesia Tbk PT - (BBRI) - 3250");
                initial = "Bank Rakyat Indonesia Tbk PT - (BBRI)";
            }
            if (what == 3) {
                System.out.println("Aneka Tambang Tbk PT - (ANTM) - 940");
                initial = "Aneka Tambang Tbk PT - (ANTM)";
            }
            if (what == 4) {
                System.out.println("Vale Indonesia Tbk PT - (INCO) - 3960");
                initial = "Vale Indonesia Tbk PT - (INCO)";

            }

            System.out.println("How many lot do you wanna buy? (1 lot = 100 shares)");
            pay = s.nextInt();
            System.out.println(pay + "lot");

            if (what == 1) {
                System.out.println("Total: ");
                total = pay * 2750;
                System.out.println(total);
                System.out.println("You need to pay" + total + " for the payment.");
                System.out.println("You have" + " " + pay + " " + "lot.");

            }

            if (what == 2) {
                System.out.println("Total: ");
                total = pay * 3250;
                System.out.println(total);
                System.out.println("You need to pay" + total + "for the payment.");
                System.out.println("You have" + " " + pay + " " + "lot.");

            }

            if (what == 3) {
                System.out.println("Total: ");
                total = pay * 940;
                System.out.println(total);
                System.out.println("You need to pay" + total + "for the payment");
                System.out.println("You have" + " " + pay + " " + "lot.");

            }

            if (what == 4) {
                System.out.println("Total: ");
                total = pay * 3960;
                System.out.println(total);
                System.out.println("You need to pay" + total + "for the payment.");
                System.out.println("You have" + " " + pay + " " + "lot.");
            }
        }

        if (pick == 2){
            System.out.println("What STOCK do you wanna sell?");
            System.out.println("1. Telekomunikasi Indonesia Tbk PT (TLKM) - 2750");
            System.out.println("2. Bank Rakyat Indonesia Tbk PT - (BBRI) - 3250 ");
            System.out.println("3. Aneka Tambang Tbk PT - (ANTM) - 940");
            System.out.println("4. Vale Indonesia Tbk PT - (INCO) - 3960");
            System.out.println("Nice! You choose:");

            what = s.nextInt();

            if (what == 1){
                System.out.println("Telekomunikasi Indonesia Tbk PT - (TLKM) - 2750");
                initial = "Telekomunikasi Indonesia Tbk PT - (TLKM)";
            }
            if (what == 2){
                System.out.println("Bank Rakyat Indonesia Tbk PT - (BBRI) - 3250");
                initial = "Bank Rakyat Indonesia Tbk PT - (BBRI)";
            }
            if (what == 3){
                System.out.println("Aneka Tambang Tbk PT - (ANTM) - 940");
                initial = "Aneka Tambang Tbk PT - (ANTM)";
            }
            if (what == 4){
                System.out.println("Vale Indonesia Tbk PT - (INCO) - 3960");
                initial = "Vale Indonesia Tbk PT - (INCO)";

            }

            System.out.println("How many lot do you wanna sell? (1 lot = 100 shares)");
            pay = s.nextInt();
            System.out.println(pay + "lot(s)");

            if (what == 1) {
                System.out.println("Total: ");
                total = pay * 2750;
                System.out.println(total);
                System.out.println("You will get" + " " + total + " " + "for the payment.");


            }

            if (what == 2) {
                System.out.println("Total: ");
                total = pay * 3250;
                System.out.println(total);
                System.out.println("You will get" + " " + total + " " + "for the payment.");


            }

            if (what == 3) {
                System.out.println("Total: ");
                total = pay * 940;
                System.out.println(total);
                System.out.println("You will get" + " " + total + " " + "for the payment.");


            }

            if (what == 4) {
                System.out.println("Total: ");
                total = pay * 3960;
                System.out.println(total);
                System.out.println("You will get" + " " + total + " " + "for the payment.");


            }

        }

    }
}


