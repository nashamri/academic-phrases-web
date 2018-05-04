(ns academic-phrases-web.test-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [academic-phrases-web.core-test]))

(enable-console-print!)

(doo-tests 'academic-phrases-web.core-test)
