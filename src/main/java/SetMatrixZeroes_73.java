import java.util.ArrayList;

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        // First, identify all rows and columns that need to be zeroed
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        // Set the identified rows to zero
        for(int i = 0; i < row.size(); i++) {
            int index = row.get(i);
            for(int j = 0; j < n; j++) {
                matrix[index][j] = 0;
            }
        }

        // Set the identified columns to zero
        for(int i = 0; i < col.size(); i++) {
            int index = col.get(i);
            for(int j = 0; j < m; j++) {
                matrix[j][index] = 0;
            }
        }
    }
}
