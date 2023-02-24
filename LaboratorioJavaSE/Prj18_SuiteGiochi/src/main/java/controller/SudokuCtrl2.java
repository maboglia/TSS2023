package controller;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Stack;
 
class Queue {
    
    private int[] items = new int[81];
    private int length = 0;
    private Comparator<Integer> c;
    
    public Queue(Comparator<Integer> c) {
        this.c = c;
    }
    
    public int poll() {
        int indexMin = 0;
        for (int i = 1; i < length; i++) {
            float comparison = c.compare(items[i], items[indexMin]);
            if (comparison < 0) {
                indexMin = i;
            }
        }
        int ans = items[indexMin];
        items[indexMin] = items[--length];
        return ans;
 
    }
    
    public void add(int item) {
        items[length++] = item;
    }
    
    public int size() {
        return length;
    }
}
 
 
 
 
public class SudokuCtrl2 {
        
    // array che associa all'indice di ogni casella gli indici delle caselle sulla stessa riga/colonna/blocco
    static final int[][] scope;
    static {
        scope = new int[81][20];
        for (int i = 0; i < 81; i++) {
            HashSet<Integer> scopeSet = new HashSet<Integer>();
            // scope
            int row = i / 9;
            int col = i % 9;
            int iBlocco = (i / 27)*27 + (col / 3)*3;    // cella nell'angolo nord-ovest dello stesso blocco
            
            for (int j = 0; j < 9; j++) {
                scopeSet.add((Integer)(row*9 + j));                 // celle sulla stessa riga, j rappresenta la colonna
                scopeSet.add((Integer)(j*9 + col));                 // celle sulla stessa colonna, j rappresenta la riga
                scopeSet.add((Integer)(iBlocco + (j/3)*9 + j%3));   // celle nello stesso blocco, (j/3, j%3) rappresenta le coordinate rispetto alla cella iBlocco
            }
            scopeSet.remove(i);
            int j = 0;
            for (Integer cella : scopeSet) {    // riversa nell'array
                scope[i][j++] = cella;
            }
        }
    }
    
    // array che associa ad ogni casella i valori che ci si può scrivere senza ripetere su riga/colonna/blocco
    // valori possibili codificati in bitArray di 9 bit
    // 1 --> ci può stare solo l'1
    // 2 --> ci può stare solo il 2
    // 3 --> ci possono stare l'1 e il 2
    // 4 --> ci può stare solo il 3
    // ...
    // 256 --> ci può stare solo il 9
    // ...
    // 511 --> ci possono stare tutti i numeri
    int[] codAnnotazioni;
    // array che associa ad ogni codice di 9 bit un array con i valori corrispondenti ai bit accesi
    static final int[][] annotazioni;
    static {
        annotazioni = new int[512][];
        for (int cod = 0; cod < 512; cod++) {
            ArrayList<Integer> annotazioniList = new ArrayList<>();
            for (int val = 1; val < 512; val *= 2) {
                if ((cod & val) != 0) {
                    annotazioniList.add(val);
                }
            }
            annotazioni[cod] = new int[annotazioniList.size()]; //riversa nell'array
            for (int j = 0; j < annotazioniList.size(); j++) {
                annotazioni[cod][j] = annotazioniList.get(j);
            }
        }
    }
    
    // per non generare sempre lo stesso puzzle
    Random r = new Random();
    
    // matrice in cui viene salvata la soluzione, però anziché 1...9 contiene 2^0...2^8 (0 per i numeri ancora da determinare)
    int[] soluzione;
    
