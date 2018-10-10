(ns exercises.gigasecond-test
  (:require [clojure.test :refer :all]
            [exercises.gigasecond :refer :all]))

(deftest gigasecond-test
  (testing "gigasecond"
    (is (= [2043 1 1] (gigasecond 2011 4 25)))
    (is (= [2009 2 19] (gigasecond 1977 6 13)))
    (is (= [1991 3 27] (gigasecond 1959 7 19)))))
