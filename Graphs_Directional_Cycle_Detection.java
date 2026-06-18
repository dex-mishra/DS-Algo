import java.util.ArrayList;

public class Graphs_Directional_Cycle_Detection
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
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 4));
        //graph[4].add(new Edge(4, 2));
        
    }
    public static boolean ifCycle(ArrayList<Edge> graph[],boolean[] vis,int start,boolean[] rec )
    {
            System.out.print(start + "--");
            vis[start]=true;
            rec[start]=true;
            for(int i =0;i<graph[start].size();i++)
            {
                Edge e = graph[start].get(i);
                    if(rec[e.dest]==true)
                    {
                        System.out.println(e.dest);
                        return true;}
                        
                    else if(!vis[e.dest])
                    {if(ifCycle(graph, vis, e.dest, rec))
                        return true;
                    }
                        
                
            }
            rec[start]=false;
            return false;
    }

    public static void main(String[] args) 
    {
    ArrayList<Edge> graph[] = new ArrayList[5];
    CreateGraph(graph);
    boolean[] vis = new boolean[5];
    boolean[] rec = new boolean[5];
    for(int i=0;i<5;i++)
    {
    if(vis[i]==false)
    {
        if(ifCycle(graph,vis,i,rec))
        {
            System.out.println("Loop Exists !");
            break;
        }
        else
        {
            System.out.println("Loop Don't Exists !");
        }    
    }}
    
}
}