package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Supper app!");
        System.out.println("Converter for base converting");
        double miles = 15;
        double kms = 26;
        double kmsRes = convertMilesToKms(miles);
        System.out.printf("%1$.4f kms in %2$.1f miles.\n", kmsRes, miles);
    }

    private static double convertMilesToKms(double miles){
     return miles * 1.60934;
    }
}
