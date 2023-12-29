public class Tank extends Transport{
    public Tank(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("меняем гусеннецы");

    }

    public void checkEngine() {
        super.checkEngine();

    }
    @Override
    public void checkTrailer() {

    }
}
