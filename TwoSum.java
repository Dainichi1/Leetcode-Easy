package it.leetcode.Esercizio1.TwoSum;


import java.util.HashMap;

/**
 * Class Solution represents a solution to the Two Sum problem.
 * It provides a method to find two numbers in an array that add up to a given target number.
 */
public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
                HashMap<Integer, Integer> numMap = new HashMap<>(); // Create a HashMap to store indices of numbers. associa ad ogni numero il suo indice

                for (int i = 0; i < nums.length; i++) {
                        int complement = target - nums[i];
                        if (numMap.containsKey(complement)) {
                                return new int[]{numMap.get(complement), i};
                        }
                        numMap.put(nums[i], i);
                }

                throw new IllegalArgumentException("No two sum solution found");
        }

        public static void main(String[] args) {
                TwoSum solution = new TwoSum();

                int[] result1 = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
                System.out.println(result1[0] + ", " + result1[1]); // Output: 0, 1

                int[] result2 = solution.twoSum(new int[]{3, 2, 4}, 6);
                System.out.println(result2[0] + ", " + result2[1]); // Output: 1, 2

                int[] result3 = solution.twoSum(new int[]{3, 3}, 6);
                System.out.println(result3[0] + ", " + result3[1]); // Output: 0, 1
        }
}

//  ESEMPIO DI HASHMAP
//  public class HashMapExample {
//   public static void main(String[] args) {
//         // Creazione di una HashMap
//       HashMap<String, Integer> map = new HashMap<>();
//
//         // Inserimento di valori
//          map.put("Alice", 25);
//          map.put("Bob", 30);
//          map.put("Charlie", 35);
//
//         // Accesso a un valore utilizzando la chiave
//          int age = map.get("Alice");
//          System.out.println("Alice's age: " + age);
//
//          // Sovrascrittura di un valore
//          map.put("Alice", 26);
//
//          // Controllo se una chiave esiste
//          if (map.containsKey("Bob")) {
//              System.out.println("Bob is in the map.");
//          }
//
//          // Rimozione di una voce
//          map.remove("Charlie");
//      }
//  }


