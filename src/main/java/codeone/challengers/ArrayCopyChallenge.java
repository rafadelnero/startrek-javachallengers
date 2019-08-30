package codeone.challengers;

import java.util.Arrays;

public class ArrayCopyChallenge {

  public static void main(String... letsClonePeople) {
    String[] crew = new String[] {"Spock", "Scott", "Quark"};
    String[] crewClones = Arrays.copyOf(crew, 2);
    
    System.out.println(crewClones[0]);
    System.out.println(crewClones[1]);
    System.out.println(crewClones[2]);
  }
  
}
