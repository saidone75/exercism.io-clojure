(ns exercises.bob)

(defn is-all-uppercase?
  [phrase]
  (and (not (= phrase (clojure.string/lower-case phrase))) (= phrase (clojure.string/upper-case phrase))))

(defn is-question?
  [phrase]
  (clojure.string/ends-with? phrase "?"))

(defn is-blank?
  [phrase]
  (clojure.string/blank? phrase))

(defn response-for
  [phrase]
  (cond
    (is-all-uppercase? phrase) "Woah, chill out!"
    (is-question? phrase) "Sure."
    (is-blank? phrase) "Fine. Be that way!"
    :else "Whatever."))
