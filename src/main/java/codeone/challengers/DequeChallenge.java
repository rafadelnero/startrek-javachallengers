package codeone.challengers;
//Planet JDK 6 - The Confused Crew
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeChallenge {

  public static void main(String... confusedCrew) {
    Deque<String> crew = new LinkedList<String>();
    crew.addFirst("Worf");
    crew.addFirst("Odo");
    crew.addLast("Scott");
    
    Queue<String> crewQueue = Collections.asLifoQueue(crew);
    System.out.println(crewQueue.poll());
    System.out.println(crewQueue.poll());
    System.out.println(crewQueue.poll());
  }
  
}
