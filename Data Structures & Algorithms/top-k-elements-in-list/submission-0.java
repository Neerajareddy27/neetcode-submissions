class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer>cnt = new HashMap<>();

        for(int n :nums){
            cnt.put(n, cnt.getOrDefault(n,0)+1);
        }

        List<Integer> keys = new ArrayList<>(cnt.keySet());
        keys.sort((a,b)-> cnt.get(b)-cnt.get(a));

        int[] res = new int[k];
        for (int i =0;i<k;i++){
            res[i] = keys.get(i);
        }
        return res;
    }
}
