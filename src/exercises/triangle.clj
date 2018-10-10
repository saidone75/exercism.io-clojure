(ns exercises.triangle)

(defn triangle-type
  [a b c]
  (cond
    (or
     (< a 1)
     (< b 1)
     (< c 1)
     (<= (+ b c) a)
     (<= (+ a c) b)
     (<= (+ a b) c)) :illogical
    (= a b c) :equilateral
    (or
     (= a b)
     (= a c)
     (= b c)) :isosceles
    :else :scalene))
