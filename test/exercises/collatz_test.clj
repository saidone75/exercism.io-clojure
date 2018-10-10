(ns exercises.collatz-test
  (:require [clojure.test :refer :all]
            [exercises.collatz :refer :all]))

(deftest collatz-test
  (testing "collatz"
    (is (= 4 (collatz 16)))
    (is (= 9 (collatz 12)))
    (is (= 152 (collatz 1000000)))
    (is (thrown? IllegalArgumentException  (collatz 0)))
    (is (thrown? IllegalArgumentException  (collatz -12)))))
