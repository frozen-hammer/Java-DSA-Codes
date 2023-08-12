// Maze Path Problem (Diagonal Option)
// e.g void mazePathProblem(int row , int col, int endRow, int endCol, String result)

// Step - 1 Move to the Right
// Step-2 Move to the Down
// Step-3 Move to the Diagonal

public class MazePathProblemDiagonalAlso {
    public static void main(String[] args) {
        mazeProblem(0,0,2,2,"");
    }

    static void mazeProblem(int currentRow, int currentCol, int endRow, int endCol, String result){
        // Termination Case (Positive Case and Negative Case)
        // Positive Case
        if(currentRow == endRow && currentCol == endCol){
            System.out.println(result);
            return;
        }
        // Negative Case
        if(currentRow>endRow || currentCol>endCol){
            return;
        }

        // Move to Right
        mazeProblem(currentRow, currentCol+1, endRow, endCol, result+"R");
        // Move to Left
        mazeProblem(currentRow+1, currentCol, endRow, endCol, result+"D");
        // Move to Diagonal
        mazeProblem(currentRow+1, currentCol+1, endRow, endCol, result+"I");
    }
}
