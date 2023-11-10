package ru.akalavan.restoreTheArrayFromAdjacentPairs;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] pair: adjacentPairs) {
            graph.computeIfAbsent(pair[0], i -> new ArrayList<>()).add(pair[1]);
            graph.computeIfAbsent(pair[1], i -> new ArrayList<>()).add(pair[0]);
        }

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, List<Integer>> entry: graph.entrySet()) {
            if (entry.getValue().size() == 1) {
                result.add(entry.getKey());
                result.add(entry.getValue().get(0));
                break;
            }
        }

        while (result.size() < adjacentPairs.length + 1) {
            int second = result.get(result.size() - 1);
            int first = result.get(result.size() - 2);
            List<Integer> candidates = graph.get(second);
            int nextElement = candidates.get(0) != first ? candidates.get(0) : candidates.get(1);
            result.add(nextElement);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.restoreArray(new int[][]{{2,1},{3,4},{3,2}})));
    }
}
