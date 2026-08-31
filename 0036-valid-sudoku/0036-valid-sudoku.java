class Solution {
    int boxNum(int row,int col){
        return  (row / 3) * 3 + (col / 3) + 1;
    }


    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,HashSet<Character>> idxWise = new HashMap<>();
         HashMap<Integer,HashSet<Character>> rowWise = new HashMap<>();
         HashMap<Integer,HashSet<Character>> boxWise = new HashMap<>();

        for(int i=0;i<board.length;i++){
            
            
            for(int j=0;j<board[0].length;j++){
                char val = board[i][j];
                int boxVal = boxNum(i,j);
                if(val=='.')continue;
                if(idxWise.containsKey(j)){
                    if(idxWise.get(j).contains(board[i][j]))return false;
                }
                 if(rowWise.containsKey(i)){
                    if(rowWise.get(i).contains(board[i][j]))return false;
                }
                 if(boxWise.containsKey(boxVal)){
                    if(boxWise.get(boxVal).contains(board[i][j]))return false;
                }
                
                HashSet<Character> idx = new HashSet<>();
                  idx.add(val);
                HashSet<Character> row = new HashSet<>();
                  row.add(val);
                    HashSet<Character> box = new HashSet<>();
                  box.add(val);
                if(idxWise.get(j)!=null){
                    idxWise.get(j).add(val);
                }
              
                else{
                idxWise.put(j,idx);
                }
                 if(rowWise.get(i)!=null){
                    rowWise.get(i).add(val);
                }
              
                else{
                rowWise.put(i,row);
                }
                 if(boxWise.get(boxVal)!=null){
                    boxWise.get(boxVal).add(val);
                }
              
                else{
            boxWise.put(boxVal,box);
                }
            }
        }
        return true;
    }
}