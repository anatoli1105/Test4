public class Car extends Transport {
    public Car(String modelName,int wheelsCount){
        super(modelName,wheelsCount);

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
}
