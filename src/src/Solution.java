package src;

public class Solution {

//    [93, 30, 55]	[1, 30, 5]	[2, 1]
//    [95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
     public static int[] solution_0528_1 (int[] progresses, int[] speeds) {

        int[] answer = {};
        while (true) {
            int count = 0;

             for (int i = 0; i < progresses.length; i++) {
                 progresses[i] = progresses[i]+speeds[i];
                 if (100 == progresses[i] ||  100 < progresses[i] ) {
                     // i 번 삭제

                     count = count++;
                 }
             }
             if (count > 0) answer[answer.length] = count;
        }

    }


}
