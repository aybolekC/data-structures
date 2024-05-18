import java.util.ArrayList;
import java.util.List;

public class spiral_traverse {

    public static void main(String[] args) {

        int [][] matrix={{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};

        spiralTraverse(matrix).forEach(System.out::println);

    }

    public static List<Integer> spiralTraverse(int[][] arr){

        if (arr.length==0)return new ArrayList<Integer>();

        var result=new ArrayList<Integer>();

        int startRow=0;
        int endRow=arr.length-1;


        int startCol=0;
        int endCol=arr[0].length-1;

        while (startRow<=endRow&&startCol<=endCol){


            //uprow
            for (int col = startCol; col <=endCol ; col++) {
                result.add(arr[startRow][col]);
            }

            //right col
            for (int row = startRow; row <=endRow ; row++) {
                result.add(arr[row][endCol]);
            }
            //buttom row
            for (int col = endCol-1; col >=startCol ; col--) {
                if (startRow==endRow) break;

                result.add(arr[endRow][col]);
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }

        return result;
    }

}
