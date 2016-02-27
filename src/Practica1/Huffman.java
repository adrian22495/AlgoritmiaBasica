package Practica1;

import java.util.ArrayList;
import java.util.PriorityQueue;
public class Huffman {
	public static void main(String[] args){
		
	}
	public static BinaryTree construirArbol(String[] caracteres, int[] frecuencia){
		PriorityQueue<BinaryTree> Q  = new PriorityQueue();
		//Llenar monticulo
		for (int i=0; i<caracteres.length;i++){
			ParCF p = new ParCF(caracteres[i],frecuencia[i]);
			BinaryTree t = new BinaryTree(p);
			Q.add(t);
		}
		for (int i=0; i<caracteres.length - 1;i++){
			BinaryTree t = Q.remove();
			BinaryTree s = Q.remove();
			int frecConjunta=t.getValue().getFrecuencia()+s.getValue().getFrecuencia();
			ParCF nuevoNodo= new ParCF(frecConjunta);
			BinaryTree n = new BinaryTree(nuevoNodo,t,s);
			Q.add(n);
		}
		//Solo deberia de queda un dato en el monticulo que seria el arbol final
		BinaryTree z = Q.remove();
		return z;
	}
}
