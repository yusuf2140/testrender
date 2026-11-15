public class Main {
    public static void main(String[] args) throws Exception {

        int port = Integer.parseInt(
            System.getenv().getOrDefault("PORT", "10000")
        );

        System.out.println("Server started on port " + port);

        while(true) {
            Thread.sleep(1000);
        }
    }
}