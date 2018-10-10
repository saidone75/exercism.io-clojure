(ns exercises.roman-numerals)

(defn compose
  [n a b c]
  (cond
    (< n 4) (apply str (repeat n a))
    (= n 4) (str a b)
    (= n 5) b
    (and (> n 5) (< n 9)) (str (compose 5 a b c) (compose (- n 5) a b c))
    (= n 9) (str a c)))

(defn units
  [n]
  (compose n "I" "V" "X"))

(defn decs
  [n]
  (compose n "X" "L" "C"))

(defn hundreds
  [n]
  (compose n "C" "D" "M"))

(defn thousands
  [n]
  (apply str (repeat n "M")))

(defn numerals
  [n]
  (loop [n (reverse (str n)) i 0 r ""]
    (if (empty? n) r
        (recur (rest n) (inc i) (str
                                 (cond
                                   (= 0 i) (units (- (int (first n)) 48))
                                   (= 1 i) (decs (- (int (first n)) 48))
                                   (= 2 i) (hundreds (- (int (first n)) 48))
                                   (= 3 i) (thousands (- (int (first n)) 48))) r)))))
