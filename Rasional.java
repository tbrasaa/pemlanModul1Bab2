public class Rasional {
    private int pembilang, penyebut;

    public Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }

    public boolean isRasional() {
        return (penyebut != 0); // fix: != bukan ==
    }

    public void Sederhana() {
        int temp, A, B;
        if (penyebut == 0) return;

        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;

        for (; B != 0; B = temp) {
            temp = A % B;
            A = B;
        }

        pembilang /= A;
        penyebut /= A;
    }

    public double Cast() {
        return (penyebut == 0) ? 0.0 : (double) pembilang / (double) penyebut;
    }

    public boolean moreThan(Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    public boolean lessThan(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }

    public boolean lessOrEqual(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }

    public boolean moreOrEqual(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }

    // Unary minus: membalik tanda pembilang
    public void negasi() {
        pembilang = -pembilang;
    }

    // Penjumlahan: this = this + A
    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut = penyebut * A.penyebut;
    }

    // Pengurangan: this = this - A
    public void kurang(Rasional A) {
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut = penyebut * A.penyebut;
    }

    // Perkalian: this = this * A
    public void kali(Rasional A) {
        pembilang = pembilang * A.pembilang;
        penyebut = penyebut * A.penyebut;
    }

    // Pembagian: this = this / A
    public void bagi(Rasional A) {
        if (A.pembilang == 0) return;
        pembilang = pembilang * A.penyebut;
        penyebut = penyebut * A.pembilang;
    }

    public void cetak(String label) {
        System.out.println(label + pembilang + "/" + penyebut);
    }
}