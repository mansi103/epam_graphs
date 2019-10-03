package com.graph;

import java.util.*;

/**
 * 
 * @author Mayank Dixit
 * Question :https://www.hackerrank.com/challenges/bfsshortreach/problem 
 */
public class BfsShortestReach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt(), m = sc.nextInt();
			ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n + 1);
			for (int i = 0; i < n + 1; i++)
				adj.add(new ArrayList<Integer>());

			for (int i = 0; i < m; i++) {
				int x = sc.nextInt(), y = sc.nextInt();
				adj.get(x).add(y);
				adj.get(y).add(x);
				System.out.println(adj);
			}
			int s = sc.nextInt();
			bfs(s, adj, n);
		}
		sc.close();
	}

class Graph 
{ 
	private int V; // No. of vertices 
	private LinkedList<Integer> adj[]; //Adjacency Lists 

	// Constructor 
	Graph(int v) 
	{ 
		V = v; 
		adj = new LinkedList[v]; 
		for (int i=0; i<v; ++i) 
			adj[i] = new LinkedList(); 
	} 

	void addEdge(int v,int w) 
	{ 
		adj[v].add(w); 
	} 

	void BFS(int s) 
	{ 
		boolean visited[] = new boolean[V]; 
		LinkedList<Integer> queue = new LinkedList<Integer>(); 
		visited[s]=true; 
		queue.add(s); 

		while (queue.size() != 0) 
		{ 
			s = queue.poll(); 
			System.out.print(s+" "); 
			Iterator<Integer> i = adj[s].listIterator(); 
			while (i.hasNext()) 
			{ 
				int n = i.next(); 
				if (!visited[n]) 
				{ 
					visited[n] = true; 
					queue.add(n); 
				} 
			} 
		} 
	} 
} 
