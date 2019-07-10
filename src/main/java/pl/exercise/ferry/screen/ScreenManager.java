package pl.exercise.ferry.screen;

import java.util.Set;
import pl.exercise.ferry.pricing.PaymentService;

public class ScreenManager {

  private final Set<Screen> screens;

  public ScreenManager() {
    final PaymentService paymentService = new PaymentService();
    final PersonScreen personScreen = new PersonScreen(this, paymentService);
    final MainScreen mainScreen = new MainScreen(this, paymentService);
    final VehicleScreen vehicleScreen = new VehicleScreen(this, paymentService);
    this.screens = Set.of(personScreen, mainScreen, vehicleScreen);
  }

  public void start() {
    chooseScreen(1);
  }

  void chooseScreen(int screenId) {
    Screen chosenScreen = findScreen(screenId);
    chosenScreen.interact();
  }

  private Screen findScreen(int screenId) {
    for (Screen screen : screens) {
      if (screen.isSupportingId(screenId)) {
        return screen;
      }
    }
    throw new IllegalArgumentException(String.format("There is no screen defined with id %d", screenId));
  }
}
