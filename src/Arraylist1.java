import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> stringArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringArray.add(new ArrayList<>());
        }

        stringArray.get(0).add(2);
        stringArray.get(1).add(3);
        stringArray.get(2).add(4);
        stringArray.get(3).add(4);
        stringArray.get(4).add(4);
        stringArray.get(5).add(10);

        int sum = 0;
        for (int i = 0; i < stringArray.size(); i++) {
            for (int j = 0; j < stringArray.get(i).size(); j++) {
                sum += stringArray.get(i).get(j);
            }
        }
        System.out.println("Sum: " + sum);

        int biggest = Integer.MIN_VALUE;
        for (int i = 0; i < stringArray.size(); i++) {
            for (int j = 0; j < stringArray.get(i).size(); j++) {
                if (biggest < stringArray.get(i).get(j)) {
                    biggest = stringArray.get(i).get(j);
                }
            }
        }
        System.out.println("Biggest: " + biggest);

        int sum1 = 0;
        int totalCount = 0;
        for (int i = 0; i < stringArray.size(); i++) {
            for (int j = 0; j < stringArray.get(i).size(); j++) {
                sum1 += stringArray.get(i).get(j);
                totalCount++;
            }
        }
        double average = (double) sum1 / totalCount;
        System.out.println("Average: " + average);
    }
}
