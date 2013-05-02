# msg-time

Like clojure.core/time, but with a prefix.

## Usage

** In a REPL **
```clojure
user> (use 'ryfow.msg-time)
nil
user> (let [d (msg-time "This is a message" (+ 3 4))]
        (println "D ended up being" d))
"This is a message 0.039 msecs"
D ended up being 7
nil
user>
```

** In a file **
```clojure
(ns foo
  (:use [ryfow.msg-time]))
  
(defn sleep [msecs]
  (msg-time "sleepy" (Thread/sleep msecs)))
```

## License

Copyright © 2013 Ryan Fowler, Singlewire Software, LLC

Distributed under the Eclipse Public License, the same as Clojure.
