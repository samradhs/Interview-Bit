// https://www.interviewbit.com/problems/merge-overlapping-intervals/

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        Collections.sort(intervals, new MyComparator());
        
        for (int i = 1; i < intervals.size(); i++) {
            
            if (intervals.get(i - 1).end >= intervals.get(i).start) {
                
                while (i < intervals.size() && intervals.get(i - 1).end >= intervals.get(i).start) {
                    
                    int s = Math.min(intervals.get(i - 1).start, intervals.get(i).start);
                    int e = Math.max(intervals.get(i - 1).end, intervals.get(i).end);
                    
                    intervals.set(i - 1, new Interval(s, e));
                    intervals.remove(i);
                }
            }
        }
        
        return intervals;
    }
}

class MyComparator implements Comparator<Interval> {
    
    @Override
    public int compare(Interval i1, Interval i2) {
        
        if (i1.start > i2.start) return 1;
        if (i1.start < i2.start) return -1;
        if (i1.end > i2.end) return 1;
        if (i1.end < i2.end) return -1;
        return 0;
    }
}
