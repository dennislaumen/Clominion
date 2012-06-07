(ns Clominion.test.core
  (:use [Clominion.core])
  (:use [midje.sweet]))

(fact "Clominion can be played with two to four players"
    (start-game 1) => (throws AssertionError)
    (start-game 2) => (two-of keyword?)
    (start-game 4) => (four-of keyword?)
    (start-game 5) => (throws AssertionError)
)
