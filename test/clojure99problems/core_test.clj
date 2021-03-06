(ns clojure99problems.core-test
  (:require [clojure.test :refer :all]
            [clojure99problems.core :refer :all]))

(deftest my-last-test
  (testing "Retrieve the last item of a list."
    (is (= 1 (my-last '(5 4 3 2 1))))
  )
)

(deftest last-but-one-test
  (testing "Retrieve the last but one item of a list."
    (is (= 2 (penultimate '(5 4 3 2 1))))
  )
)

(deftest retrive-element-at
  (testing "Retrieve the k'th item of a list."
    (is (= 4 (element-at '(5 4 3 2 1) 2)))
  )
)

(deftest size-of-a-list
  (testing "Get the number of items in a list."
    (is (= 5 (size-of '(5 4 3 2 1))))
  )
)

(deftest reverse-of-a-list
  (testing "Get the reverse of a list."
    (is (= '(1 2 3 4 5) (reverse-of '(5 4 3 2 1))))
  )
)

(deftest is-a-list-palindrome
  (testing "Look up if a list is palindrome."
    (is (true? (palindrome? '(a b b a))))
  )
)

(deftest flat-a-list
    (testing "Flat a nested list."
      (is (= '(1 2 3 4 5 6) (my-flat '(1 (2 3) (4 (5 6))))))
    )
)

(deftest compress-a-list
    (testing "Compress a list."
      (is (= '(1 2 3 4 5 6 2) (compress '(1 2 2 2 3 3 4 5 6 6 6 2))))
    )
)

(deftest sub-pack-test
  (testing "Sub-pack a list."
    (is (= '(1 1 1 1) (sub-pack '(1 1 1 1 2 2 3 3 ))))
  )
)

;(deftest pack-a-list
    ;(testing "PAck a list."
  ;    (is (= '((a a a a)(b)(c c)(a a)(d)(e e e e)) (pack '(a a a a b c c a a d e e e e))))
;    )
;)
