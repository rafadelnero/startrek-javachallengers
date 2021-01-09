package codeone.challengers;

import java.util.ArrayList;
import java.util.Arrays;

//Planet JDK 10 – Var Turnabout intruder
public class TurnaboutIntruder {
    public static void main(String... awayTeam){
        System.out.println(new TurnaboutIntruder().whoIsKirk());
    }
    private boolean whoIsKirk() {
        Var var = new Var();
        var cptKirk = new Var(){ boolean isVar(){ return true; } };
        var drLester = (Var) null;
        drLester = cptKirk;

        var numbers = new ArrayList<Integer>(Arrays.asList(1,2,3));

        System.out.println(numbers);

        numbers.remove(1);
        System.out.println(numbers);
        return cptKirk.isVar();
    }
    private static class Var {}
}
