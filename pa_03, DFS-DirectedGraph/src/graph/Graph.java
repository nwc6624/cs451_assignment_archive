/*Author: Noah Caulfield
 * Class: CS 451
 * Assignment: PA 03- Strongly Connected Components using Kosaraju's Algorithm
 * Date: 5/1/2024
 * Eastern New Mexico University  
 */

 package src.graph;

 import java.util.*;
 
 /**
  * this file contains a java implementation of kosaraju's algorithm for detecting
  * strongly connected components (sccs) in a directed graph. it includes methods
  * for generating random graphs and printing graph details.
  * 
  * changes from the original file:
  * - implemented kosaraju's algorithm for scc detection.
  * - added method to generate random graphs.
  * - added method to print graph details.
  */
  
  public class Graph {
  
      // counter for numbering nodes during dfs traversal
      private static int nodeCounter = 1;
  
      /**
       * explores all nodes reachable from a given node in the graph.
       * used as part of the dfs traversal.
       * 
       * @param graph a map of nodes with their adjacent nodes
       * @param node the node to start exploration from
       */
      public void explore(Map<Node, List<Node>> graph, Node node) {
          node.visit = true;
          node.preNumber = nodeCounter++;
          for (Node neighbor : graph.get(node)) {
              if (!neighbor.visit) {
                  explore(graph, neighbor);
              }
          }
          node.postNumber = nodeCounter++;
      }
  
      /**
       * performs a dfs traversal on the graph.
       * 
       * @param graph a map of nodes with their adjacent nodes
       */
      public void dfs(Map<Node, List<Node>> graph) {
          Node root = null;
          for (Node node : graph.keySet()) {
              if (node.name.equals("A")) {
                  root = node;
                  break;
              }
          }
          if (root != null) {
              explore(graph, root);
          }
      }
  
      /**
       * identifies sccs in the graph using kosaraju's algorithm.
       * 
       * @param graph a map of nodes with their adjacent nodes
       * @return list of sccs, each represented as a list of nodes
       */
      public List<List<Node>> kosarajuSCC(Map<Node, List<Node>> graph) {
          dfs(graph);
          Map<Node, List<Node>> reversedGraph = reverseGraph(graph);
          List<Node> postOrderNodes = getPostOrderNodes(graph);
          Collections.reverse(postOrderNodes);
  
          List<List<Node>> theSCCList = new ArrayList<>();
          Set<Node> visited = new HashSet<>();
          for (Node node : postOrderNodes) {
              if (!visited.contains(node)) {
                  List<Node> scc = new ArrayList<>();
                  exploreSCC(reversedGraph, node, visited, scc);
                  theSCCList.add(scc);
              }
          }
  
          return theSCCList;
      }
  
      // helper to reverse the graph
      private Map<Node, List<Node>> reverseGraph(Map<Node, List<Node>> graph) {
          Map<Node, List<Node>> reversedGraph = new HashMap<>();
          for (Node node : graph.keySet()) {
              for (Node neighbor : graph.get(node)) {
                  reversedGraph.putIfAbsent(neighbor, new ArrayList<>());
                  reversedGraph.get(neighbor).add(node);
              }
          }
          return reversedGraph;
      }
  
      // helper to get nodes in post-order
      private List<Node> getPostOrderNodes(Map<Node, List<Node>> graph) {
          List<Node> postOrderNodes = new ArrayList<>();
          for (Node node : graph.keySet()) {
              postOrderNodes.add(node);
          }
          postOrderNodes.sort(Comparator.comparingInt(node -> node.getPostNumber()));
          return postOrderNodes;
      }
  
      // helper to explore sccs
      private void exploreSCC(Map<Node, List<Node>> graph, Node node, Set<Node> visited, List<Node> scc) {
          visited.add(node);
          scc.add(node);
          for (Node neighbor : graph.getOrDefault(node, new ArrayList<>())) {
              if (!visited.contains(neighbor)) {
                  exploreSCC(graph, neighbor, visited, scc);
              }
          }
      }
  
      /**
       * generates a random graph with a specified number of nodes and edge chance.
       * 
       * @param numNodes how many nodes the graph will have
       * @param edgeProbability the chance of creating an edge between two nodes
       * @return a map representing the randomly generated graph
       */
      public Map<Node, List<Node>> generateRandomGraph(int numNodes, double edgeProbability) {
          Random random = new Random();
          Map<Node, List<Node>> graph = new HashMap<>();
  
          // adding nodes
          for (int i = 0; i < numNodes; i++) {
              Node node = new Node("Node" + i, 0, 0, false);
              graph.put(node, new ArrayList<>());
          }
  
          // adding edges based on edgeProbability
          for (Node node : graph.keySet()) {
              for (Node neighbor : graph.keySet()) {
                  if (node != neighbor && random.nextDouble() < edgeProbability) {
                      graph.get(node).add(neighbor);
                  }
              }
          }
  
          return graph;
      }
  
      /**
       * prints graph details including nodes, their edges, and attributes.
       * 
       * @param graph a map of nodes with their adjacent nodes
       */
      public void printGraph(Map<Node, List<Node>> graph) {
          for (Node node : graph.keySet()) {
              System.out.print("Node(" + node.getName() + ", Neighbors: ");
              for (Node neighbor : graph.get(node)) {
                  System.out.print(neighbor.getName() + " ");
              }
              System.out.println(")");
          }
      }
  }
  