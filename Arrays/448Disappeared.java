class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] exists = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            exists[nums[i] - 1] = true;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!exists[i])
                list.add(i+1);
        }
        return list;
    }
}