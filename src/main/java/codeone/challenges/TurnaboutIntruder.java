package codeone.challenges;

import java.util.ArrayList;
import java.util.Arrays;

//Planet JDK 10 – Var Turnabout intruder
/*
 Rules of var
  - No instance variables
  - No method parameters
  - No lambdas assigning
  - Only local variables
  - No null assigning
 */
public class TurnaboutIntruder {
    public static void main(String... awayTeam){
        var var = new Var() { public String collide(String c1, String c2) { return  c1 + c2; }};
        var drLester = (Var) null; // Line 4
        drLester = var;

        Var reliantsMistake = (var s1, final var s2) -> String.join(";", s1, s2, "Darth Vader");

        var numbers = new ArrayList<>(Arrays.asList(3, 2, 1));
        numbers.remove(Integer.valueOf(1));

        System.out.println(var.collide("Kirk", "Spock"));
        System.out.println(reliantsMistake.collide("Khan", "Borg"));
        System.out.println(drLester.getClass().getName());
        System.out.println(numbers);
    }

    private interface Var { String collide(String c1, String c2); }
}



/*
  Alternatives:
  a - Compilation error at line 4

  b - KirkSpock
      Khan;Borg;Darth Vader
      codeone.challengers.TurnaboutIntruder$1
      [3, 2]

  c - KirkSpock
      ;KhanBorgDarth Vader
      codeone.challengers.Var
      [2, 1]

   d - SpockKirk
       Khan;Borg;Darth Vader
       codeone.challengers.Var
       [3, 1]
 */
