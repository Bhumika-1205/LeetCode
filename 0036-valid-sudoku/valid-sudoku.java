class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> cols = new HashSet<>();
            HashSet<Character> box = new HashSet<>();

            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(rows.contains(board[i][j])) return false;
                    rows.add(board[i][j]);
                }
                if(board[j][i]!='.'){
                    if(cols.contains(board[j][i])) return false;
                    cols.add(board[j][i]);
                }

                int r=3*(i/3)+(j/3);
                int c=3*(i%3)+(j%3);
                if(board[r][c]!='.'){
                     if(box.contains(board[r][c])) return false;
                     box.add(board[r][c]);
                }
               
            }

        }
        return true;

    }
}
