package tdClassGenerique_exo1;

public interface IPile<A> {

	
	boolean estVide();
	void empile(A a);
	A depile(); 
	// retourne l'élément en sommet de pile et le dépile
	int nbElements();
	A sommet(); 
	// retourne le sommet de pile sans le dépiler 


}
