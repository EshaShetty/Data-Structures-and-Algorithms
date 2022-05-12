/**
First Atempt: This code can be optimized further by using Math class function.
https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
*/


class InPlaceReplace {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int max = -999;
        
        if(len == 1){
            arr[0] = -1;
        }
        else {      
            for(int i=0;i<len;i++)
            {
                if(i==len-1){
                    arr[i] = -1;
                }
                else{
                    for(int j=i+1;j<=len-1;j++)
                    {
                        if(max < arr[j])
                        {
                            max = arr[j];
                        }
                    }
                    arr[i] = max;
                    max = -999;
                }
            }
            
        }//else ends
        return arr;
    }
}
