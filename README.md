# Zoo

I package `animal` e `diet` contengono le classi e interfacce dell'esercizio `03` dello scorso laboratorio.

# Fase 1

- La semantica di `Animal` è cambiata, ora un `Animal` rappresenta un animale fisico vero e proprio e non una **specie animale**.
  - Notare l'assenza del metodo `averageWeight()`, rimpiazzato invece dal metodo `getWeight()`.
  - In casi come questo,
    (in cui un termine può avere significati diversi in base al contesto) è importante documentare a dovere il codice.
    - Soprattutto nel caso delle interfacce!

- Visionare e capire il codice. In caso di dubbi sul perché sono state fatte certe scelte, consultare il docente.
  - Se si hanno soluzione alternative, potrebbero essere altrettanto valide.

# Fase 2

- Le classi e le interfacce hanno nomi chiari e significativi.
- I meccanismi di composizione ed ereditarietà sono stati utilizzati per cercare di modellare al meglio il dominio.

La struttura è chiara, ma il codice è pieno di ripetizioni!
- Le ripetizioni sono estremamente problematiche, in quanto rendono il codice difficile da mantenere.
  - Se si vuole cambiare qualcosa, bisogna farlo in più punti.
  - Se si dimentica di cambiare un punto, si introduce, per forza di cose, un bug.

**SOLUZIONE**: [Don't Repeat Yourself! (DRY)](https://it.wikipedia.org/wiki/Don%27t_repeat_yourself)

*Nuova regola*: se state facendo copia-incolla, con ogni probabilità, state sbagliando qualcosa. Esiste un modo migliore per fare ciò che state facendo.

- Introdurre una classe `CommonAnimal` che implementi `Animal` e che contenga il codice comune a tutti gli animali.
- Cambiare le classi `Kangaroo`, `KoratCat`, `SiameseCat` e `Squirrel` per fare in modo che estendano `CommonAnimal`.
    - Ora ogni sottoclasse di `CommonAnimal` può NON implementare ogni metodo di `Animal`, in quanto `CommonAnimal` lo fa già per loro.
  
- Abbiamo introdotto un "problema" però... Quale?
- Provare a capire il "problema" in autonomia. Non abbiamo ancora gli strumenti per risolverlo... Per ora lo ignoreremo.

# Fase 3 - Tassonomia

Introdurre un sistema di [Tassonomia](https://it.wikipedia.org/wiki/Tassonomia) semplificato per fornire informazioni riguardo gli animali.

- Vogliamo, dato un animale, ottenere alcune informazioni sulla sua Tassonomia.
  - Ad esempio, `KoratCat` è un classico gatto domestico, quindi la sua famiglia è `Felidae` e la sua specie è `Felis catus`.
  - In questo esercizio siamo SOLO interessati alla specie e alla famiglia...
    - Da qualche parte avremo i metodi `String getSpecies()` e `String getFamily()`.
  - Identificare la migliore posizione per questi metodi all'interno del codice sorgente;
  - Implementare una soluzione in autonomia e confrontarla con i docenti.
  - Nel metodo `main()` si stampino le informazioni sulla tassonomia di ciascun animale istanziato.


![Gradi di tassonomia: in ordine Life, Domain, Kingdom, Phylum, Class, Order, Family, Genus, Species](https://upload.wikimedia.org/wikipedia/commons/a/a5/Biological_classification_L_Pengo_vflip.svg)
