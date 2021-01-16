package codeone.challengers;
//Planet JDK 7 - The Door Malfunction Episode 1
public class ShipDoorChallenge implements AutoCloseable {

  public void open() {
    throw new RuntimeException("Fail to open door.");
  }
  
  @Override
  public void close() {
    System.out.println("Ship door is closed.");
  }
  
  public static void main(String... doorMalfunction) {
    try (ShipDoorChallenge shipDoor = new ShipDoorChallenge()) {
      shipDoor.open();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("The end.");
    }
  }
}
