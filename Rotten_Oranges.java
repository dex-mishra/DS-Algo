import java.util.ArrayList;

class Rotten_Oranges {

    // Define the Edge class mapping to a destination coordinate
    static class Edge {
        int desti;
        int destj;

        public Edge(int di, int dj) {
            this.desti = di;
            this.destj = dj;
        }
    }

    // Build the explicit graph using adjacency lists
    public void createGraph(ArrayList<Edge>[][] graph, int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // Up, Down, Left, Right

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                graph[i][j] = new ArrayList<>();
                // Only create edges if the cell actually has an orange (1 or 2)
                if (grid[i][j] != 0) {
                    for (int[] dir : dirs) {
                        int r = i + dir[0];
                        int c = j + dir[1];
                        // If the neighbor is within bounds and has an orange, add edge
                        if (r >= 0 && r < rows && c >= 0 && c < cols && grid[r][c] != 0) {
                            graph[i][j].add(new Edge(r, c));
                        }
                    }
                }
            }
        }
    }

    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        // 1. Initialize and build the graph
        ArrayList<Edge>[][] graph = new ArrayList[rows][cols];
        createGraph(graph, grid);
        
        // Instead of a Queue, we use an ArrayList to track the current minute's rotten oranges
        ArrayList<int[]> currentRotten = new ArrayList<>();
        int freshCount = 0;
        
        // Find all initial rotten oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    currentRotten.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        
        if (freshCount == 0) return 0;
        
        int minutes = 0;
        
        // 2. Traverse the graph level by level (without using a Queue)
        while (!currentRotten.isEmpty() && freshCount > 0) {
            // Track the oranges that will rot in the NEXT minute
            ArrayList<int[]> nextRotten = new ArrayList<>();
            
            for (int[] orange : currentRotten) {
                int r = orange[0];
                int c = orange[1];
                
                // Using the graph we built to find accessible neighbors
                for (Edge e : graph[r][c]) {
                    if (grid[e.desti][e.destj] == 1) {
                        grid[e.desti][e.destj] = 2; // Rot the fresh orange
                        freshCount--;
                        nextRotten.add(new int[]{e.desti, e.destj});
                    }
                }
            }
            
            // Move to the next minute's frontier
            currentRotten = nextRotten;
            minutes++;
        }
        
        return freshCount == 0 ? minutes : -1;
    }
}
