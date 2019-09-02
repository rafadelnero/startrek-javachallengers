package codeone.challengers;

import java.util.Arrays;
import java.util.List;

public class LambdaChallenge {

  public static void main(String... theDoors) {
    int doorNumber = 0;
    List<String> doors = Arrays.asList("A", "B", "C");
    doors.forEach(e -> {
      // System.out.println(e + doorNumber++);
    });
  }

}
