(ns exercises.leap-year-test
  (:require [clojure.test :refer :all]
            [exercises.leap-year :refer :all]))

(deftest leap-year-test
  (testing "leap-year"
    (is (true? (leap-year? 1996)))
    (is (false? (leap-year? 1997)))
    (is (false? (leap-year? 1900)))
    (is (true? (leap-year? 2400)))))
