(ns exercises.series-test
  (:require [clojure.test :refer :all]
            [exercises.series :refer :all]))

(deftest slices-test
  (testing "slices"
    (is (= [] (slices "" 1)))
    (is (= [""] (slices "123" 0)))
    (is (= [] (slices "123" 1000)))
    (is (= ["123"] (slices "123" 3)))
    (is (= #{"234" "123" "345"} (set (slices "12345" 3))))))
