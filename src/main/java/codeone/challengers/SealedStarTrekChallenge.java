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
    default void giveOrder() {
      System.out.println("Retrieve!");
    }
  }

  static non-sealed class Saru implements Captain {} // #A

  record Spock(String planetName) implements Captain { // #B
    public void giveOrder() { System.out.println("Let's go to:" + planetName); }
  }

  public static void main(String... doYourBest) {
    Captain captain = new Spock("Vulcan");
    captain.giveOrder();
    Saru saru = new Saru();// WIP
    saru.giveOrder();
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
