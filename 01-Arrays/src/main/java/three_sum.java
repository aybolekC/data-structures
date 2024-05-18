import java.util.*;

public class three_sum {

    public static void main(String[] args) {


        int arr[]={12, 3, 1, 2, -6, 5, -8, 6};
        int target=0;


        System.out.println(twoPointerSolutionSortedArray(arr,target).toString());
//        System.out.println(brutforceSolution(arr,target).toString());
        System.out.println(hashMapSolution(arr,target).toString());



    }

    public static List<List<Integer>> brutforceSolution(int[] arr,int target){

        List<List<Integer>> result = new ArrayList<>();

        // Get the length of the array
        int n = arr.length;

        // Loop through each combination of three elements
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Check if the sum of the triplet is zero
                    if (arr[i] + arr[j] + arr[k] == target) {
                        // Add the triplet to the result list
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);

                        // Check for duplicates before adding the triplet
                        if (!result.contains(triplet)) {
                            result.add(triplet);
                        }
                    }
                }
            }
        }

        return result;


    }





    public static List<List<Integer>> twoPointerSolutionSortedArray(int[] arr,int target){

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        List<List<Integer>> triplets=new ArrayList<>();


        for (int i = 0; i <arr.length-2 ; i++) {

            int left=i+1;
            int right= arr.length-1;

            while (left<right) {

                int currentSum = arr[i] + arr[left] + arr[right];

                if (currentSum == target) {
                    triplets.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    left++;
                    right--;
                } else if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                }
            }

            }
            return triplets;


        }

    public static List<List<Integer>> hashMapSolution(int[] arr,int target){

        Set<List<Integer>> result=new HashSet<>();

        HashMap<Integer, Integer> map=new HashMap<>();

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i],i);
        }


        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                List<Integer> triplet=new ArrayList<>();
                int potentialMatch=target-arr[i]-arr[j];

                if (map.containsKey(potentialMatch)&&map.get(potentialMatch)>j){
                    triplet.add(arr[i]);
                    triplet.add(arr[j]);
                    triplet.add(potentialMatch);

                    result.add(triplet);
                }
            }
        }
        return new ArrayList(result);


    }

}
