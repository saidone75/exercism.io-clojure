(ns exercises.phone-number-test
  (:require [clojure.test :refer :all]
            [exercises.phone-number :refer :all]))

(deftest phone-number-test
  (testing "phone-number"
    (is (= "1234567890" (number "(123) 456-7890")))
    (is (= "1234567890" (number "123.456.7890")))
    (is (= "1234567890" (number "11234567890")))
    (is (= "0000000000" (number "123456789")))
    (is (= "0000000000" (number "21234567890")))
    (is (= "123" (area-code "1234567890")))
    (is (= "(123) 456-7890" (pretty-print "1234567890")))
    (is (= "(123) 456-7890" (pretty-print "11234567890")))))
