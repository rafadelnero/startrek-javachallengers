package codeone.challengers;

public class USSExcaluburSwitchCase {

    public static void main(String... vulcanRescue) {
        Object survivorsWithSpock = getVulcanSurvivors(StarTrekCharacters.SPOCK);
        Object survivorsWithMichael = getVulcanSurvivors(StarTrekCharacters.MICHAEL_EDDINGTON);
        Object survivorsWithElim = getVulcanSurvivors(StarTrekCharacters.ELIM_GARAK);

        System.out.println("" + survivorsWithSpock + survivorsWithMichael + survivorsWithElim);
    }

    static Object getVulcanSurvivors(StarTrekCharacters character) {
        return switch (character) {
            case SPOCK, DATA, JEANLUC, THYLEK, THE_DOCTOR -> {
                System.out.println("Every day is rescue day");
                break (Integer.valueOf(129) == 129 ? 10 : 7);
            }
            case MICHAEL_EDDINGTON, WILLIAM_RIKER -> "6" == new String("6") ? 2 : 4;
            default -> new IllegalStateException("Non existent day.");
        };
    }

    enum StarTrekCharacters {
        SPOCK, DATA, JEANLUC, THYLEK, THE_DOCTOR, MICHAEL_EDDINGTON, WILLIAM_RIKER, ELIM_GARAK
    }
}





