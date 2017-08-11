package coffee;

import dagger.Component;
import javax.inject.Singleton;

public class CoffeeApp {
  @Singleton
  @Component(modules = { DripCoffeeModule.class })
  public interface Coffee {
    CoffeeMaker maker();
    CoffeeMakerAlt makerAlt();
  }

  public static void main(String[] args) {
//    Coffee coffee = DaggerCoffeeApp_Coffee.builder().build();
    Coffee coffee = DaggerCoffeeApp_Coffee.create();
    coffee.maker().brew();
    coffee.makerAlt().brew();
  }
}
