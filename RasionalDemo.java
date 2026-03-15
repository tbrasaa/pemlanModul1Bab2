public class RasionalDemo {
    public static void main(String[] args) {
        Rasional R1 = new Rasional(1, 2);
        Rasional R2 = new Rasional(1, 3);

        System.out.println("R1.isRasional: " + R1.isRasional());
        System.out.println("R2.isRasional: " + R2.isRasional());
        System.out.println();
        System.out.println("R1 > R2  : " + R1.moreThan(R2));
        System.out.println("R1 < R2  : " + R1.lessThan(R2));
        System.out.println("R1 <= R2 : " + R1.lessOrEqual(R2));
        System.out.println("R1 >= R2 : " + R1.moreOrEqual(R2));
        System.out.println();
        R1.cetak("R1 : ");
        R2.cetak("R2 : ");

        System.out.println();
        R1.Sederhana();
        R2.Sederhana();
        R1.cetak("R1 : ");
        R2.cetak("R2 : ");
        System.out.println();

        System.out.println("Setelah dilakukan Cast ke double menjadi: ");
        System.out.println("R1 : " + R1.Cast());
        System.out.println("R2 : " + R2.Cast());
        System.out.println();

        R1.negasi();
        R1.cetak("Unary- dari R1 : ");
        System.out.println();

        R1.unaryPlus(R2);
        R1.cetak("R1 + R2 : ");
        System.out.println();

        Rasional R3 = new Rasional(3, 4);
        Rasional R4 = new Rasional(1, 4);
        R3.kurang(R4);
        R3.cetak("3/4 - 1/4 : ");
        System.out.println();

        Rasional R5 = new Rasional(2, 3);
        Rasional R6 = new Rasional(3, 5);
        R5.kali(R6);
        R5.cetak("2/3 * 3/5 : ");
        System.out.println();

        Rasional R7 = new Rasional(2, 3);
        Rasional R8 = new Rasional(4, 5);
        R7.bagi(R8);
        R7.cetak("2/3 / 4/5 : ");
        System.out.println();
    }
}