/**
 * ### Obiettivo del Codice
 * Il codice risolve il problema "Two Sum". L'obiettivo è trovare due numeri nell'array che sommati diano un determinato valore target. Se tali numeri esistono, il codice restituisce gli indici di questi due numeri;
 * altrimenti lancia un'eccezione.
 *
 * ### Analisi del Codice
 *
 * 1. **Definizione della classe e del metodo `twoSum`**:
 *    - La classe `Solution` contiene un metodo chiamato `twoSum`, che accetta un array di interi `nums` e un intero `target` come argomenti.
 *    - L'obiettivo del metodo è restituire un array di due interi che rappresentano gli indici dei due numeri in `nums` che sommano al valore `target`.
 *
 * 2. **Creazione dell'HashMap `numMap`**:
 *    \[
 *    \text{HashMap<Integer, Integer> numMap = new HashMap<>();}
 *    \]
 *    - Qui viene creato un nuovo oggetto `HashMap` chiamato `numMap`.
 *    - Questa mappa è usata per memorizzare i numeri dell'array `nums` come chiavi e i loro corrispondenti indici come valori. Questo ci permette di controllare rapidamente se un certo numero
 *    è presente nell'array e di ottenere il suo indice.
 *
 * 3. **Ciclo `for` per l'analisi dell'array `nums`**:
 *    Il ciclo attraversa ogni numero dell'array `nums`.
 *
 *    - **Calcolo del complemento**:
 *      \[
 *      \text{int complement = target - nums[i];}
 *      \]
 *      - Qui viene calcolato il "complemento" del numero corrente. Il complemento è il valore che, se sommato al numero corrente, dà il valore `target`.
 *
 *    - **Controllo se il complemento esiste nella mappa**:
 *      \[
 *      \text{if (numMap.containsKey(complement))}
 *      \]
 *      - Questo controllo verifica se il complemento del numero corrente è già stato visto in una precedente iterazione (e quindi è una chiave nella mappa `numMap`).
 *
 *    - **Se il complemento esiste**:
 *      Restituisci un array contenente l'indice del complemento (ottenuto da `numMap`) e l'indice corrente `i`.
 *
 *    - **Se il complemento non esiste**:
 *      Aggiungi il numero corrente e il suo indice alla mappa `numMap`.
 *
 * 4. **Eccezione in caso di mancata soluzione**:
 *    Se il ciclo `for` termina senza trovare una soluzione, viene lanciata un'eccezione `IllegalArgumentException`.
 *
 * 5. **Metodo `main`**:
 *    Questo è il punto di ingresso del programma. Qui vengono testati tre esempi del metodo `twoSum` e i risultati vengono stampati.
 *
 * Spero che questa spiegazione ti abbia aiutato a comprendere meglio il codice. Se hai ulteriori domande o vuoi approfondire qualche aspetto in particolare, fammelo sapere!
 *
 *
 *
 * Certo! Andiamo avanti e analizziamo un esempio passo dopo passo.
 *
 * Utilizzeremo l'esempio fornito nel codice:
 * ```java
 * int[] result1 = solution.twoSum(new int[]{2,7,11,15}, 9);
 * ```
 * L'obiettivo è trovare due numeri nell'array \([2,7,11,15]\) che sommano a 9.
 *
 * ### Esecuzione passo dopo passo:
 *
 * 1. **Inizializzazione**
 *    - Array: \([2,7,11,15]\)
 *    - Target: \(9\)
 *    - Mappa `numMap`: vuota
 *    - Indice corrente: \(i = 0\)
 *
 * 2. **Prima iterazione (i = 0)**
 *    - Numero corrente: \(2\)
 *    - Calcolo del complemento: \(9 - 2 = 7\)
 *    - Controllo se il complemento (7) è presente nella mappa `numMap`: No
 *    - Aggiungo \(2\) alla mappa con l'indice \(0\). Ora la mappa è: \(\{2: 0\}\)
 *
 * 3. **Seconda iterazione (i = 1)**
 *    - Numero corrente: \(7\)
 *    - Calcolo del complemento: \(9 - 7 = 2\)
 *    - Controllo se il complemento (2) è presente nella mappa `numMap`: Sì, con indice \(0\)
 *    - Poiché il complemento è presente nella mappa, restituisci l'array \([0, 1]\), dove \(0\) è l'indice del complemento e \(1\) è l'indice corrente.
 *
 * La funzione restituisce \([0, 1]\), che rappresenta gli indici dei numeri \(2\) e \(7\) nell'array.
 *
 * Questo è l'esito dell'esecuzione del codice per l'esempio fornito. Come puoi vedere, utilizzando la mappa `numMap`, il codice può trovare rapidamente il complemento di ogni numero e determinare se esiste nell'array. Se esiste, i suoi indici vengono restituiti. Se il ciclo termina senza trovare una soluzione, viene lanciata un'eccezione.
 *
 *
 * Certo! Analizziamo un altro esempio fornito nel codice:
 * ```java
 * int[] result2 = solution.twoSum(new int[]{3,2,4}, 6);
 * ```
 * L'obiettivo è trovare due numeri nell'array \([3,2,4]\) che sommano a \(6\).
 *
 * ### Esecuzione passo dopo passo:
 *
 * 1. **Inizializzazione**
 *    - Array: \([3,2,4]\)
 *    - Target: \(6\)
 *    - Mappa `numMap`: vuota
 *    - Indice corrente: \(i = 0\)
 *
 * 2. **Prima iterazione (i = 0)**
 *    - Numero corrente: \(3\)
 *    - Calcolo del complemento: \(6 - 3 = 3\)
 *    - Controllo se il complemento (3) è presente nella mappa `numMap`: No
 *    - Aggiungo \(3\) alla mappa con l'indice \(0\). Ora la mappa è: \(\{3: 0\}\)
 *
 * 3. **Seconda iterazione (i = 1)**
 *    - Numero corrente: \(2\)
 *    - Calcolo del complemento: \(6 - 2 = 4\)
 *    - Controllo se il complemento (4) è presente nella mappa `numMap`: No
 *    - Aggiungo \(2\) alla mappa con l'indice \(1\). Ora la mappa è: \(\{3: 0, 2: 1\}\)
 *
 * 4. **Terza iterazione (i = 2)**
 *    - Numero corrente: \(4\)
 *    - Calcolo del complemento: \(6 - 4 = 2\)
 *    - Controllo se il complemento (2) è presente nella mappa `numMap`: Sì, con indice \(1\)
 *    - Poiché il complemento è presente nella mappa, restituisci l'array \([1, 2]\), dove \(1\) è l'indice del complemento e \(2\) è l'indice corrente.
 *
 * La funzione restituisce \([1, 2]\), che rappresenta gli indici dei numeri \(2\) e \(4\) nell'array.
 *
 * Questo esempio dimostra come la mappa `numMap` venga aggiornata ad ogni iterazione e come venga utilizzata per trovare rapidamente il complemento di ogni numero nell'array. S
 * e tale complemento esiste, i suoi indici vengono restituiti.
 *
 *
 *
 * In Java, HashMap è una classe della Java Collections Framework (JCF) che implementa l'interfaccia Map. È utilizzata per memorizzare coppie chiave-valore, dove ogni chiave è associata a esattamente un valore.
 * Le principali caratteristiche di HashMap sono:
 *
 * Chiave unica: Nella HashMap, ogni chiave è unica. Se si inserisce un valore utilizzando una chiave già esistente, il valore precedente associato a quella chiave viene sovrascritto dal nuovo valore.
 *
 * Ordine non garantito: HashMap non garantisce un ordine specifico delle sue voci, né basato sull'inserimento né basato sulle chiavi.
 *
 * Nulla è permesso: HashMap consente chiavi e valori nulli. Puoi avere una sola chiave nulla e valori nulli multipli.
 *
 * Non è sincronizzato: HashMap non è sincronizzato, il che significa che non è thread-safe. Se è necessario utilizzare una mappa thread-safe, si può considerare ConcurrentHashMap o sincronizzare la HashMap manualmente.
 *
 * Ottimizzato per la velocità: HashMap è generalmente molto veloce e offre un tempo di accesso costante
 * O(1) in condizioni ideali, grazie all'uso di tecniche di hashing.
 *
 * import java.util.HashMap;
 *

 */