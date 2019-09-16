<img src="./images/clones.jpg" width="400">

# clonings

[![CircleCI](https://circleci.com/gh/jmingtan/clonings.svg?style=svg)](https://circleci.com/gh/jmingtan/clonings)

A project for learning Clojure, based on [rustlings](https://github.com/rust-lang/rustlings).

What I liked about rustlings:

1. Fast feedback loop
2. Self-contained exercises together with hints
3. Incremental approach

Even with the many high quality resources for learning Clojure out there, I think this approach is worthwhile as a way to quickly bootstrap you into the world of Clojure.

## Getting Started

You'll need to set up the following tools:

- OpenJDK https://openjdk.java.net/
- Leiningen https://leiningen.org/

Once done, you should be able to run `lein` in the command-line.

Now, also on the command-line, git clone this project and `cd` to the `clonings` directory (or whatever you named your clone's directory).

## Doing exercises

The exercises are sorted by topic, and can be found in `clonings/exercises`. For every topic there is an additional README file with some resources to get you started on the topic. We really recommend that you have a look at them before you start.

The task is simple. Most exercises contain an error that keep it from compiling or running, and it's up to you to fix it! Some exercises are also ran as tests, but rustlings handles them all the same. To run the exercises in the recommended order, execute:

    lein clonings watch

This will try to verify the completion of every exercise in a predetermined order (what we think is best for newcomers). It will also rerun automatically every time you change a file in the `exercises/` directory. If you want to only run it once, you can use:

    lein clonings verify

This will do the same as watch, but it'll quit after running.

In case you want to go by your own order, or want to only verify a single exercise, you can run:

    lein clonings run exercises/path/to/exercise.clj

In case you get stuck, there is usually a hint at the bottom of each exercise.

## Testing yourself

After every couple of sections, there will be a test that'll test your knowledge on a bunch of sections at once. These tests are found in exercises/testN.clj.

## Image Attribution

"Clones" by astrangerathome is licensed under CC BY-NC-SA 2.0 