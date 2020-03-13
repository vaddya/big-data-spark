# Binary Classification

## Data
https://cloud.mail.ru/public/2QH4/2z3HFmvfs

## Task
Написать на Spark ML пайплайн который должен включать следующие стадии:
1. Подбор гипер параметров алгоритма
2. Отбор значимых признаков
3. Сравнение двух алгоритмов по качеству работы (метрика качества AUC)

## Output
```
Random forest
numTopFeatures = 100
maxDepth = 15, impurity = entropy
areaUnderROC = 0.9279279499462313
areaUnderPR = 0.9194844921744567

Linear regression
numTopFeatures = 60
regParam = 0.001, elasticNetParam = 0.9
areaUnderROC = 0.7709160230716591
areaUnderPR = 0.757238244533842
```
