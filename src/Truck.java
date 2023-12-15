public class Truck extends Transport  {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        for (int i = 0; i < wheelsCount; i++) {
            super.updateTyre();
        }

    }
    @Override
    public void checkEngine() {
        super.checkEngine();
    }

    @Override
    public void checkTrailer() {
        super.checkTrailer();
    }
}
