package codeone.challenges;
//Planet JDK 6 - The Confused Crew

import java.util.Deque;
import java.util.LinkedList;

public class DequeChallenge {

  public static void main(String... confusedCrew) {
    Deque<String> crew = new LinkedList<String>();
    crew.addFirst("Worf");
    crew.push("Odo");
    crew.addLast("Scott");

    System.out.println(crew.remove());
    System.out.println(crew.peek());
    System.out.println(crew.pop());
    System.out.println(crew.poll());
  }
  
}
