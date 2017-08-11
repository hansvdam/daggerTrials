package coffee;

import javax.inject.Inject;

import dagger.Lazy;

class CoffeeMakerAlt {
    @Inject Lazy<Heater> heater;
    @Inject Pump pump;

    @Inject //Use @Inject to annotate the constructor that Dagger should use to create instances of a class.
    CoffeeMakerAlt() {
    }

    public void brew() {
        heater.get().on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.get().off();
    }
}


