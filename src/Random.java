public class Random {
    public T pick() {
        Random random = new Random();
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не заполнена, осталось заполнить " + (items.length - filled) + " ячеек.");
            }
        }
        for (int i = 0; i < items.length; i++){
            if (items[i] != null){
                int randomInt = random.nextInt(items.length);
                System.out.println("Коробка заполнена. Случайный элемент из коробки: " + items[randomInt]);
                System.out.println();
                return items[randomInt];
            }
        }
        return null;
    }
}
}
