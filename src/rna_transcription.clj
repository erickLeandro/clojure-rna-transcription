(ns rna-transcription)

(def rna-list {
  \C \G
  \G \C
  \A \U
  \T \A
})

(defn to-rna [elements]
  (if (every? rna-list (vec elements)) (apply str (map rna-list (vec elements))) (throw (AssertionError.))))