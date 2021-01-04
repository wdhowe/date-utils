(ns date-utils.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [date-utils.core :as date]
            [java-time :as time]))

(def end-date-test "21 days from now."
  (date/date->str (time/plus (time/local-date) (time/days 21))))

(deftest days-left-test
  (testing "days-left until a custom date."
    (is (= 21 (date/days-left (date/str->date end-date-test))))))

(deftest weeks-left-test
  (testing "weeks-left until a custom date."
    (is (= 3.0 (date/weeks-left (date/str->date end-date-test))))))
