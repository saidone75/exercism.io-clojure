(ns exercises.grains)

(defn square
  [n]
  (loop [n n res 1N]
    (if (< n 2)
      res
      (recur (dec n) (* 2 res)))))

(defn total
  []
  (loop [n 64 res 0N]
    (if (< n 1)
      res
      (recur (dec n) (+ res (square n))))))
