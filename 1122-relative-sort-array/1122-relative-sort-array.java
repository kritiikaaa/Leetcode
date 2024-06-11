class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(arr2[i]==arr1[j]){
                    result.add(arr1[j]);
                    arr1[j]=-1;
                }
            }
        }
        int n= result.size();
        int[] arr3 = new int[arr1.length];
        for(int i=0; i<n; i++){
            arr3[i] = result.get(i);
        }
        Arrays.sort(arr1);
        for(int i=n; i<arr3.length;i++){
            if(arr1[i]!=-1){
                arr3[i] = arr1[i];
            }
        }
        return arr3;
    }
}