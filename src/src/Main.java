package src;

public class Main {
    public static void main(String[] args) {

//    [93, 30, 55]	[1, 30, 5]	[2, 1]
//    [95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]

        int[] progresses = new int[]{93, 30, 55};
        int[] speeds = new int[]{95, 90, 99, 99, 80, 99};
        Solution.solution_0528_1(progresses, speeds);
    }


}