    public SudokuCtrl2() {
 
        // inizializza codAnnotazioni
        codAnnotazioni = new int[81];
        Arrays.fill(codAnnotazioni, 0b111_111_111); // 511
        
        // inizializza soluzione
        soluzione = new int[81];
        // riempi la griglia tentando a caso quando non ci sono strade obbligate in modo evidente (un solo valorePossibile)
        // se in un vicolo cieco (una cella con codAnnotazioni zero) torna indietro al primo guess
        
        // inizializza prima riga (poi si possono permutare i simboli)
        for (int cella = 0; cella < 9; cella++) {
            soluzione[cella] = 1 << cella;
            for (int cella2 : scope[cella]) {
                codAnnotazioni[cella2] -= 1 << cella;
            }
        }
        
        // celle ancora non determinate, da estrarre in base al numero di valori annotati.
//      PriorityQueue<Integer> coda = new PriorityQueue<>(81, (cod0, cod1) -> setBits[cod0].length - setBits[cod1].length);
//      priority queue non va bene perchè non gestisce le chiavi dinamicamente
        Queue queue = new Queue((cod0, cod1) -> annotazioni[cod0].length - annotazioni[cod1].length);
        List<Integer> listaCelle = new ArrayList<>();
        for (int cella = 9; cella < 81; cella++) {  // le celle 0...8 sono già risolte
            listaCelle.add(cella);
        }
        Collections.shuffle(listaCelle);
        for (int cella : listaCelle) {
            queue.add(cella);
        }
        
        // stack delle celle via via riempite e di codAnnotazioni per permettere il backtrack
        Stack<int[]> logCodAnnotazioni = new Stack<>();
        Stack<Integer> logCelle = new Stack<>();
        
        int numTentativi = 0;
        while (queue.size() > 0) {
            int nuovaCella = queue.poll();
            
            if (codAnnotazioni[nuovaCella] == 0) {
                queue.add(nuovaCella);
                codAnnotazioni = logCodAnnotazioni.pop();
                int cella = logCelle.pop();
                soluzione[cella] = 0;
                queue.add(cella);
            }
            else {
                logCelle.add(nuovaCella);
//              int[] annotazioniCella = annotazioni[codAnnotazioni[nuovaCella]];
//              int valore = annotazioniCella[r.nextInt(annotazioniCella.length)];
                int valore = annotazioni[codAnnotazioni[nuovaCella]][0];
                // per non ripetere la stessa strada in caso di backtrack
                codAnnotazioni[nuovaCella] -= valore;
                logCodAnnotazioni.add(codAnnotazioni.clone());
                soluzione[nuovaCella] = valore;
                for (Integer cella : scope[nuovaCella]) {
                    codAnnotazioni[cella] &= ~valore;                   
                }
            }
            numTentativi ++;
            if (numTentativi % (1 << 20) == 0) {
                System.out.println(numTentativi);
                stampaSoluzione();
            }
 
        }
        
        System.out.println("tentativi: " + numTentativi);
        // permuta i simboli
        List<Integer> perm = new ArrayList<>();
        for (int i = 1; i < 512; i*= 2) {
            perm.add(i);
        }       
        Collections.shuffle(perm);
        for (int i = 0; i < 81; i++) {
            soluzione[i] = perm.get(cifra(soluzione[i]) -1);
        }
        
    }
    
    
    public void stampaSoluzione() {
        System.out.println("-------------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int h = 0; h < 3; h++) {
                    System.out.print("| ");
                    for (int k = 0; k < 3; k++) {
                        int cifraCella = cifra(soluzione[27*i + 9*j + 3*h + k]);
                        System.out.print(cifraCella == 0 ? "  " : cifraCella + " ");
                    }   
                }
                System.out.println("|");
            }
            System.out.println("-------------------------");
        }
    }
    
    static final int[] tableCifre = new int[] { 1, 2, 3, 6, 4, 10, 7, 12, 16, 5, 9, 11, 15, 8, 14, 13};
    public static int cifra(int i) {
        return (i == 0) ? 0 : tableCifre[(0x9af * i >> 12) & 15];
    }
    
    public static void main(String[] args) {
        System.out.println("cerco soluzione");
        SudokuCtrl2 s = new SudokuCtrl2();
        s.stampaSoluzione();
        
        
 
    }
}