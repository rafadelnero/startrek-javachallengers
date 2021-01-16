package codeone.challengers;

import java.util.List;

//Planet JDK 12 – StarShip Switch
public class USSExcaluburSwitchCase {

    public static void main(String... vulcanRescue) {
        Object survivorsWithSpock = getVulcanSurvivors(StarTrekCharacters.SPOCK);
        Object survivorsWithMichael = getVulcanSurvivors(StarTrekCharacters.MICHAEL_EDDINGTON);
        Object survivorsWithElim = getVulcanSurvivors(StarTrekCharacters.ELIM_GARAK);

        System.out.println("" + survivorsWithSpock + survivorsWithMichael + survivorsWithElim);
    }

    static Object getVulcanSurvivors(StarTrekCharacters character) {
        return switch (character) {
            case SPOCK, DATA -> {
                System.out.println("Every day is rescue day");
                yield (Integer.valueOf(129) == 129 ? 10 : 7);
            }
            case MICHAEL_EDDINGTON -> "6" == new String("6") ? 2 : 4;
            default -> new IllegalStateException("No survivors.");
        };
    }

    enum StarTrekCharacters { SPOCK, DATA, MICHAEL_EDDINGTON, ELIM_GARAK }
}





