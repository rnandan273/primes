(ns primes.core
  (:gen-class))


(defn is_prime 
	" Checks if the number is a prime number or not"
	[n] 
	(empty? (filter #(= 0 (rem n %)) (range 2 (dec n)))))

(defn primes 
	"Get all the first n primes"
	[n] 
	(->> (range) 
	 	(rest)
     	(filter is_prime) 
     	(take n)))

(defn prime_tables 
	"For tables for the prime number from n * 1 to n * 10"
	[n] 
	(->> (primes n)
		 (map (fn [x] (map #(* % x) (range 1 11))))))


(defn print_tables
   "Transform the display in the required format"
    [n]
	 (map (fn [x] (map #(nth % x) (prime_tables n))) (range 0 10)))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Display tables for first 10 primes in tab format!")
  (loop [x (print_tables 10)]
  (when (not (empty? x))
    (println (clojure.string/join "\t" (first x)))
    (recur (rest x)))))





