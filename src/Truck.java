public class Truck extends Transport  {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        super.updateTyre();

    }
    public void checkEngine() {
       super.checkEngine();
    }
    public void checkTrailer() {
        super.checkTrailer();
    }
}
