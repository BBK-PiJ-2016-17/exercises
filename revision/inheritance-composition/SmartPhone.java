public class SmartPhone extends MobilePhone {
    public void browseWeb(String url) {
        System.out.println("Currently visiting this web page: " + url);
    }

    public String findPosition() {
        return "You are here: 51.5074° N, 0.1278° W (London, UK)";
    }
}