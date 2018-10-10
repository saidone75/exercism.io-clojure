(ns exercises.rna)

(defn compl
  [x]
  (cond
    (= \G x) \C
    (= \C x) \G
    (= \T x) \A
    (= \A x) \U
    :else (throw (new AssertionError))))

(defn to-rna
  [x]
  (loop [x (char-array x) r []]
    (if (empty? x)
      (apply str r)
      (recur (rest x) (conj r (compl (first x)))))))
