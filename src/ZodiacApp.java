import javax.swing.*;

public class ZodiacApp {
    public static void main(String[] args) {

        // Создание графического интерфейса
        JFrame frame = new JFrame("Зодиак");
        frame.setSize(225, 140);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание выпадающего списка
        String[] zodiacSigns = {"Овен", "Телец", "Близнецы", "Рак", "Лев", "Дева", "Весы", "Скорпион", "Стрелец", "Козерог", "Водолей", "Рыбы"};
        JComboBox<String> zodiacComboBox = new JComboBox<>(zodiacSigns);
        zodiacComboBox.setBounds(30, 10, 150, 30);

        // Создание кнопки
        JButton showDescriptionButton = new JButton("Показать описание");
        showDescriptionButton.setBounds(30, 50, 150, 30);

        // Обработчик события для кнопки
        showDescriptionButton.addActionListener(e -> {

            // Получение выбранного знака зодиака
            String selectedSign = (String) zodiacComboBox.getSelectedItem();

            // Отображение описания знака зодиака
            displayZodiacDescription(selectedSign);
        });

        // Добавление компонентов на форму
        frame.add(zodiacComboBox);
        frame.add(showDescriptionButton);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    // Метод для отображения описания знака зодиака
    private static void displayZodiacDescription(String zodiacSign) {
        String description = getZodiacDescription(zodiacSign);
        JOptionPane.showMessageDialog(null, description, "Описание знака " + zodiacSign, JOptionPane.INFORMATION_MESSAGE);
    }

    // Метод для получения описания знака зодиака
    private static String getZodiacDescription(String zodiacSign) {
        return switch (zodiacSign) {
            case "Овен" -> "Энергичный и страстный, Овен стремится к новым испытаниям и приключениям.";
            case "Телец" -> "Телец обладает терпением и стойкостью, ценит комфорт и материальную стабильность.";
            case "Близнецы" -> "Общительные и умные, Близнецы обожают общество и разнообразие.";
            case "Рак" -> "Семейный и чувствительный, Рак глубоко связан с домом и близкими.";
            case "Лев" -> "Лев любит внимание и восхищение, является лидером и творческой личностью.";
            case "Дева" -> "Аналитичная и педантичная, Дева стремится к совершенству и порядку.";
            case "Весы" -> "Весы ценят гармонию и справедливость, стремятся к равновесию в отношениях.";
            case "Скорпион" -> "Страстный и решительный, Скорпион обладает глубокими эмоциями и интенсивностью.";
            case "Стрелец" -> "Оптимистичный и приключенческий, Стрелец исследует мир и ищет смысл жизни.";
            case "Козерог" -> "Козерог ценит трудолюбие и ответственность, стремится к карьерному успеху.";
            case "Водолей" -> "Эксцентричный и свободолюбивый, Водолей стремится к инновациям и социальным идеалам.";
            case "Рыбы" -> "Сочувственные и креативные, Рыбы часто погружены в мир фантазии и эмоций.";
            default -> "Описание не найдено.";
        };
    }
}