import java.util.*;

class Result {
    public static List<Integer> maxSubarray(List<Integer> arr) {

        int maxSubarray = arr.get(0);
        int current = 0;

        int maxSubsequence = 0;
        int maxElement = arr.get(0);

        for(int n : arr){
            current = Math.max(n, current + n);
            maxSubarray = Math.max(maxSubarray, current);

            if(n > 0)
                maxSubsequence += n;

            if(n > maxElement)
                maxElement = n;
        }

        if(maxSubsequence == 0)
            maxSubsequence = maxElement;

        return Arrays.asList(maxSubarray, maxSubsequence);
    }
}