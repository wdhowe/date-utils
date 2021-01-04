# date-utils

A Clojure library for getting date based information.

## Getting Started

Using the date-utils library.

### Installation

Leiningen/Boot Project File

```clojure
[date-utils "0.1.0"]
```

Clojure CLI/deps.edn

```clojure
date-utils/date-utils {:mvn/version "0.1.0"}
```

### Include the Library

In the REPL

```clojure
(require '[date-utils.core :as date])
```

In your application

```clojure
(ns my-app.core
  (:require [date-utils.core :as date]))
```

### Use the Library

A few usage examples.

```clojure
;; Get the current date in a date object.
(date/now)

;; Convert a yyyy-MM-dd string to a date object.
(date/str->date "2020-01-03")

;; Days left until the end of the year.
(date/days-left)
```
