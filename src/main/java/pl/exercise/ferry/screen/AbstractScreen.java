package pl.exercise.ferry.screen;

import java.util.Scanner;
import pl.exercise.ferry.pricing.PaymentService;

public abstract class AbstractScreen implements Screen {

  protected final PaymentService paymentService;
  final Scanner in = new Scanner(System.in);
  private final ScreenManager screenManager;

  AbstractScreen(ScreenManager screenManager, PaymentService paymentService) {
    this.screenManager = screenManager;
    this.paymentService = paymentService;
  }

  void say(String msg) {
    System.out.println(msg);
  }
}
