package pl.exercise.ferry.screen;

import java.util.Set;
import pl.exercise.ferry.pricing.PaymentService;

public class ScreenManager {

  private final Set<Screen> screens;

  public ScreenManager() {
    final PaymentService paymentService = new PaymentService();
    final PersonScreen personScreen = new PersonScreen(this);
    final MainScreen mainScreen = new MainScreen(this);
    final VehicleScreen vehicleScreen = new VehicleScreen(this, paymentService);
    this.screens = Set.of(personScreen, mainScreen, vehicleScreen);
  }

  public void start() {
    chooseScreen(ScreenIdentity.MainScreen);
  }

  void chooseScreen(ScreenIdentity screenId) {
    Screen chosenScreen = findScreen(screenId);
    chosenScreen.interact();
  }

  private Screen findScreen(ScreenIdentity screenId) {
    for (Screen screen : screens) {
      if (screen.isSupportingId(screenId)) {
        return screen;
      }
    }
    throw new IllegalArgumentException(String.format("There is no screen defined with id %s", screenId));
  }
}
