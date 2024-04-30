public class Car extends Transport{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    protected void updateTyre() {
        System.out.println("Меняем покрышку машины");
            }

    @Override
    protected void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }
}