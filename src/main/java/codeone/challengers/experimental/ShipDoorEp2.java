package codeone.challengers.experimental;
//Planet JDK 7 - The Door Malfunction Episode 2
public class ShipDoorEp2 implements AutoCloseable {

  public void open() {
    throw new RuntimeException("Fail to open door.");
  }
  
  @Override
  public void close() throws Exception {
    throw new RuntimeException("Fail to auto-close door.");
  }  
  
  public static void main(String... doorMalfunction) {
    try (ShipDoorEp2 shipDoor = new ShipDoorEp2()) {
      shipDoor.open();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println(e.getSuppressed()[0].getMessage());
    } finally {
      System.out.println("The end.");
    }
  }
}
