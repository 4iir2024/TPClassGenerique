package tdClassGenerique_exo1;

import java.util.LinkedList;

public class CPile<A> implements IPile<A> {
	
	
	LinkedList<A> list = new LinkedList<>();

	@Override
	public boolean estVide() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	@Override
	public void empile(A a) {
		list.addLast(a);
		// TODO Auto-generated method stub
		
	}

	@Override
	public A depile() {
		// TODO Auto-generated method stub
		
		return  list.removeFirst();
	}

	@Override
	public int nbElements() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public A sommet() {
		// TODO Auto-generated method stub
		return list.getFirst();
	}
	
	
	
	public static void main(String[] args) {
		CPile<String> cp = new CPile<>();
		
		cp.empile("A");
		cp.empile("B");
		cp.empile("C");
		cp.empile("D");
		cp.empile("E");
		
		
		System.out.println(cp.nbElements());
		System.out.println(cp.depile());
		System.out.println(cp.nbElements());
	}

}
