package codeone.challengers;

import java.util.Arrays;
import java.util.List;

public class StreamChallenge {

  public static void main(String... crewOrder) {
    List<String> crew = Arrays.asList("Kirk", "Spock", "Uhura");
    
    crew.stream()
      .peek(System.out::println)
      .limit(2)
      .forEach(System.out::println);
  }
  
}
