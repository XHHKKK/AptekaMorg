import java.util.ArrayList;
import java.util.List;

class Apteka {
    private String название;
    private List<String> названияЛекарств;
    private List<Double> стоимостиЛекарств;

    // Конструктор
    public Apteka(String название) {
        this.название = название;
        this.названияЛекарств = new ArrayList<>();
        this.стоимостиЛекарств = new ArrayList<>();
    }

    // Метод для инициализации данных аптеки
    public void inizialize(String[] лекарства, double[] стоимости) {
        for (int i = 0; i < лекарства.length; i++) {
            названияЛекарств.add(лекарства[i]);
            стоимостиЛекарств.add(стоимости[i]);
        }
    }

    // Метод для получения полной информации об аптеке
    public String получитьИнформацию() {
        StringBuilder информация = new StringBuilder("Аптека: " + название + "\n");
        информация.append("Лекарства:\n");
        for (int i = 0; i < названияЛекарств.size(); i++) {
            информация.append(названияЛекарств.get(i))
                    .append(" - ")
                    .append(стоимостиЛекарств.get(i))
                    .append(" руб.\n");
        }
        return информация.toString();
    }

    // Метод для нахождения стоимости самого дорогого лекарства
    public double ценаСамогоДорогогоЛекарства() {
        double максЦена = 0;
        for (double цена : стоимостиЛекарств) {
            if (цена > максЦена) {
                максЦена = цена;
            }
        }
        return максЦена;
    }

    // Метод для нахождения стоимости всех лекарств
    public double общаяСтоимость() {
        double общаяЦена = 0;
        for (double цена : стоимостиЛекарств) {
            общаяЦена += цена;
        }
        return общаяЦена;
    }
}
