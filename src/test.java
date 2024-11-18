public class test extends testAbs {
    int numar;

    test() {
        numar = 0;
        numar2 = 0;
    }

    test(int nr1, int nr2) {
        numar = nr1;
        numar2 = nr2;

    }

    public String toString() {
        return "Numar1: " + numar + "Numar2: " + numar2 +
                " Suma:" + adunare();
    }

    public int adunare() {
        return numar + numar2;
    }

    public static void main(String[] args) {
        test obiect1 = new test();
        System.out.println(obiect1.toString());

        test obiect2 = new test(29, 31);
        System.out.println(obiect2.toString());
    }
}
