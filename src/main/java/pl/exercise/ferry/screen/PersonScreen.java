package pl.exercise.ferry.screen;

public class PersonScreen extends AbstractScreen {

  PersonScreen(ScreenManager screenManager) {
    super(screenManager);
  }

  @Override
  public void interact() {
    System.out.println("Person Screen aand going back to MainScreen");
    screenManager.chooseScreen(ScreenIdentity.MainScreen);
  }

  @Override
  public boolean isSupportingId(ScreenIdentity screenId) {
    return ScreenIdentity.PersonScreen == screenId;
  }
}
