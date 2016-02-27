package Practica1;

public class BinaryTree {
	private ParCF value;
	private BinaryTree left;
	private BinaryTree right;
	public BinaryTree(ParCF v, BinaryTree l, BinaryTree r){
		value = v;
		left = l;
		right = r;
	}
	public BinaryTree(ParCF v){
		value = v;
		left = null;
		right = null;
	}
	public ParCF getValue(){
		return value;
	}
	public BinaryTree getLeft(){
		return left;
	}

	public BinaryTree getRight() {
		return right;
	}
}
