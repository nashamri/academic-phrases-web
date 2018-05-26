![GPL v2](https://img.shields.io/badge/License-GPL%20v2-blue.svg)

# academic-phrases-web

This is a little web interface for my Emacs package
[academic-phrases](https://github.com/nashamri/academic-phrases) (You can
install the package from [MELPA](https://melpa.org/#/academic-phrases)).


## Live version
A live copy of this repo is available on my site. You can access it
[Here](https://nasser.space/ap).


## Setup

To get an interactive development environment run:

    lein figwheel

and open your browser at [localhost:3449](http://localhost:3449/).
This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

    lein clean

To create a production build run:

    lein do clean, cljsbuild once min

And open your browser in `resources/public/index.html`. You will not
get live reloading, nor a REPL. 

## Testing

To run the tests and watch for changes:

    lein doo phantom test

To run the tests once:

    lein doo phantom test once

## License

Copyright © 2018 Nasser Alshammari

Distributed under the GNU General Public License, version 2.
