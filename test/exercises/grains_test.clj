(ns exercises.grains-test
  (:require [clojure.test :refer :all]
            [exercises.grains :refer :all]))

(deftest grains-test
  (testing "square"
    (is (= 1 (square 1)))
    (is (= 2 (square 2)))
    (is (= 4 (square 3)))
    (is (= 8 (square 4)))
    (is (= 32768 (square 16)))
    (is (= 2147483648 (square 32)))
    (is (= 9223372036854775808N (square 64))))
  (testing "total"
    (is (= 18446744073709551615N (total)))))
