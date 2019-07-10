package pl.exercise.ferry.screen;

import pl.exercise.ferry.pricing.PaymentService;
import pl.exercise.ferry.ticket.CarTicket;

public class VehicleScreen extends AbstractScreen {

  VehicleScreen(ScreenManager screenManager, PaymentService paymentService) {
    super(screenManager, paymentService);
  }

  @Override
  public void interact() {
    say("Do you want to buy ticket for CarTicket?");
    String answer = in.next();
    if ("Yes".equalsIgnoreCase(answer)) {
      CarTicket carTicket = new CarTicket("carTicket");
      say(String.format("Your ticket costed %s", carTicket.getPrice(paymentService).toPlainString()));
    }
  }

  @Override
  public boolean isSupportingId(int screenId) {
    return 3 == screenId;
  }
}
