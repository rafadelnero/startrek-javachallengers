package codeone.challengers;

/**
 * Rules
 * Permitted subclass must explicitly extend the sealed class.
 * Permitted subclass must define a modifier: sealed, non-sealed or final.
 * Permitted subclass must belong to the same module to the sealed class.
 * Can't create anonymous inner class from a sealed interface or class.
 */
public class SealedStarTrekChallenge {
  sealed interface Captain permits Spock, Saru {
    default void shoot() { System.out.println("A captain will shoot!"); }
  }
  static non-sealed class Saru implements Captain {} // #A

  record Spock(String gun) implements Captain { // #B
    public void shoot() { System.out.println("Spock shoots with:" + gun); }
  }

  public static void main(String... doYourBest) {
    shoot(new Spock("Type-1 Phaser"));
    shoot(new Saru());
    shoot((Spock) new Object());
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

/*
    A - Line #A won't compile

    B - Spock shoots with:Type-1 Phaser
        A captain will shoot!
        java.lang.ClassCastException will be thrown

    C - Line #B won't compile

    D - A captain will shoot!
        A captain will shoot!
        java.lang.RuntimeException will be thrown
 */
