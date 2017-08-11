package coffee;

import javax.inject.Inject;

class Thermosiphon implements Pump {
  private final Heater heater;

  @Inject  //Use @Inject to annotate the constructor that Dagger should use to create instances of a class.
  Thermosiphon(Heater heater) {
    this.heater = heater;
  }

  @Override public void pump() {
    if (heater.isHot()) {
      System.out.println("=> => pumping => =>");
    }
  }
}
