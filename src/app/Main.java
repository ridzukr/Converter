package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter for base converting");
        System.out.println("Version 1.0");
        double miles = 15;
        double kms = 26;
        double kmsRes = convertMilesToKms(miles);
        System.out.printf("%1$.4f kms in %2$.1f miles.\n", kmsRes, miles);
        double milesRes = convertKmsToMiles(kms);
        System.out.printf("%1$.4f miles in %2$.1f kms.\n", milesRes, kms );
    }

    private static double convertMilesToKms(double miles){
     return miles * 1.60934;
    }

    private static double convertKmsToMiles(double kms) {
      return kms / 1.60934;
    }
}
