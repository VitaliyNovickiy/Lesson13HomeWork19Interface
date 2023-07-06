public class Program {
    public static void main(String[] args) {
        Smartphones android = new Androids();
        android.call();
        android.sms();
        android.internet();

        System.out.println();

        Smartphones iPhone = new iPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
    }
}
