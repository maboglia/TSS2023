package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SudokuCtrl {
	
	
	public Integer[][] matrice = {
			{1, 2, 3,  4, 5, 6,  7, 8, 9},
			{4, 5, 6,  7, 8, 9,  1, 2, 3},
			{7, 8, 9,  1, 2, 3,  4, 5, 6},
			
			{2, 3, 4,  5, 6, 7,  8, 9, 1},
			{5, 6, 7,  8, 9, 1,  2, 3, 4},
			{8, 9, 1,  2, 3, 4,  5, 6, 7},
			
			{3, 4, 5,  6, 7, 8,  9, 1, 2},
			{6, 7, 8,  9, 1, 2,  3, 4, 5},
			{9, 1, 2,  3, 4, 5,  6, 7, 8},
	}; 
	
	
//	Random r = new Random();
	
	
	public SudokuCtrl() {
		this.permutaRighe();
		this.trasponi();
		this.permutaRighe();
	}
	

	private void permutaRighe() {
//		List<Integer> perm = Arrays.asList(new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8});
//		Collections.shuffle(perm);
		// la permutazione scelta così rispetta righe e colonne ma non i blocchi

		// fix del problema:
		List<List<Integer>> perm = new ArrayList<>();
		perm.add(Arrays.asList(new Integer[] {0, 1, 2}));
		perm.add(Arrays.asList(new Integer[] {3, 4, 5}));
		perm.add(Arrays.asList(new Integer[] {6, 7, 8}));
		
		for (List<Integer> cluster: perm) {
			Collections.shuffle(cluster);
		}
		Collections.shuffle(perm);

		
		Integer[][] nuovaMatrice = new Integer[9][9];
		
		
		for (int i = 0; i < 9; i++) {
			nuovaMatrice[i] = matrice[perm.get(i/3).get(i%3)];
		}
		
		matrice = nuovaMatrice;
		
	}
	
	private void trasponi() {
		Integer[][] nuovaMatrice = new Integer[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j ++) {
				nuovaMatrice[i][j] = matrice[j][i];
			}
		}
		
		matrice = (Integer[][]) nuovaMatrice;

	}
	

	
	public void stampaMatrice() {
		for (Integer[] riga : matrice) {
			for (Integer cella : riga) {
				System.out.print(cella);
			}
			System.out.println();
		}
	}
	
	public Integer[] stampaSeguenza() {
		Integer[] cifre = new Integer[81];
		int i = 0;
		for (Integer[] riga : matrice) {
			
			for (Integer cella : riga) {
				cifre[i++] = cella;
			}
		}
		return cifre;
	}
		
		
	public static void main(String[] args) {
		SudokuCtrl sudoku = new SudokuCtrl();
		
		sudoku.stampaMatrice();
	}
	
	
	
}