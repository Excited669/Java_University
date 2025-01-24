package Laboratory_1;

import java.util.Scanner;

public class RubberBands {
    private double startAngle;
    private double endAngle;

    public RubberBands(int start, int end) {
        this.startAngle = Math.min(start, end) * 30;
        this.endAngle = Math.max(start, end) * 30;
    }

    // Метод для проверки пересечения двух резинок
    public boolean doIntersect(RubberBands other) {
        return !(this.endAngle <= other.startAngle || other.endAngle <= this.startAngle);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую резинку (два числа от 1 до 12): ");
        int start1 = scanner.nextInt();
        int end1 = scanner.nextInt();

        System.out.print("Введите вторую резинку (два числа от 1 до 12): ");
        int start2 = scanner.nextInt();
        int end2 = scanner.nextInt();

        RubberBands band1 = new RubberBands(start1, end1);
        RubberBands band2 = new RubberBands(start2, end2);

        if (band1.doIntersect(band2)) {
            System.out.println("Резинки пересекаются.");
        } else {
            System.out.println("Резинки не пересекаются.");
        }

        scanner.close();
    }
}