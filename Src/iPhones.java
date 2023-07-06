public class iPhones implements Smartphones,IOS{

    @Override
    public void call() {
        System.out.println("iPhone: Calling ");

    }

    @Override
    public void sms() {
        System.out.println("iPhone: Sending iMessage  ");
    }

    @Override
    public void internet() {
        System.out.println("iPhone: Browsing the internet");
    }
}
