(ns exercises.bob-test
  (:require [clojure.test :refer :all]
            [exercises.bob :refer :all]))

(deftest is-all-uppercase-test
  (testing "uppercase"
    (is (is-all-uppercase? "CIAO!!!"))
    (is (not (is-all-uppercase? "El mona che sbatte la porta.")))
    (is (is-all-uppercase? "LUTZ RULEZ"))))

(deftest is-question-test
  (testing "question"
    (is (is-question? "Allora ragioniere che fa, batti?"))
    (is (not (is-question? "Ah, congiuntivo!")))))

(deftest is-blank-test
  (testing "blank"
    (is (is-blank? ""))
    (is (not (is-blank? "blank")))))

(deftest bob
  (testing "bob"
    (is (= (response-for "Tom-ay-to, tom-aaaah-to.") "Whatever."))
    (is (= (response-for "Let's go make out behind the gym!") "Whatever."))
    (is (= (response-for "It's OK if you don't want to go to the DMV.") "Whatever."))
    (is (= (response-for "Ending with ? means a question.") "Whatever."))
    (is (= (response-for "1, 2, 3") "Whatever."))
    (is (= (response-for "WATCH OUT!") "Woah, chill out!"))
    (is (= (response-for "WHAT THE HELL WERE YOU THINKING?") "Woah, chill out!"))
    (is (= (response-for "ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!") "Woah, chill out!"))
    (is (= (response-for "1, 2, 3 GO!") "Woah, chill out!"))
    (is (= (response-for "I HATE YOU") "Woah, chill out!"))
    (is (= (response-for "Does this cryogenic chamber make me look fat?") "Sure."))
    (is (= (response-for "4?") "Sure."))
    (is (= (response-for "") "Fine. Be that way!"))
    (is (= (response-for " ") "Fine. Be that way!"))))
