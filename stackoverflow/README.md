# StackOverflow

## Task
https://www.coursera.org/learn/scala-spark-big-data

The overall goal of this assignment is to implement a distributed k-means algorithm which clusters posts on the popular question-answer platform StackOverflow according to their score. Moreover, this clustering should be executed in parallel for different programming languages, and the results should be compared.

## Data
http://alaska.epfl.ch/~dockermoocs/bigdata/stackoverflow.csv

## Output
```
Iteration: 45
  * current distance: 5.0
  * desired distance: 20.0

Resulting clusters:
  Score  Dominant language (%percent)  Questions
================================================
  10271  Java              (100.0%)            2
   1895  JavaScript        (100.0%)           33
   1290  C++               (100.0%)            9
   1269  Python            (100.0%)           19
   1130  Haskell           (100.0%)            2
    887  PHP               (100.0%)           13
    766  CSS               (100.0%)           26
    546  Ruby              (100.0%)           34
    503  Objective-C       (100.0%)           73
    443  C#                (100.0%)          147
    377  JavaScript        (100.0%)          431
    249  Java              (100.0%)          483
    227  Python            (100.0%)          400
    212  C++               (100.0%)          264
    172  CSS               (100.0%)          358
    139  PHP               (100.0%)          475
    130  Scala             (100.0%)           47
     97  Objective-C       (100.0%)          784
     85  Ruby              (100.0%)          648
     79  C#                (100.0%)         2585
     78  Perl              (100.0%)           56
     66  Clojure           (100.0%)           57
     53  Haskell           (100.0%)          202
     36  Groovy            (100.0%)           32
     25  Scala             (100.0%)          728
     14  Clojure           (100.0%)          595
      9  Perl              (100.0%)         4716
      5  MATLAB            (100.0%)         2774
      4  Haskell           (100.0%)        10362
      3  Groovy            (100.0%)         1390
      2  Perl              (100.0%)        19229
      2  MATLAB            (100.0%)         7989
      2  Clojure           (100.0%)         3441
      2  Python            (100.0%)       174586
      2  C++               (100.0%)       181255
      2  Scala             (100.0%)        12423
      1  C#                (100.0%)       361835
      1  Ruby              (100.0%)        54727
      1  CSS               (100.0%)       113598
      1  PHP               (100.0%)       315771
      1  Objective-C       (100.0%)        94745
      1  JavaScript        (100.0%)       365649
      1  Java              (100.0%)       383473
      0  Groovy            (100.0%)         1631
      0  MATLAB            (100.0%)         3725
```