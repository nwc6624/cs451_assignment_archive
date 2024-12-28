/*Author: Noah Caulfield
 * Class: CS 451
 * Assignment: PA 03- Strongly Connected Components using Kosaraju's Algorithm
 * Date: 5/1/2024
 * Eastern New Mexico University  
 */

package src.main.app;

import java.util.*;
import src.graph.Graph;
import src.graph.Node;

/**
 * This class contains the main method to execute the program.
 * It generates a random graph, prints its details, and finds and prints
 * strongly connected components (SCCs) using Kosaraju's algorithm.
 * 
 * Changes from the original file:
 * - Updated comments to provide clear explanation of each section of code.
 * - Randomized graph generation parameters for varied output each run.
 */

 public class Runner {
    public static void main(String[] args) {
        Graph graphHandler = new Graph();

        // randomize the number of nodes and edge probability
        Random rand = new Random();
        int numberOfNodes = rand.nextInt(5) + 5; // between 5 and 10 nodes
        double edgeProbability = rand.nextDouble(); // between 0.0 and 1.0

        Map<Node, List<Node>> graph = graphHandler.generateRandomGraph(numberOfNodes, edgeProbability);

        // display graph info
        System.out.println("graph with " + numberOfNodes + " nodes and edge probability of " + edgeProbability + ":");
        graphHandler.printGraph(graph);

        // find and print sccs using kosaraju's algorithm
        List<List<Node>> sccList = graphHandler.kosarajuSCC(graph);
        System.out.println("\nsccs:");
        for (List<Node> scc : sccList) {
            for (Node node : scc) {
                System.out.print(node.getName() + " ");
            }
            System.out.println();
        }
    }
}
