(ns clojure99problems.core)

(defn my-last [x]
  "P01 (*) Find the last element of a list"
  (if (next x)
    (recur (next x))
    (first x)
  )
)

(defn penultimate [x]
  "P02 (*) Find the penultimate element of a list"
  (loop [acc 0 list x]
    (if (next list)
      (recur (first list) (rest list))
      acc
    )
  )
)

(defn element-at [list idx]
  "P03 (*) Find the K'th element of a list"
  (loop [count 1 xs list]
    (if (= count idx)
      (first xs)
      (recur (+ count 1)(next xs))
    )
  )
)

(defn size-of [list]
  "P04 (*) Find the number of elements of a list"
  (if (nil? list) 0)
  (loop [count 1 xs list]
    (if (next xs)
      (recur (+ count 1)(next xs))
      count
    )
  )
)

(defn reverse-of [list]
  "P05 (*) Reverse a list"
  (loop [rev () xs list]
    (if (first xs)
      (recur
        (conj rev (first xs))
        (next xs)
      )
      rev
    )
  )
)

(defn palindrome? [list]
  (= list (reverse-of list))
)
