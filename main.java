//! esercizio 1
//Scrivere un programma Java per invertire un array di valori interi

// public class main {

//     public static void main(String[] args) {
//         int[] array = { 20, 10, 5, 4, 3, 2, 1 };

//         int index = array.length-1;                       //salviamo in una variabile l'ultimo elemento dell'array

//         for (int i = 0; i <= array.length / 2; i++) {
//             int tmp = array[i];        //variabile temporanea per salvare il contenuto di array[i]
//             array[i]= array[index];
//             array[index] = tmp;
//             index--;
//         }

//         for(int k = 0; k<array.length; k++){
//             System.out.println(array[k]);
//         }

//     }
// }

//! esercizio 2

//scrivere un porgramma Java per separare i numeri pari e dispari di un dato array di numeri interi.
//Mettere prima tutti i numeri pari e poi i numeri dispari
// public class main {

//     public static void main(String[] args) {
//         int[] array = { 3, 4, 7, 10, 30, 37, 5 };

//         int[] array2 = new int[7]; // prima cosa da fare è creare un nuovo array per inserire i numeri

       // ! per prendere i numeri pari
//         int posPari = 0; // nuova variabile per inserire l'indice ed utilizzarlo poi per inserirlo
                          // nell'array nuovo
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] % 2 == 0) {
//                 array2[posPari] = array[i]; // al posto inserito aggiungi l'elemento, in qujesto caso si parte da 0 al
                                             // posto zero inserisci l'elemento ossia il numero pari
//                 posPari++; // incrementiamo la cella per dire che il posto successivo è libero per inserire
                            // il prossimo numero pari
//             }
//         }

         // ! per prendere i numeri dispari
//         int posDispari = posPari; // la posizione dispari non deve partire da 0 ma dall aposizione pari perchè
                                   // come dice la traccia prima i pari e poi i dispari e quindi devono seguire
                                   // l'indice dato dai pari
//         for (int i = 0; i < array2.length; i++) {
//             if (array[i] % 2 == 1) {
//                 array2[posDispari] = array[i];
//                 posDispari++;
//             }
//         }

//         for (int i = 0; i < array2.length; i++) {
//             System.out.println(array2[i]);
//         }

//     }
// }


//! esercizio 3 - secondo modo per svolgere l'esercizio 2 - cioè usare lo stesso array per memorizzare
//! prima i numeri pari e poi dispari però questa volta non costruendo un nuovo array

//Scrivere un programma Java per separare i numeri pari e dispari di un dato array di numeri interi
//Mettere prima tutti i numeri pari e poi i numeri dispari 

// public class main {

//     public static void main(String[] args) {
//         int[] array = {1,3,46,89,90,4,3,2,7,8};

//         for (int i = 0; i < array.length; i++) {
//             if (array[i] % 2 != 0) {
//                 for (int j = i+1; j < array.length; j++) {
//                     if (array[j] % 2 == 0) {
//                         int varTemporanea = array[i];
//                         array[i] = array[j];
//                         array[j] = varTemporanea;
//                     }
//                 }
//             }
//         }
//         for (int i = 0; i < array.length; i++) {
//             System.out.println(array[i]);
//         }
//     }
// }

//! esercizio 4

//Scrivete un programma Java per trovare il più piccolo e il secondo più piccolo 
//elemento di un dato array

public class main {

    public static void main(String[] args) {
        int[] array = {10,3,12,13,1};

        int min = array[0];  // in questo caso non partiamo da 0 ma dal primo elemento
        int indexMin = 0;

        //! troviamo il più piccolo
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
                
            }
            
        }
        


        int minSecondo = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                minSecondo = array[i];
            }
        }

//! troviamo il secondo più piccolo
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minSecondo && array[i] != min) {
                minSecondo = array[i];
            }
        }

        System.out.println("il minimo è:" + min);
        System.out.println("il secondo è:" + minSecondo);
        
    }
}