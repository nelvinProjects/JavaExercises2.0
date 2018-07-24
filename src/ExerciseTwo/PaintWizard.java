package ExerciseTwo;

import java.util.TreeMap;

public class PaintWizard {
    private TreeMap<Double, String> store = new TreeMap<Double, String>();
    private TreeMap<Double, String> wasteStore = new TreeMap<Double, String>();
    private final double CheapeMaxPRICE = 19.99;
    private final double AverageJoesPRICE = 17.99;
    private final double DuluxurousPaintsPRICE = 25;

    public void workOut(int roomSize, int litre, int square, double price, String name) {
        double cheapoMaxCoverage = (square * litre) / roomSize;
        waste(roomSize,litre,square,name);
        if (cheapoMaxCoverage > 0) {
            store.put(price, name);
        } else {
            double cheapoTotal = ((((roomSize / square) / litre) % litre) * price);
            System.out.println(cheapoTotal);
            store.put(cheapoTotal, name);
        }
    }

    public void waste(int roomSize, int litre, int square, String name){
        double eachWaste = ((litre * square) - roomSize) / square;
        if (eachWaste > 0){
            wasteStore.put(eachWaste, name);
        } else{
            double neededPaint = litre - ((roomSize - (litre * square)) / square);
            wasteStore.put(neededPaint, name);
        }
    }

    public void bestPaint(int roomSizeM2) {
        workOut(roomSizeM2, 20, 10, CheapeMaxPRICE, "CheapoMax");
        workOut(roomSizeM2, 15, 11, AverageJoesPRICE, "AverageJoes");
        workOut(roomSizeM2, 10, 20, DuluxurousPaintsPRICE, "DuluxourousPaints");

        System.out.println("cheapest: ");
        store.forEach((k, v) -> System.out.println("Price  £" + k + " Paint: " + v));
        wasteStore.forEach((k, v) -> System.out.println("Waste " + k + " Paint: " + v));
    }
}
