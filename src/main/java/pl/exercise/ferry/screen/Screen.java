package pl.exercise.ferry.screen;

public interface Screen {

  void interact();

  boolean isSupportingId(ScreenIdentity screenId);

}
