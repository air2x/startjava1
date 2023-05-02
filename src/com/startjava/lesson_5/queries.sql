
\echo /* Вывод всей таблицы*/
SELECT * 
  FROM Jagers;

\echo /* Вывод только не уничтоженных роботов */
SELECT * 
  FROM Jagers
 WHERE status = 'Active';

\echo /* Вывод роботов серий : Mark-1 и Mark-4 */
SELECT * 
  FROM Jagers
 WHERE mark IN('Mark-1', 'Mark-4');

\echo /* Вывод всех роботов, кроме Mark-1 и Mark-4 */
SELECT * 
  FROM Jagers
 WHERE mark NOT IN('Mark-1', 'Mark-4');

\echo /* Сортировка таблицы по убыванию по столбцу mark */
SELECT * 
  FROM Jagers
 ORDER BY mark DESC;

\echo /* Вывод информации о самом старом роботе */
SELECT * 
  FROM Jagers
 WHERE launch =
    (SELECT MIN(launch)
        FROM Jagers);

\echo /* Вывод роботов, которые уничтожили больше всех kaiju */
SELECT *
  FROM Jagers
 WHERE kaiju_kill =
    (SELECT MAX(kaiju_kill)
        FROM Jagers);

\echo /* Вывод среднего веса роботов */
SELECT AVG(weight) AS average_weight
  FROM Jagers;

\echo /* Увеличение на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены */
UPDATE Jagers 
   set kaiju_kill = kaiju_kill + 1
 WHERE status = 'Active';

\echo /* Удаление уничтоженных роботов */
DELETE
  FROM Jagers
 WHERE status = 'Destroyed';