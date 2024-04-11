public class IceCream {
   public int numberOfScoops;
   public String flavor;
   public Boolean hasSprinkles;
   public IceCream(int pnumberOfScoops, String pflavor, Boolean phasSprinkles){
       numberOfScoops =pnumberOfScoops;
       flavor = pflavor;
       hasSprinkles=phasSprinkles;
   }
   public void printInfo(){
       System.out.println("This ice cream has " + numberOfScoops + " scoops.");
       System.out.println("This is a " + flavor+ " ice cream.");
       System.out.println("That this ice cream has sprinkles is "+ hasSprinkles+ ".");
   }
}
