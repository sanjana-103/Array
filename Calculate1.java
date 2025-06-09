public class Calculate1 {
    
    public static int calculateSum(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;
    }

    public static double calculateAverage(int[] scores) {
        int sum = calculateSum(scores);
        return (double) sum / scores.length;
    }

    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88};
        int sum = calculateSum(scores);
        double average = calculateAverage(scores);
        
        System.out.println("Sum of scores: " + sum);
        System.out.println("Average score: " + average);
    }
}
