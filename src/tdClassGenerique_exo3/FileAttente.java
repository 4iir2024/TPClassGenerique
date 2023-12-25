package tdClassGenerique_exo3;

import java.util.ArrayList;


public class FileAttente<T> {

	protected ArrayList<T> contenu;

	public FileAttente() {
		contenu = new ArrayList<T>();
	}

	public void entrer(T p) {
		contenu.add(p);
	}

	public T sort() {
		T p = null;
		if (!contenu.isEmpty()) {
			p = contenu.get(contenu.size() - 1);
			contenu.remove(contenu.size() - 1);
		}
		return p;
	}

	public boolean estVide() {
		return contenu.isEmpty();
	}

	public String toString() {
		return "" + contenu;
	}
public static void main(String[] arg) {
	FileAttente<Personne> file1 = new FileAttente<>();
	
	FileAttente<Double> file2 = new FileAttente<>();

	
	file1.entrer(new Personne("Nom",20));
	file1.entrer(new Personne("ahmed",27));
	file1.entrer(new Personne("yassine",23));
	
	

	
	
	
System.out.println(file1.toString());

System.out.println(file1.sort());

System.out.println(file1.toString());

file2.entrer(12.3);
file2.entrer(11.2);
file2.entrer(15.0);

System.out.println(file2.toString());

System.out.println(file2.sort());

System.out.println(file2.toString());



	
}
}
