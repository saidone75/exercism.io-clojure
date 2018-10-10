(ns exercises.triangle-test
  (:require [clojure.test :refer :all]
            [exercises.triangle :refer :all]))

(deftest triangle-test
  (testing "triangle-type"
    (is (= :equilateral (triangle-type 2 2 2)))
    (is (= :equilateral (triangle-type 10 10 10)))
    (is (= :isosceles (triangle-type 3 4 4)))
    (is (= :isosceles (triangle-type 4 3 4)))
    (is (= :scalene (triangle-type 3 4 5)))
    (is (= :illogical (triangle-type 1 1 50)))
    (is (= :illogical (triangle-type 1 2 1)))
    (is (= :illogical (triangle-type 2 4 2)))))
