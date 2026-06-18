import java.util.*;
public class Graph_topological_sorting {
    
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
        
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
    }
    public static Stack<Integer> topsort(ArrayList<Edge> graph[],boolean[] vis,int current,Stack<Integer> st) 
    {
        vis[current]=true;
        for(int i=0 ; i<graph[current].size() ; i++)
        {
            Edge e = graph[current].get(i);
            if(!vis[e.dest])
            {
                topsort(graph,vis,e.dest,st);   
            }
        }
        st.push(current);
        return st;
    }

    public static void main(String[] args) 
    {
    ArrayList<Edge> graph[] = new ArrayList[6];
    CreateGraph(graph);
    boolean[] vis = new boolean[6];
    Stack<Integer> st = new Stack<>();
    for(int i=0;i<6;i++)
    {
    if(vis[i]==false)
    {
        st = topsort(graph,vis,i,st);    
    }
    
    }
    while(!st.isEmpty())
    {   
        System.out.print(st.pop()+",");
    }
}
}



