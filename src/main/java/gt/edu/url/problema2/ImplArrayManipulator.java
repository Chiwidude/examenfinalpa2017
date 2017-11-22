package gt.edu.url.problema2;

public class ImplArrayManipulator<E> implements ArrayManipulator<E>{
int perm;
/*
 * (non-Javadoc)
 * @see gt.edu.url.problema2.ArrayManipulator#subsets(gt.edu.url.problema2.List)
 * Metodo que genera las permutaciones de un arreglo y devuelve su cantidad
 */
	@Override
	public int subsets(List<E> set) {
		Permutation(set, set.size());
		
		return perm;
	}
	
	/*
	 * Implementación Algoritmo heap para las permutaciones de un ArrayList
	 */
	public void Permutation(List<E> set, int n ) {
		if(n == 1) {
			
			System.out.println(set.toString());
			perm++;
			
		
		} else {
			
			for( int i = 0; i < n-1; i++) {
				Permutation(set, n-1);
				if(n%2 == 0) {
					swap(set,i,n-1);
				} else {
					swap(set,0,n-1);
				}
				perm++;
			}
			
		}
	}
	/*
	 * Intercambia los valores del Arraylist, parte del Algoritmo de Heap
	 */
	private void swap(List<E> v, int m, int n ) {
			E temp = v.set(m, v.get(n));
			v.set(n, temp);
	}
	

}
