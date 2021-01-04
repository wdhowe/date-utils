(ns date-utils.core
  (:require [java-time :as time])
  (:gen-class))

(defn now
  "The current date."
  []
  (time/local-date))

(defn date->str
  "Convert a date object to a string in 'YYYY-MM-dd' format."
  [date-obj]
  (time/format "yyyy-MM-dd" date-obj))

(defn str->date
  "Convert a date in string format 'YYYY-MM-dd' to a date object."
  [date-string]
  (time/local-date "yyyy-MM-dd" date-string))

(defn now-str
  "Return a string format of the current date."
  []
  (date->str (now)))

(defn year
  "The current year from the current date."
  []
  (time/as (now) :year))

(defn end-of-year
  "Last date of the current year."
  []
  (time/local-date (year) 12 31))

(defn end-of-year-str
  "Last date of the current year in a string format."
  []
  (date->str (end-of-year)))

(defn days-left
  "Days left until the end of the current year (no params) or the specified `end-date`."
  ([]
   (days-left (end-of-year)))
  ([end-date]
   (time/time-between (now) end-date :days)))

(defn weeks-left
  "Weeks left until the end of the current year (no params) or the specified `end-date`."
  ([]
   (weeks-left (end-of-year)))
  ([end-date]
   (/ (days-left end-date) 7.0)))

(comment
  (now)
  (date->str (now))
  (str->date "2020-08-05")
  (now-str)
  (year)
  (end-of-year)

  ; var for testing a custom end date: create a date string
  (def end-date-test (date->str (time/plus (time/local-date) (time/days 21))))
  (println "Test end-date is:" end-date-test)

  (days-left)
  (days-left (str->date end-date-test))
  (weeks-left)
  (weeks-left (str->date end-date-test)))
