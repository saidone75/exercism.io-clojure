(ns exercises.rna-test
  (:require [clojure.test :refer :all]
            [exercises.rna :refer :all]))

(deftest rna
  (testing "to-rna"
    (is (= "G" (to-rna "C")))
    (is (= "C" (to-rna "G")))
    (is (= "U" (to-rna "A")))
    (is (= "A" (to-rna "T")))
    (is (= "UGCACCAGAAUU" (to-rna "ACGTGGTCTTAA")))
    (is (thrown? AssertionError (to-rna "XCGFGGTDTTAA")))))
