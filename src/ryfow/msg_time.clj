(ns ryfow.msg-time)

(defmacro msg-time
  "Like clojure.core/time, but with a user defined prefix message."
  [prefix expr]
  `(let [start# (. System (nanoTime))
         ret# ~expr]
     (prn (str ~prefix " " (/ (double (- (. System (nanoTime)) start#)) 1000000.0) " msecs"))
     ret#))
