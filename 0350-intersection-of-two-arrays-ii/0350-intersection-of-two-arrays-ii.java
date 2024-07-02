class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
       Arrays.sort(nums2);
        if(Arrays.equals(nums1,nums2)){
            return nums1;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    res.add(nums1[i]);
                    nums2[j]=-1;
                    break;
                }
            }
        }
        int n = res.size();
        int[] output = new int[n];
        for(int i=0; i<n; i++){
            output[i] = res.get(i);
        }
        return output;
    }
}