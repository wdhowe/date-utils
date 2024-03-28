# date-utils

[![Build Status][gh-actions-badge]][gh-actions] [![Clojars Project][clojars-badge]][clojars] [![Clojure version][clojure-v]](project.clj)

A Clojure library for getting date based information.

## Getting Started

Using the date-utils library.

### Installation

See [Clojars for adding this library][clojars] to various project types (lein, boot, deps.edn, etc).

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

<!-- Named page links below: /-->

[gh-actions-badge]: https://github.com/wdhowe/date-utils/workflows/ci%2Fcd/badge.svg
[gh-actions]: https://github.com/wdhowe/date-utils/actions
[cljdoc-badge]: https://cljdoc.org/badge/com.github.wdhowe/date-utils
[cljdoc-link]: https://cljdoc.org/d/com.github.wdhowe/date-utils/CURRENT
[clojure-v]: https://img.shields.io/badge/clojure-1.11.1-blue.svg
[clojars]: https://clojars.org/com.github.wdhowe/date-utils
[clojars-badge]: https://img.shields.io/clojars/v/com.github.wdhowe/date-utils.svg
