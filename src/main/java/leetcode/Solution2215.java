package leetcode;

import java.util.*;
// 2215

class Solution2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
            set1.remove(num);
        }
        for (int num : nums1) {
            set2.remove(num);
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(set1));
        ans.add(new ArrayList<>(set2));

        return ans;

    }
}