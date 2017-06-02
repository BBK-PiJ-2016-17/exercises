public class SmartPhone extends MobilePhone {

    public SmartPhone(String brand) {
        super(brand);
    }

    public void browseWeb(String url) {
        System.out.println("Currently visiting this web page: " + url);
    }

    public String findPosition() {
        return "You are here: 51.5074° N, 0.1278° W (London, UK)";
    }

    @Override
    public void call(String number) {
        if (number.charAt(0) == '0' && number.charAt(1) == '0') {
            System.out.println("Calling " + number + " from the internet");
        } else {
            super.call(number);
        }
    }
}