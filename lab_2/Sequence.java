package Sequence;

public class Sequence {
    public void create_matrix(int row, int col, Integer [][] arr)
    {
        for (int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = (int) Math.round((Math.random() * 10) - 5);
            }
        }
    }

    public void show_matrix(int row, int col, Integer [][]arr)
    {
        for (int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public void find_column(int row, int col, Integer [][] arr)
    {
        boolean mon = true;
        for (int i = 0; i < col; i++){
            for(int j = 0; j < row-1; j++) {
                if (arr[j][i] <= arr[j + 1][i]) {
                    mon = false;
                    break;
                }
            }
            if(mon){
                System.out.println("Column: " + (i+1));
            }
            else{
                mon = true;
            }
        }
    }

}
