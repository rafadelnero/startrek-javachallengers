package devoxx.challenges;

public class SealedCaptainPatternChallenge {
  sealed interface Captain permits Saru, Spock/*, Janeway*/ {}
  static non-sealed class Saru implements Captain {}
  record Spock(String planetName) implements Captain {}
//  static class Janeway implements Captain {}

  public static void main(String... doYourBest) {
    command(new Saru());
    command(new Spock("Vulcan"));
//    command(new Janeway());
  }

  static void command(Captain captain) {
    switch (captain) {
      case Saru saru -> System.out.println(saru.getClass().isSealed());
      case Captain spock -> System.out.println(spock.getClass().isRecord());
//      case Janeway janeway -> System.out.println(janeway.getClass().getSimpleName());
    }
  }
}

// All sealed class subclasses must either be final, sealed or non-sealed
