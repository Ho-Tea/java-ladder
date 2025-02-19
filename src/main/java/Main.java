import controller.LadderController;
import view.InputView;
import view.OutputView;

public class Main {
    public static void main(String[] args) throws Exception {
        try (InputView inputView = new InputView()) {
            new LadderController(inputView, new OutputView()).play();
        }
    }
}
