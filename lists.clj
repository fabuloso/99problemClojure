(ns ninety-nine-clojure.lists)

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
