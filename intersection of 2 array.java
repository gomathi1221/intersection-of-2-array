class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            m.put(nums1[i],m.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(m.containsKey(nums2[i])&&m.get(nums2[i])>0){
             l.add(nums2[i]);
             m.put(nums2[i],m.get(nums2[i])-1);
            }
        }
        int c=0;
        int[] a=new int[l.size()];
        for(int n:l){
          a[c++]=n;
        }
        return a;

    }
}