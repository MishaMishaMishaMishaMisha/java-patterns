public class Fan {

  private State state;

  public Fan() {
    state = new StateMedium();
  }

  public void setState(State state) {
    this.state = state;
  }

  public void turnUp() {
    if (state == null) {
      return;
    }
    state.turnUp(this);
  }

  public void turnDown() {
    if (state == null) {
      return;
    }
    state.turnDown(this);
  }

}