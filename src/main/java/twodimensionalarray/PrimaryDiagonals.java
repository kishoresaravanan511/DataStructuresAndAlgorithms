package twodimensionalarray;

public class PrimaryDiagonals
{
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                    };

        //primary diagonal
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i==j)
                {
                    System.out.println(arr[i][j]);
                }
            }
        }

        //secondary diagonal
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=0;j<arr[0].length;j++)
//            {
//                if(i+j == arr.length-1)
//                {
//                    System.out.println(arr[i][j]);
//                }
//            }
//        }


    }
}
