cljs-nodejs-example
===================

An example of using ClojureScript to make a node.js app.

This was used to show a node server written in ClojureScript. Super fun stuff that needs to be updated to current standards.

Requirements
============

* lein
* node.js

Steps
=====

Run the following from the base project directory:

    npm install
    lein cljsbuild once

This will create the target/js/myexample.js file. This is what you can run with node.js:

    node target/js/myexample.js

And there you go, a "Hello World!" that's done in an ancient way, with a runtime deprecation warning.

