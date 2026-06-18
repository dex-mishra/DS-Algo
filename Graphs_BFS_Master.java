import java.util.*;
public class Graphs_BFS_Master
{
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d)
        {
            this.src = s;
            this.dest = d;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[])
    {
        for(int i =0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 1));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
}

public static void BFS(ArrayList<Edge> graph[],boolean vis[],int v,int start)
{
    Queue<Integer> q = new LinkedList<>();
    
    q.add(start);
    while(!q.isEmpty())
    {
        int current = q.remove();
        if(vis[current]==false)
        {
            System.out.print(current + " ,");
            vis[current]=true;
            for(int i=0;i<graph[current].size();i++)
            {
                Edge n =graph[current].get(i);
                q.add(n.dest);
            }
        }
    }


}
public static void main(String[] args) {
    Graphs_BFS_Master g = new Graphs_BFS_Master();
    int v = 7;
    ArrayList<Edge> graph[] = new ArrayList[v];
    CreateGraph(graph);
    boolean[] vis = new boolean[v];
    for(int i=0;i<v;i++)
    {
    if(vis[i]==false)
    {
        BFS(graph,vis,v,i);
    }
    }
    
}
   
}
