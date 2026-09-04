public class BMICalculator {

    static String getBmiStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    static void printWellnessReport(double[] heights, double[] weights) {

        System.out.println("------------------------------------------------");
        System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI\tStatus");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < heights.length; i++) {

            double bmi = weights[i] /
                    (heights[i] * heights[i]);

            String status = getBmiStatus(bmi);

            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s%n",
                    i + 1,
                    heights[i],
                    weights[i],
                    bmi,
                    status);
        }

        System.out.println("------------------------------------------------");
    }

    public static void main(String[] args) {

        double[] heights = {
            1.75, 1.60, 1.80, 1.65, 1.70,
            1.55, 1.82, 1.68, 1.73, 1.78
        };

        double[] weights = {
            70, 90, 80, 75, 65,
            50, 95, 60, 85, 72
        };

        printWellnessReport(heights, weights);
    }
}