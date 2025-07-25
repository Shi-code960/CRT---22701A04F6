public class practice {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
       graph.addEdge(0,1);
       graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,0);
        graph.addEdge(1,2);
        graph.printGraph();
    }
}
class Graph{
    int[][] graph;
    int vertices;
    boolean isDirected;
    Graph(int vertices){
        this.vertices=vertices;
        graph=new int[vertices][vertices];
       
    }
    void addEdge(int src,int dest){
        if(isValid(src,dest)){
            graph[src][dest]=1;
            graph[dest][src]=1;
        }else{
            System.err.println("invalid source or destination");
        }
    }
    void removeEdge(int src,int dest){
        if(isValid(src,dest)){
            graph[src][dest]=0;
           graph[dest][src]=0;
            
        }else{
            System.err.println("invalid source and destination");
        }
    }
    boolean isValid(int src,int dest){
        return src>=0 & dest>=0 && src<vertices &&dest<vertices && src!=dest;
    }
    
    boolean isHavingEdge(int src,int dest){
        if(isValid(src,dest)){
           if(graph[src][dest]==1)
                
                    return true;
                else 
                return false;
        }     
            
        
        System.err.println("invalid source and dest");
        return false;
    }
    
    void printGraph(){
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
            System.out.print(graph[i][j]+" ");
            }
        System.out.println();
        }
    }
}