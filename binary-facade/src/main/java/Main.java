public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация корректной работы
        String a = "100", b = "1001";
        System.out.printf("%s + %s = %s%n", a, b, bins.sum(a, b));
        System.out.printf("%s * %s = %s%n", a, b, bins.mult(a, b));
        // демонстрация обработки ошибок
        String illegalBinary = "4", illegalNumber = "девять";
        System.out.printf("%s * %s = %s%n", illegalBinary, b, bins.mult(illegalBinary, b));
        System.out.printf("%s * %s = %s%n", a, illegalNumber, bins.sum(a, illegalNumber));
        System.out.printf("%s * %s = %s%n", illegalBinary, illegalNumber, bins.mult(illegalBinary, illegalNumber));
    }
}