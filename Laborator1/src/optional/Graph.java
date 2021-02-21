package optional;

public class Graph {

    public static void generateMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = (int) (Math.random() * 2);
    }

    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public static void displayUnicodeMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("━━");
            if (i == n - 1) {
                System.out.println();

                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        System.out.print("│" + matrix[i][k]);
                        if (k == n - 1) {
                            System.out.print("│");
                        }
                    }
                    System.out.println();
                    for (int t = 0; t < n; t++) {
                        System.out.print("━━");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void dfs(int i, int[][] graph, boolean[] visited,int[]visitedNode,int n) {
        if (!visited[i]) {
            visited[i] = true; // Mark node as "visited"
            visitedNode[n]=i;
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] == 1 && !visited[j]) {
                    n++;
                    dfs(j, graph, visited,visitedNode,n); // Visit node
                }
            }
        }
    }

    public static void dfsprint(int i, int[][] graph, boolean[] visited) {
        if (!visited[i]) {
            visited[i] = true; // Mark node as "visited"
            System.out.print(i + 1 + " ");
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] == 1 && !visited[j]) {
                    dfsprint(j, graph, visited); // Visit node
                }
            }
        }
    }

    public static void isConnected(int[][] matrix, int n,int[] visitedNode) {
        boolean[] visited = new boolean[10];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, matrix, visited,visitedNode,0);
                ++count;
            }
        }
        if (count == 1)
            System.out.println("The graph is connected!");
        else {
            System.out.println("The graph is not connected.");
            visited = new boolean[10];
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    System.out.println("Component: ");
                    dfsprint(i, matrix, visited);
                    System.out.println();
                }
            }
        }
    }

    public static void makeAdjacencyMatrix(int[]visited,int n){
        int [][] adjacencyMatrix=new int[n][n];
        for(int i=1;i<n;i++)
        {
            if(visited[i]!=0){
            adjacencyMatrix[visited[i-1]][visited[i]]=1;
            adjacencyMatrix[visited[i-1]][visited[i]]=1;
            }
        }
        System.out.println("Adjacency Matrix:");
        printMatrix(adjacencyMatrix, n);

    }
    public static void main(String[] args) {
        int n ;
        //argument from command line
        n = Integer.parseInt(args[0]);
        //declaring the matrix
        int[][] matrix = new int[n][n];
        generateMatrix(matrix, n);
        printMatrix(matrix, n);
        displayUnicodeMatrix(matrix, n);
        int [] visitedNode = new int [n];
        isConnected(matrix,n,visitedNode);
        makeAdjacencyMatrix(visitedNode, visitedNode.length);

    }
}
