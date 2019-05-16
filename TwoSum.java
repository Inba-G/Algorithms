class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if(hm.containsKey(target - nums[i])) {
                int num2 = hm.get(target - nums[i]);
                if(num2 != i) {
                    return new int[]{i, hm.get(target - nums[i])};
                }
            }
        }
        return null;
    }
}