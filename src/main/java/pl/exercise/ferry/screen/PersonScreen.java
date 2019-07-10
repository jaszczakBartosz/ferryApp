package pl.exercise.ferry.screen;

import pl.exercise.ferry.pricing.PaymentService;

public class PersonScreen extends AbstractScreen {

  PersonScreen(ScreenManager screenManager, PaymentService paymentService) {
    super(screenManager, paymentService);
  }

  @Override
  public void interact() {
    System.out.println("Person Screen");
  }

  @Override
  public boolean isSupportingId(int screenId) {
    return 2 == screenId;
  }
}
