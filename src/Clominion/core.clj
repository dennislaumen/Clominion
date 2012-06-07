(ns Clominion.core)

(defn start-game
    [num-players]
    {:pre [(> num-players 1) (< num-players 5)]}
    (repeat num-players :a))
