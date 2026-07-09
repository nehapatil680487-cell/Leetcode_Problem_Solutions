class Solution {

    class DSU {
        int[] parent;

        DSU(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]); // Path Compression
            }
            return parent[x];
        }

        void union(int x, int y) {
            int px = find(x);
            int py = find(y);

            if (px != py) {
                parent[py] = px;
            }
        }
    }

    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {

        DSU dsu = new DSU(n);

        // Connect adjacent nodes if their difference <= maxDiff
        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] <= maxDiff) {
                dsu.union(i, i - 1);
            }
        }

        boolean[] answer = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];

            answer[i] = (dsu.find(u) == dsu.find(v));
        }

        return answer;
    }
}