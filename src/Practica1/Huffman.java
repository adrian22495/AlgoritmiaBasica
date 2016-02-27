package Practica1;

import java.util.ArrayList;
import java.util.PriorityQueue;
public class Huffman {
	public static void main(String[] args){
		
	}
	public static PriorityQueue construirArbol(int[] caracteres, int[] frecuencia){
		PriorityQueue<BinaryTree> Q  = new PriorityQueue();
		//Llenar monticulo
		for (int i=0; i<caracteres.length;i++){
			ParCF p = new ParCF(caracteres[i],frecuencia[i]);
			BinaryTree t = new BinaryTree(p);
			Q.add(t);
		}
		for (int i=0; i<caracteres.length - 1;i++){
			Tree t = Q.first();
			Tree s = Q.first();
			Tree n = new Tree(t,s);
			Q.add
		}
		//Llenar Q con 
		return Q;
	}
}
