(ns ryfow.msg-time-test
  (:use [clojure.test]
        [ryfow.msg-time]))

(defn sleep [msecs]
  (msg-time "sleep" (Thread/sleep msecs)))

(deftest check-prefix
  (is (re-matches #"\"foo .*msecs\"\n" (with-out-str (msg-time "foo" (+ 3 4)))))
  (is (re-matches #"\"sleep .*msecs\"\n" (with-out-str (sleep 20))))
  (is (= 7  (msg-time "foo" (+ 3 4)))))

