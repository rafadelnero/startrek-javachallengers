package codeone.challengers;
//Planet JDK 8 - The unknown Order
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
