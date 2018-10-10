(ns exercises.phone-number)

(defn number
  [x]
  (let [n (apply str (filter #(re-matches #"\d" (str %)) (char-array x)))]
    (cond
      (and (= (count n) 11) (clojure.string/starts-with? n "1")) (subs n 1)
      (not= (count n) 10) "0000000000"
      :else n)))

(defn area-code
  [x]
  (subs (number x) 0 3))

(defn pretty-print
  [x]
  (let [n (number x)]
    (str "(" (subs n 0 3) ")" " " (subs n 3 6) "-" (subs n 6))))
