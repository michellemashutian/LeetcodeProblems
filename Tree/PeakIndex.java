/**
*Let's call an array A a mountain if the following properties hold:
*A.length >= 3
*There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
*Given an array that is definitely a mountain, 
*return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
*/
//actually you need to use binary search


class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int result=0;
        for(int i=1;i<A.length-1;i++)
        {
            if(A[i-1]<A[i]&&A[i]>A[i+1]) 
            {
                result = i;
                break;
                //i=i+2;
            }
        }
        return result;
    }
}

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int i = 0;
        while (A[i] < A[i+1]) i++;
        return i;
    }
}


class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int lo = 0, hi = A.length - 1;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (A[mi] < A[mi + 1])
                lo = mi + 1;
            else
                hi = mi;
        }
        return lo;
    }
}
