(ns primes.core-test
  (:require [clojure.test :refer :all]
            [primes.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))


(deftest prime-test
  (testing "check if the given number is a prime number."
    (is (is_prime 5))))

(deftest non-prime-test
  (testing "check if the given number is a not prime number."
    (is (= false (is_prime 6)))))

(deftest non-prime-test-2
  (testing "check if the given number is a not prime number."
    (is (= true (is_prime 6)))))