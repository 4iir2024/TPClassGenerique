package tdClassGenerique_exo2;

import java.util.Arrays;
import java.util.List;

public class Tableau <A extends Comparable<A>>{
 private A T[];

 public Tableau(A T[]) {
  this.T = T;
 }

 public void trierTableau() {
  A k =null;
  for (int i = 0; i < T.length - 1; i++) {
   for (int j = i + 1; j < T.length; j++)
    if (T[i].compareTo(T[j])>0) {
     k = T[j];
     T[j] = T[i];
     T[i] = k;
    }
  }
//  Arrays.sort(T);
 }

 public void affiche() {
  for (int i = 0; i < T.length; i++)
   System.out.print(T[i] + " ");
  
//  System.out.print(Arrays.toString(T));

 }

 public static void main(String[] args) {
  Integer T[] = { 10, 2, 6, 11, 7, 2, -1, 0, 9 };
  Tableau<Integer> table = new Tableau<>(T);
  table.affiche();
  System.out.println("");
  table.trierTableau();
  table.affiche();
 }

}
