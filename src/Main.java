public class Main {

    public static void main(String[] args) {
        stringsMagicBox();
        numbersMagicBox();
    }
    private static void stringsMagicBox() {
        System.out.println("Магическая коробка со строками: ");
        MagicBox<String> magicBox = new MagicBox<>(2);

        System.out.println("Попытка добавления " + magicBox.add("Бижутерия") + "\t\n");
        System.out.println("Попытка добавления " + magicBox.add("Спортивные товары") + "\t\n");
        System.out.println("Попытка добавления " + magicBox.add("Галантерея") + "\t\n");

        String pick = magicBox.pick();
        System.out.println("Что не достали ? " + pick + "\n");
    }
    private static void numbersMagicBox() {
        System.out.println("Магическая коробка с числами: ");
        MagicBox<Integer> magicBox = new MagicBox<>(3);

        System.out.println("Попытка добавления " + magicBox.add(1) + "\t\n");
        Integer pick = magicBox.pick();
        System.out.println(pick);
    }

}
