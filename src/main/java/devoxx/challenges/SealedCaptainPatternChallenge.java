package devoxx.challenges;

public class SealedCaptainPatternChallenge {
  sealed interface Captain permits Saru, Spock/*, Janeway */ {} // #A
  static non-sealed class Saru implements Captain {}
  record Spock(String planetName) implements Captain {}
  //static class Janeway implements Captain {} // #B

  public static void main(String... doYourBest) {
    command(new Saru());
    command(new Spock("Vulcan"));
    //command(new Captain() {});   // #C
  }

  static void command(Captain captain) {
    switch (captain) {
      case Saru saru -> System.out.println(saru.getClass().isSealed());
      case Captain spock -> System.out.println(spock.getClass().isRecord());
//      case Janeway janeway ->   // #D
//        System.out.println(janeway.getClass().getSimpleName());
    }
  }
}

// A - #A, #B and #C won't compile
// B - #A and #B won't compile
// C - #A, #B, #C and #D won't compile
// D - #B and #D won't compile

// All sealed class subclasses must either be final, sealed or non-sealed
