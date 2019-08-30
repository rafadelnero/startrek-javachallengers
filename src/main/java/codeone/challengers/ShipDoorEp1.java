package codeone.challengers;

public class ShipDoorEp1 implements AutoCloseable {
  public void open() {
    throw new RuntimeException("Fail to open door.");
  }
  
  @Override
  public void close() throws Exception {
    System.out.println("Ship door is closed.");
  }
  
  public static void main(String... doorMalfunction) {
    try (ShipDoorEp1 shipDoor = new ShipDoorEp1()) {
      shipDoor.open();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("The end.");
    }
  }
}
