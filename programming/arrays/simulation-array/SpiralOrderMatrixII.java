// https://www.interviewbit.com/problems/spiral-order-matrix-ii/

public class Solution {
    
	public ArrayList<ArrayList<Integer>> generateMatrix(int a) {
	    
	    ArrayList<ArrayList<Integer>> mat = new ArrayList<>(a);
        for(int i=0;i<a;i++){
            mat.add(createDummyList(a));
        }
        
        int c=0, iter=0;

        while(c<(a*a)){
            c = fillSpiralIteration(mat, iter++ ,c);
        }
        
        return mat;
	}
	
	private ArrayList<Integer> createDummyList(int size){
	    
        ArrayList<Integer> dummy = new ArrayList<>(size);
        for(int i=0;i<size;i++){
            dummy.add(0);
        }
        
        return dummy;
    }

    private int fillSpiralIteration(final List<ArrayList<Integer>> a, int iter, int c){
        
        int i = iter, j=iter;
        boolean row=false, col = false;
        
        while(i< a.size() && j<a.get(0).size()-iter){
            a.get(i).set(j, ++c);
            j++;
        }
        
        j--;
        
        while(++i<a.size()-iter && j<a.get(0).size()){
            a.get(i).set(j,++c);
            row = true;
        }
        
        i--;
        
        while(row && --j>=iter){
            a.get(i).set(j, ++c);
            col = true;
        }
        
        j++;
        
        while(col && --i>iter){
            a.get(i).set(j,++c);
        }
        
        return c;
    }
}