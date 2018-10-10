(ns exercises.roman-numerals-test
  (:require [clojure.test :refer :all]
            [exercises.roman-numerals :refer :all]))

(deftest roman-numerals-test
  (testing "roman-numerals-1"
    (is (= "I" (numerals 1)))
    (is (= "II" (numerals 2)))
    (is (= "III" (numerals 3))))
  (testing "roman-numerals-2"
    (is (= "IV" (numerals 4)))
    (is (= "V" (numerals 5)))
    (is (= "VI" (numerals 6))))
  (testing "roman-numerals-3"
    (is (= "IX" (numerals 9)))
    (is (= "XXVII" (numerals 27)))
    (is (= "XLVIII" (numerals 48)))
    (is (= "LIX" (numerals 59))))
  (testing "roman-numerals-4"
    (is (= "XCIII" (numerals 93)))
    (is (= "CXLI" (numerals 141)))
    (is (= "CLXIII" (numerals 163)))
    (is (= "CDII" (numerals 402)))
    (is (= "DLXXV" (numerals 575))))
  (testing "roman-numerals-5"
    (is (= "CMXI" (numerals 911)))
    (is (= "MXXIV" (numerals 1024)))
    (is (= "MMM" (numerals 3000)))))
