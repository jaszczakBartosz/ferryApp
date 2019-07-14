package pl.exercise.ferry.screen;

public class MainScreen extends AbstractScreen {

  public MainScreen(ScreenManager screenManager) {
    super(screenManager);
  }

  public void interact() {
    System.out.println("To jak, do bierzemy się za robote?");
    String firstResponse = in.nextLine();
    if ("tak".equalsIgnoreCase(firstResponse)) {
      System.out.println("To super!");
    }
  }

  @Override
  public boolean isSupportingId(ScreenIdentity screenId) {
    return ScreenIdentity.MainScreen == screenId;
  }
}
