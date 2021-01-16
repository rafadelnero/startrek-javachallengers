package codeone.challengers;

/**
 * Rules
 * Permitted subclass must explicitly extend the sealed class.
 * Permitted subclass must define a modifier: sealed, non-sealed or final.
 * Permitted subclass must belong to the same module to the sealed class.
 * Can't create anonymous inner class from a sealed interface or class.
 *
 * This a compilation error challenge, that's why parts of the code is commented.
 */
public class SealedStarTrekChallenge {

   sealed interface Captain permits Spock, Saru/*, Janeway*/ { // #A
    default void giveOrder() {
      System.out.println("Attack!");
    }
  }
  static non-sealed class Saru implements Captain {}
  static class Janeway {}

  record Spock(String planetName) implements Captain { // #B
    public void giveOrder() { System.out.println("Let's go to:" + planetName); }
  }

  public static void main(String... doYourBest) {
    Captain captain = new Spock("Vulcan");
    captain.giveOrder();
    System.out.println(captain.getClass().getSuperclass().isSealed());
    new Saru().giveOrder();
//    new Captain() { }.giveOrder(); // #C
  }
}

/*
    A - Line #A and #B  won't compile

    B - Line #A and #C won't compile

    C - Let's go to:Vulcan
        true
        Attack!
        Attack!

    D - Line #A, #B and #C won't compile
 */
