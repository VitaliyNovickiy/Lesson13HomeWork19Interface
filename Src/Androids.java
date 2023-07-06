public class Androids implements Smartphones,LinuxOS{

    @Override
    public void call() {
        System.out.println("Android: Calling ");

    }

    @Override
    public void sms() {
        System.out.println("Android: Sending SMS ");
    }

    @Override
    public void internet() {
        System.out.println("Android: Browsing the internet");
    }

    @Override
    public void androidCommand() {
        System.out.println("Android: Running LinuxOS commands");
    }
}
