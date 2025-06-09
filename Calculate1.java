public class Calculate {
    
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

    // Method to find the maximum score
    public static int findMax(int[] scores) {
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    // Method to find the minimum score
    public static int findMin(int[] scores) {
        int min = scores[0];
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88};
        int sum = calculateSum(scores);
        double average = calculateAverage(scores);
        int max = findMax(scores);
        int min = findMin(scores);

        System.out.println("Sum of scores: " + sum);
        System.out.println("Average score: " + average);
        System.out.println("Maximum score: " + max);
        System.out.println("Minimum score: " + min);
    }
}
