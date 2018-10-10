(ns exercises.collatz)

(defn collatz
  [x]
  (if (< x 1) (throw (new IllegalArgumentException)))
  (loop [x x r 0]
    (if (= 1 x) r
        (if (even? x)
          (recur (/ x 2) (inc r))
          (recur (inc (* 3 x)) (inc r))))))
