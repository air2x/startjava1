/* Вывод всей таблицы */
SELECT * 
  FROM Jagers;

/* Вывод только не уничтоженных роботов */
SELECT * 
  FROM Jagers
 WHERE status = 'Active';

/* Вывод роботов серий : Mark-1 и Mark-4 */
SELECT * 
  FROM Jagers
 WHERE mark IN('Mark-1', 'Mark-4');

/* Вывод всех роботов, кроме Mark-1 и Mark-4 */
SELECT * 
  FROM Jagers
 WHERE mark NOT IN('Mark-1', 'Mark-4');

/* Сортировка таблицы по убыванию по столбцу mark */
SELECT * 
  FROM Jagers
 ORDER BY mark DESC;

/* Вывод информации о самом старом роботе */
SELECT * 
  FROM Jagers
 WHERE launch =
    (SELECT MIN(launch)
        FROM Jagers);

/* Вывод роботов, которые уничтожили больше всех kaiju */
SELECT *
  FROM Jagers
 WHERE kaiju_kill =
    (SELECT MAX(kaiju_kill)
        FROM Jagers);

/* Вывод среднего веса роботов */
SELECT AVG(weight) AS average_weight
  FROM Jagers;

/* Увеличение на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены */
UPDATE Jagers 
   set kaiju_kill = kaiju_kill + 1
 WHERE status = 'Active';

/* Удаление уничтоженных роботов */
DELETE
  FROM Jagers
 WHERE status = 'Destroyed';
