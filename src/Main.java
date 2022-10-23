public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int allCount = 1;
        int maxCount = 0;
        int minCount = 210000;
        float mediumCount = 0f;
        float allCount2 = 0f;
        float allDays = 30f;
        for (int i = 0; i <= arr.length - 1; i++ ){
            allCount = allCount + arr[i];
            if (arr[i] > maxCount){
                maxCount = arr[i];
            }
            if (arr[i] < minCount){
                minCount = arr[i];
            }
        }
        System.out.println("Сумма трат за месяц составила " + (allCount - 1) + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minCount + " рублей. Максимальная сумма трат за день составила "
                + maxCount + " рублей");
        allCount2 = allCount;
        mediumCount = allCount2 / allDays;
        System.out.println("Средняя сумма трат за месяц составила " + mediumCount + " рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i <= reverseFullName.length - 1; i++){
            System.out.print(reverseFullName[reverseFullName.length - 1 - i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;

    }
}