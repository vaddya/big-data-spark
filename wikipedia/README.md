# Wikipedia

## Task
https://www.coursera.org/learn/scala-spark-big-data

In this assignment, we'll use our full-text data from Wikipedia to produce a rudimentary metric of how popular a programming language is, in an effort to see if our Wikipedia-based rankings bear any relation to the popular Red Monk rankings.

## Data
http://alaska.epfl.ch/~dockermoocs/bigdata/wikipedia.dat

## Output
```
JavaScript -> 1692
C# -> 705
Java -> 586
CSS -> 372
C++ -> 334
MATLAB -> 295
Python -> 286
PHP -> 279
Perl -> 144
Ruby -> 120
Haskell -> 54
Objective-C -> 47
Scala -> 43
Clojure -> 26
Groovy -> 23

Processing Part 1: naive ranking took 36031 ms.
Processing Part 2: ranking using inverted index took 14138 ms.
Processing Part 3: ranking using reduceByKey took 10659 ms.
```
