# User Agents

## Data

1. `ua_reactions.csv` - логи кликов/показов рекламы с разных user agents
    * 1 - показ рекламы, который закончился кликом
    * 0 - показ без клика
2. `excluded.txt` - список user agents которые надо исключить из расчета

## Task

1. Взять все UA, для которых было больше 5 показов рекламы, посчитать CTR (clicks / shows) для каждого UA и вывести топ 5.
2. Вывести все UA, на которых приходится 50% рекламных показов.
3. Все расчеты надо делать с иключением UA из файла `excluded.txt`

## Output

```
Top 5 user agents by CTR:
+-----------------------------------------------------------------------------------------------------------------------------------------+-----+------+------------------+
|ua                                                                                                                                       |shows|clicks|ctr               |
+-----------------------------------------------------------------------------------------------------------------------------------------+-----+------+------------------+
|Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.80 Safari/537.36                             |6    |5.0   |0.8333333333333334|
|Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36                      |14   |11.0  |0.7857142857142857|
|Mozilla/5.0 (Linux; Android 6.0.1; SM-G532G Build/MMB29T) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.83 Mobile Safari/537.36|22   |16.0  |0.7272727272727273|
|Mozilla/5.0 (Linux; Android 6.0; vivo 1606 Build/MMB29M) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.124 Mobile Safari/537.36|16   |11.0  |0.6875            |
|Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.63 Safari/537.36                             |21   |14.0  |0.6666666666666666|
+-----------------------------------------------------------------------------------------------------------------------------------------+-----+------+------------------+

Agents with half shows (264 out of 543): 
+---------------------------------------------------------------------------------------------------------------------------------------------------------+-----+------+---------+
|ua                                                                                                                                                       |shows|clicks|cum_shows|
+---------------------------------------------------------------------------------------------------------------------------------------------------------+-----+------+---------+
|Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36                                        |30   |13.0  |30       |
|Mozilla/5.0 (Windows NT 6.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36                                       |29   |11.0  |59       |
|Mozilla/5.0 (Linux; Android 6.0.1; CPH1607 Build/MMB29M; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/63.0.3239.111 Mobile Safari/537.36|28   |17.0  |87       |
|Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36                                       |27   |12.0  |141      |
|Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36                                       |27   |12.0  |141      |
|Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36                                        |26   |13.0  |167      |
|Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36                                      |25   |16.0  |217      |
|Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36                                      |25   |13.0  |217      |
|Mozilla/5.0 (Windows NT 5.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.112 Safari/537.36                                                   |24   |11.0  |241      |
|Mozilla/5.0 (Linux; Android 6.0; vivo 1713 Build/MRA58K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.124 Mobile Safari/537.36                |23   |8.0   |264      |
+---------------------------------------------------------------------------------------------------------------------------------------------------------+-----+------+---------+
```