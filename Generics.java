import java.util.Arrays;

public class ShipmentProcessor<T extends Number> {
    private T[] weights;

    public ShipmentProcessor(T[] weights) {
        this.weights = weights;
    }

    public void processShipments() {
        boolean foundHeavyWeight = false;
        for (T weight : weights) {
            if (weight.doubleValue() > 100) {
                System.out.println(weight);
                foundHeavyWeight = true;
            }
        }
        if (!foundHeavyWeight) {
            System.out.println("No heavy weight found");
        }
    }

    public static void main(String[] args) {
        // Sample input
        int n = 5;
        Double[] weights = {20.0, 100.0, 150.0, 200.0, 250.0};

        ShipmentProcessor<Double> processor = new ShipmentProcessor<>(weights);
        processor.processShipments();
    }
}
