package codeone.challengers;

/**
 * Rules
 * Permitted subclass must explicitly extend the sealed class.
 * Permitted subclass must define a modifier: sealed, non-sealed or final.
 * Permitted subclass must belong to the same module to the sealed class.
 */
public class SealedStarTrekChallenge {
  sealed interface Captain permits Spock, Saru {
    default void shoot() { System.out.println("A captain will shoot!"); }
  }
  static non-sealed class Saru implements Captain {}

  record Spock() implements Captain {
    public void shoot() { System.out.println("Spock shoots!"); }
  }

  public static void main(String... doYourBest) {
    shoot(new Spock());
    shoot(new Saru());
    shoot("Dooh!");
  }

  static void shoot(Object captain) {
    if (captain instanceof Spock spock) {
      spock.shoot();
    } else if (captain instanceof Saru saru) {
      saru.shoot();
    } else {
      throw new RuntimeException("Unknown instance of Captain");
    }
  }
}
