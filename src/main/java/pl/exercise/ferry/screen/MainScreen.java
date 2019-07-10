package pl.exercise.ferry.screen;

import pl.exercise.ferry.pricing.PaymentService;

public class MainScreen extends AbstractScreen {

  public MainScreen(ScreenManager screenManager, PaymentService paymentService) {
    super(screenManager, paymentService);
  }

  public void interact() {
    System.out.println("To jak, do bierzemy się za robote?");
    String firstResponse = in.nextLine();
    if ("tak".equalsIgnoreCase(firstResponse)) {
      System.out.println("To super!");
    }
  }

  @Override
  public boolean isSupportingId(int screenId) {
    return 1 == screenId;
  }
}
