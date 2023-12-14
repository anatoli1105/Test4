public class Transport {
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
