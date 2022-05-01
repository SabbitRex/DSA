import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graph {
	
	private Map<Vertex, List<Vertex>> graph = new HashMap<Vertex, List<Vertex>>();
	
	
	public void addVertex(String nodeName) {
				
		this.graph.putIfAbsent(new Vertex(nodeName), new ArrayList<Vertex>());
	}
	
	public void removeVertex(String nodeName) {
		
		Vertex vertex = new Vertex(nodeName);
		
		for (Map.Entry<Vertex, List<Vertex>> itr : this.graph.entrySet()) {
			
			itr.getValue().remove(vertex);
		}
		
		this.graph.remove(vertex);
	}
	
	public void addEdge(String nodeName1, String nodeName2) {
		
		Vertex vertex1 = new Vertex(nodeName1);
		Vertex vertex2 = new Vertex(nodeName2);
		
		this.graph.get(vertex1).add(vertex2);
	}
	
	public void removeEdge(String nodeName1, String nodeName2) {
		
		Vertex vertex1 = new Vertex(nodeName1);
		Vertex vertex2 = new Vertex(nodeName2);
		
		if (this.graph.get(vertex1) != null) {
			
			this.graph.get(vertex1).remove(vertex2);
		}
	}
	
	public List<Vertex> getAdjVertices(String nodeName) {
	    return this.graph.get(new Vertex(nodeName));
	}
	
	public void bfs(String rootNode) {
		
		Set<String> visitedNodes = new LinkedHashSet<String>();
		
		Queue<Vertex> queue = new LinkedList<>();
		
		Vertex root = new Vertex(rootNode);
		
		queue.add(root);
		
		while (!queue.isEmpty()) {
			
			Vertex vertex = queue.poll();
			
			visitedNodes.add(vertex.nodeName);
			
			for (Vertex adjNode : getAdjVertices(vertex.nodeName)) {
				
				if (!visitedNodes.contains(adjNode.nodeName)) {
					
					queue.add(adjNode);
				}
			}
		}
		
		System.out.println("BFS : " + visitedNodes);
	}
	
	public void dfs(String rootNode) {
		
		Set<String> visitedNodes = new LinkedHashSet<String>();
		
		Stack<Vertex> stack = new Stack<>();
		
		Vertex root = new Vertex(rootNode);
		
		stack.push(root);
		
		while (!stack.isEmpty()) {
			
			Vertex ver = stack.pop();
			
			visitedNodes.add(ver.nodeName);
			
			for (Vertex node : getAdjVertices(ver.nodeName)) {
				
				if (!visitedNodes.contains(node.nodeName)) {
					
					stack.push(node);
				}
			}
		}
		
		System.out.println("DFS : " + visitedNodes);
	}
	
	public void seeGraph() {
		
		System.out.println("Graph :");
		for (Map.Entry<Vertex, List<Vertex>> itr : this.graph.entrySet()) {
			
			System.out.print("Vertex : " + itr.getKey().nodeName);
			
			System.out.print(" Edge : ");
			for (Vertex vertex : itr.getValue()) {
				System.out.print(vertex.nodeName + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Graph graph = new Graph();
		
		System.out.println("Add Vertex : ");
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.seeGraph();
		
		System.out.println("Remove Vertex : ");
		
		graph.removeVertex("C");
		graph.removeVertex("A");
		
		graph.seeGraph();
		
		graph.addVertex("A");
		graph.addVertex("C");
		
		graph.addEdge("B", "F");
		graph.addEdge("F", "B");
		graph.addEdge("F", "A"); 
		graph.addEdge("B", "E");
		graph.addEdge("C", "E");
		graph.addEdge("E", "B");
		graph.addEdge("A", "B");
		graph.addEdge("A", "D");
		graph.addEdge("A", "C");
		graph.addEdge("D", "F");
		graph.addEdge("D", "E");
		
		//graph.seeGraph();
		
		//graph.removeEdge("B", "F");
		
		graph.seeGraph();
		
		graph.bfs("A");
		graph.dfs("A");
	}
}

class Vertex {
	
	String nodeName;
	
	public Vertex(String nodeName) {
		
		this.nodeName = nodeName;
	}
	
	@Override
	public boolean equals(Object obj) {
	   
		if (obj == null) {
			
			return false;
		}
		
		if (obj.getClass() != this.getClass()) {
			
			return false;
		}
		
		Vertex vertex = (Vertex) obj;
		
		if (this.nodeName != vertex.nodeName) {
			
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		
		int hashKey = 3;
		
		hashKey = 53 * hashKey + (this.nodeName != null ? this.nodeName.hashCode() : 0);
		
		return hashKey;
	}
}
