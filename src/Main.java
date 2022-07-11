public class Main {
    public static void main(String[] args) {
        double[] name = {23.2, 45.8, 78.4, -34.5, 96.7, -34.8, 43.5, 15.2, 64.4, -54.2, -10.2, -31.5, -5.5, -3.40,};
        double result = 0;
        int cou = 0;
        boolean check = false;
        for (double count : name) {
            if (count < 0) {
                check = true;

            } else if (count > 0 && check) {
                result += count;
                cou++;
                System.out.println(count);

            }

        }
        System.out.println("Общее арифметическое число"+result/cou);

    }
}