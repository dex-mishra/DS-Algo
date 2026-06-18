import java.util.*;
public class Graphs_All_Path_counter
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

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
}

public static void Counter(ArrayList<Edge> graph[],boolean vis[],int current,int fin, String Path)
{
    if(current==fin)
    {
        Path = Path+current;
        System.out.println(Path);
        return;
    }
        for(int i=0;i<graph[current].size();i++)
            {
            
            Edge n =graph[current].get(i);
            vis[current]=true;
            if(vis[n.dest]==false)
            Counter(graph, vis, n.dest,fin,Path+current);
            vis[current]=false;
            }
    }
    


public static void main(String[] args) {
    int v = 7;
    ArrayList<Edge> graph[] = new ArrayList[v];
    CreateGraph(graph);
    boolean[] vis = new boolean[v];
    System.out.println("ALL possible paths");
    Counter(graph,vis,0,5,"");
}
   
}
