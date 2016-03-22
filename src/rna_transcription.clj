(ns rna-transcription)

(def dna->rna {
  \C \G
  \G \C
  \A \U
  \T \A
})

(defn valid-strand? [elements]
  (every? dna->rna elements))

(defn translate-strand [elements]
  (apply str (map dna->rna elements)))  

(defn to-rna [elements]
  (if (valid-strand? elements) 
    (translate-strand elements)
    (throw (AssertionError.))))