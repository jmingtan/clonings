# clonings

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

## Doing exercises

The exercises are sorted by topic, and can be found in `clonings/exercises`.

The task is simple. Most exercises contain an error that keep it from compiling, and it's up to you to fix it! Some exercises are also ran as tests, but rustlings handles them all the same. To run the exercises in the recommended order, execute:

    lein clonings watch

This will try to verify the completion of every exercise in a predetermined order (what we think is best for newcomers). It will also rerun automatically every time you change a file in the `exercises/` directory.

## Testing yourself

After every couple of sections, there will be a test that'll test your knowledge on a bunch of sections at once. These tests are found in exercises/testN.clj.