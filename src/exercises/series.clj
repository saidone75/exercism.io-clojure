(ns exercises.series)

(defn slices
  [x n]
  (if (< (count x) n) []
      (loop [x x res []]
        (cond
          (< (count x) n) res
          (= 0 n) [""]
          :else (recur (subs x 1) (conj res (subs x 0 n)))))))
