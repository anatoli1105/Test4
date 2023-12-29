public class Transport implements Servis{
   public void updateTyre() {
       for (int i = 0; i < wheelsCount; i++) {
           System.out.println("Меняем покрышку");
       }

   }
    public void checkEngine(){System.out.println("Проверяем двигатель");};
    public void checkTrailer() {System.out.println("Проверяем прицеп");};
    private String modelName;
    public int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName=modelName;
        this.wheelsCount=wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

}
