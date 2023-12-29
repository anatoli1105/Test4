public class Car extends Transport  {
    public Car(String modelName,int wheelsCount){
        super(modelName,wheelsCount);

    }

    public void updateTyre() {
        super.updateTyre();
    }
    public void checkEngine() {
            super.checkEngine();
        }

        @Override
        public void checkTrailer() {}



}
