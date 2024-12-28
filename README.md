# CS 451: Design and Analysis of Algorithms

## Course Overview
This repository contains selected assignments from CS 451: Design and Analysis of Algorithms, a course taken at Eastern New Mexico University during Spring 2023. The course covered principles and concepts for designing and analyzing correct and efficient algorithms, including:
- Greedy algorithms
- Divide-and-conquer methods
- Dynamic programming
- Time and space complexity analysis, including amortized analysis

**Prerequisites:** CS 123, CS 220  
**Programming Language:** Java and R  

## Assignments

### PA01: Fibonacci Algorithm Analysis
- Compared the efficiency of two implementations of the Fibonacci sequence:
  - **Exponential approach:** Recursive implementation with \(O(2^n)\) complexity
  - **Linear approach:** Iterative implementation with \(O(n)\) complexity
- Measured and visualized runtime performance using R scripts.
- **Files:**  
  - `ExponentialFibonacci.java`: Recursive implementation of Fibonacci  
  - `LinearFibonacci.java`: Iterative implementation of Fibonacci  
  - `run.R`: R script for measuring runtime and plotting results  
  - `PA01_Noah Caulfield.pdf`: Report detailing methods, results, and analysis  

### PA03: Depth-First Search and Strongly Connected Components
- Implemented Kosaraju's algorithm to identify strongly connected components (SCCs) in directed graphs.
- Added functionality for random graph generation with variable parameters.
- Enhanced program automation using an Ant build script.
- **Files:**  
  - `Graph.java`: Core implementation of Kosaraju's algorithm and graph generation  
  - `Node.java`: Node data structure used in graph operations  
  - `Runner.java`: Main class to execute the program  
  - `build.xml`: Ant script for automating compilation and execution  
  - `README.md`: Detailed description of the assignment and usage instructions  

## Note
This repository contains only selected assignments for the course.

## Author
Noah Caulfield  
Eastern New Mexico University  
