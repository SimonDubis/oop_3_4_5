package sample.entities;

public class HardwareEngineer extends ITWorker {

   private Programmer programmer = new Programmer();

   public HardwareEngineer(){
      setSphere(ITSphere.HARDWARE_ENGINEERING);
   }

   HardwareEngineer(String name, String surname, int age, Programmer programmer) {
      super(name, surname, age, ITSphere.HARDWARE_ENGINEERING);
      this.programmer = programmer;
   }

   public Programmer getProgrammer() {
      return programmer;
   }

   public void setProgrammer(Programmer programmer) {
      this.programmer = programmer;
   }

   @Override
   public Employee fromString(String s) {
      String[] args = s.split("_");
      return new HardwareEngineer(args[1], args[2], Integer.parseInt(args[3]), programmer);
   }

   @Override
   public String toString() {
      return "HardwareEngineer_" + super.toString() + "_" + programmer.toString();
   }

}
