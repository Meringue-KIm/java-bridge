package bridge;

public class Application {

    public static void main(String[] args) {
        try {
            BridgeGame bridgeGame = new BridgeGame();
            bridgeGame.proceed();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
