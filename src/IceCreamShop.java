public class IceCreamShop {
    public static void main(String[] args) {IceCreamShop creamery = new IceCreamShop();}

    public String name;
    public Boolean isOpen;
    public int yearFounded;
    public int randomInt;
    public double randomNum;
    public IceCream halesOrder;
    public IceCream myOrder;
    public void randomDiscount(){
        randomInt = (int) (Math.random() *31);
        System.out.println("we spun the discount wheel and you get " + randomInt + " percent off your order!");
    }
    public void specialOfTheDay(String flavor){
        System.out.println("Today's special flavor is " + flavor+ ".");
    }
    public void countScoops(){
        for (int i = 1; i <6; i +=1){
            System.out.println(i);

        }
        System.out.println(" ");
        for (int i = 2; i<12; i+=3){
            System.out.println(i);
        }
        System.out.println(" ");
        for (int i= 8; i>-1; i-=1){
            System.out.print(i+",");
        }
        System.out.println(" ");
    }
    public void chefsChoice(){
        randomNum = Math.random();
        if (randomNum<0.25){
            System.out.println("The chef recommends a Banana Split.");
        }
        if (randomNum>0.25 && randomNum<0.5){
            System.out.println("The chef recommends a Turtle Sundae");
        }
        if (randomNum>0.5 && randomNum<0.75){
            System.out.println("The chef recommends a Hot Fudge Sundae");
        }
        if (randomNum>0.75 && randomNum<1){
            System.out.println("The chef recommends The Vermonster");
        }
    }

    public IceCreamShop(){
        halesOrder = new IceCream(2,"Cookies and Cream",false);
        myOrder=new IceCream(2,"Chocolate Chip Cookie Dough", true);
        System.out.println("Hello World! Good Luck on your Exams!");
        name = "Scoops & Loops: The Code Creamery";
        isOpen = true;
        yearFounded = 1798;
        System.out.println("Welcome to " + name+ "! It is "+isOpen+" that we are open. We were founded in "+yearFounded+".");
        yearFounded = 2009;
        System.out.println("Welcome to " + name+ "! It is "+isOpen+" that we are open. We were founded in "+yearFounded+".");
        randomDiscount();
        specialOfTheDay("Cookies and Cream");
        countScoops();
        chefsChoice();
        halesOrder.printInfo();
        System.out.println(" ");
        myOrder.printInfo();

    }
}