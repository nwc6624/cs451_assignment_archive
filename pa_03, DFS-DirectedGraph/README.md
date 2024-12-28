# Depth-first search in directed graphs
Date: 5/1/2024<div/>
Name: Noah Caulfield<div/>
Class: CS 451<div/>
Assignment: PA 03<div/>
Eastern new mewico University<div/>

<div/>
This is a sample Java program that demonstrates how to perform Depth-first search (DFS) in directed graphs. The program is constructed using multiple Java files, and the program compilation and execution are automated using an Ant script.

## Files

- **Graph.java**: This file contains several key functionalities:
    - **Generating a graph**: The method to generate a graph has been updated to allow for random graph generation, providing variability in the number of nodes and edge probabilities each time the program runs.
    - **Running the Depth-first Search (DFS) algorithm**: The DFS method has been enhanced to include the detection of strongly connected components using Kosaraju's algorithm.
    - **Identifying Strongly Connected Components**: New methods have been introduced to identify and list strongly connected components, enhancing the original DFS capabilities.

- **Node.java**: This file is a data structure utilized by `Graph.java` to construct the graph.

- **Runner.java**: This is the main class responsible for executing the program. It has been updated to initiate random graph generation with dynamic node counts and edge probabilities, and to display strongly connected components identified by Kosaraju's algorithm.

- **build.xml**: This is the Ant script used to automate the compilation and execution of the program.

## Requirements

- **Java JDK**: The program requires Java JDK to compile and run. Make sure you have it installed on your machine.
- **Apache Ant**: The program is automated using an Ant script, so you need to have Apache Ant installed.
    - To install Apache Ant, follow the instructions in the [official Apache Ant installation guide](https://ant.apache.org/manual/install.html).
    - For a tutorial on getting started with Apache Ant, check out the [Hello World with Apache Ant guide](https://ant.apache.org/manual/tutorial-HelloWorldWithAnt.html).

## Installation

1. Clone this repository to your local machine:

    ```bash
    git clone <repository-url>
    ```

2. Navigate to the project directory:

    ```bash
    cd <repository-name>
    ```

3. Ensure you have the required dependencies (Java JDK and Apache Ant) installed.

## Usage

To execute the program, simply run the following command in the terminal/console from the project directory:

```bash
ant compile 
```
This command compiles the source code and places the .class files in the designated build directory.

```bash
ant run 
```
This command executes the main class of the program after compiling the source code. It's useful for running the program directly without manually invoking Java commands.

```bash
ant clean  
```
This command removes all the compiled .class files from the build directory, cleaning up the project space.

Each of these commands is defined in the build.xml file and can be modified according to specific project requirements.


## Initial Assignment Prompt 

In this assignment, you will extend the Java program hosted at the following GitHub repository:

https://github.com/imhmede/DFS-DirectedGraphLinks to an external site.

You will utilize Kosaraju's algorithm to analyze a graph generated randomly by the program and report all strongly connected components detected in the graph.

You will utilize Kosaraju's algorithm to analyze a graph generated randomly by the program and report all strongly connected components detected in the graph.

Your task is to:

Extend the existing Java code to implement Kosaraju's algorithm for detecting strongly connected components (SCCs) in a directed graph.
Modify the program to randomly generate graphs with nodes, edges, and attributes.
Produce an output listing all nodes, edges to nodes, and nodes' attributes of the original graph.
Produce an output listing all paths of detected strongly connected components, each path on a single line.
## Requirements
Use Java for the implementation.
Your solution should use Kosaraju's algorithm to detect strongly connected components.
Ensure the program produces the required outputs as described in the task.