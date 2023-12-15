public class Bicycle extends Transport  {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        for (int i = 0; i < wheelsCount; i++) {
            super.updateTyre();
        }

    }
}
