package toyota;

public class Demo {
    public static void main(String[] args) {


        Toyota camry = new Toyota(3.5, "black", "Camry50", 2021, false, 35000.0, "automate");
        camry.printCarInfo();
        camry.setPrice(25000.0);
        System.out.println(camry.getPrice());
        System.out.println(camry.getTransmission());
        camry.modelYearCar();
        System.out.println(camry.convertToSom(84.5));
        System.out.println("changes on my project");


    }
}