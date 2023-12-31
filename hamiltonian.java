package hamiltonian;
import java.util.*;
public class hamiltonian {
	final int V = 5;
	 int path[];
	boolean isSafe(int v, int graph[][], int path[], int pos)
	 {
	 if (graph[path[pos - 1]][v] == 0)
	return false;
	 for (int i = 0; i < pos; i++)
	 if (path[i] == v)
	 return false;
	  return true;
	  }
	 boolean hamCycleUtil(int graph[][], int path[], int pos)
	 {
	 if (pos == V)
	{
	if (graph[path[pos - 1]][path[0]] == 1)
	return true;
	else
	return false;
	}
	 for (int v = 1; v < V; v++)
	 {
	 /* Check if this vertex can be added to Hamiltonian Cycle */
	 if (isSafe(v, graph, path, pos))
	{
	 path[pos] = v;
	 /* recur to construct rest of the path */
	if (hamCycleUtil(graph, path, pos + 1) == true)
		return true;
	 /* If adding vertex v doesn't lead to a solution,then remove it */
	 path[pos] = -1;
	 }
	 }
	 /* If no vertex can be added to Hamiltonian Cycle constructed so far, then return false */
	 return false;
	 }
	 int hamCycle(int graph[][])
	 {
	 path = new int[V];
	 for (int i = 0; i < V; i++)
	 path[i] = -1;
	 path[0] = 0;
	 if (hamCycleUtil(graph, path, 1) == false)
	 {
	 System.out.println("\nSolution does not exist");
	 return 0;
	 }
	 printSolution(path);
	 return 1;
	 }
	 /* A utility function to print solution */
	 void printSolution(int path[])
	 {
	 System.out.println("Solution Exists: Following" +" is one Hamiltonian Cycle");
	 for (int i = 0; i < V; i++)
	 System.out.print(" " + path[i] + " ");
	 // Let us print the first vertex again to show the
	 // complete cycle
	 System.out.println(" " + path[0] + " ");
	 }
	 // driver program to test above function
	 public static void main(String args[])
	 {
	 hamiltonian hamiltonian =new hamiltonian();
	 /* Let us create the following graph
	 (0)--(1)--(2)
	 | / \ |
	 | / \ |
	 | / \ |
	 (3)-------(4) */
	 int graph1[][] = {{0, 1, 0, 1, 0},
	 {1, 0, 1, 1, 1},
	 {0, 1, 0, 0, 1},
	 {1, 1, 0, 0, 1},
	 {0, 1, 1, 1, 0},
	 };
	 // Print the solution
	 hamiltonian.hamCycle(graph1);
	 /* Let us create the following graph
	  * (0)--(1)--(2)
 | / \ |
 | / \ |
 | / \ |
 (3) (4) */
 int graph2[][] = {{0, 1, 0, 1, 0},
 {1, 0, 1, 1, 1},
 {0, 1, 0, 0, 1},
 {1, 1, 0, 0, 0},
 {0, 1, 1, 0, 0},
 };
 // Print the solution
 hamiltonian.hamCycle(graph2);
 }
}

/* output:
  Solution Exists: Following is one Hamiltonian Cycle
 0  1  2  4  3  0 
 */
