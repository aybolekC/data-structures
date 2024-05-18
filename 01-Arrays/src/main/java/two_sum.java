import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class two_sum {

    public static void main(String[] args) {

        int arr[]={2,7,9,11};
         int target=9;
        String result="";

        System.out.println(bruteForceSolution(arr,target,result));

        System.out.println("=================Optimal Solution 1===============================");
        System.out.println(Arrays.toString(optimalSolution1(arr,target)));


        System.out.println("=================Two pointer Solution sorted array===============================");
        System.out.println(Arrays.toString(twoPointerSolutionSortedArray(arr,target)));


    }

    public static String bruteForceSolution(int[] arr,int target,String result){

        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);

            for (int j = i+1; j < arr.length; j++) {
//                System.out.println();
//                System.out.print(arr[j]);

                if (arr[i]+arr[j]==target){

                    result=result+i+","+j;
                    System.out.println(result);

                    result="";

                }

            }
        }
        return result;
    }

    public static int[] optimalSolution1(int[] arr,int target){

        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int potentialMatch=target-arr[i];
            if (map.containsKey(potentialMatch))
                return new int[]{i, map.get(potentialMatch)};
            else
                map.put(arr[i],i);

        }
        return new int[]{};

    }

    public static int[] twoPointerSolutionSortedArray(int[] arr,int target){

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int i=0;
        int j= arr.length-1;

        while (i<j){

            int sum=arr[i]+arr[j];

            if(sum==target) return new int[]{i,j};
            else if(sum<target) i++;
            else j--;

        }
        return new int[]{};

    }
}
