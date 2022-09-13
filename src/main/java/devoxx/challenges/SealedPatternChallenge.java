package devoxx.challenges;

public class SealedPatternChallenge {

  sealed interface Captain permits Janeway, Saru, Spock {}
  static non-sealed class Saru implements Captain {}
  record Spock(String planetName) implements Captain {}
  static final class Janeway implements Captain {}

  public static void main(String... doYourBest) {
    shoot(new Saru());
    shoot(new Spock("Vulcan"));
    shoot(new Janeway());
  }

  static void shoot(Captain captain) {
    switch (captain) {
      case Saru saru -> System.out.println(saru.getClass().getSimpleName());
      case Spock spock -> System.out.println(spock);
      case Janeway janeway -> System.out.println(janeway);
    }
  }

}

// All sealed class subclasses must either be final, sealed or non-sealed
