class ServiceStation  implements Servis{
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    };
    public void checkEngine(){System.out.println("Проверяем двигатель");};
    public void checkTrailer() {System.out.println("Проверяем прицеп");};




    public    void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.wheelsCount; i++) {
                updateTyre();
            }
            checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.wheelsCount; i++) {
                updateTyre();
            }
            checkEngine();
            checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                updateTyre();
            }
        }
    }
}
