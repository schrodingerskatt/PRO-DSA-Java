public class Leetcode_Session_41b {

/*

class Solution {
    public int leastBricks(List<List<Integer>> wall) {

        for (List<Integer> row : wall) {
            for (int j = 1; j < row.size(); j++) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        Map<Integer, Integer> hmp = new HashMap<>();
        // Count occurrences of each position
        for (List<Integer> row : wall) {
            for (int j = 0; j < row.size() - 1; j++) {
                int position = row.get(j);
                hmp.put(position, hmp.getOrDefault(position, 0) + 1);
            }
        }

        int max_bricks = 0;
        for(int brick : hmp.values()){
            max_bricks = Math.max(max_bricks,brick);
        }

        return wall.size()-max_bricks;


        
    }
}

*/
    
}
