public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    protected void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }

    @Override
    protected void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }


    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }
}