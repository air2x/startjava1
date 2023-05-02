
\echo /* ����� ���� �������*/
SELECT * 
  FROM Jagers;

\echo /* ����� ������ �� ������������ ������� */
SELECT * 
  FROM Jagers
 WHERE status = 'Active';

\echo /* ����� ������� ����� : Mark-1 � Mark-4 */
SELECT * 
  FROM Jagers
 WHERE mark IN('Mark-1', 'Mark-4');

\echo /* ����� ���� �������, ����� Mark-1 � Mark-4 */
SELECT * 
  FROM Jagers
 WHERE mark NOT IN('Mark-1', 'Mark-4');

\echo /* ���������� ������� �� �������� �� ������� mark */
SELECT * 
  FROM Jagers
 ORDER BY mark DESC;

\echo /* ����� ���������� � ����� ������ ������ */
SELECT * 
  FROM Jagers
 WHERE launch =
    (SELECT MIN(launch)
        FROM Jagers);

\echo /* ����� �������, ������� ���������� ������ ���� kaiju */
SELECT *
  FROM Jagers
 WHERE kaiju_kill =
    (SELECT MAX(kaiju_kill)
        FROM Jagers);

\echo /* ����� �������� ���� ������� */
SELECT AVG(weight) AS average_weight
  FROM Jagers;

\echo /* ���������� �� ������� ���������� ������������ kaiju � �������, ������� �� ��� ��� �� ��������� */
UPDATE Jagers 
   set kaiju_kill = kaiju_kill + 1
 WHERE status = 'Active';

\echo /* �������� ������������ ������� */
DELETE
  FROM Jagers
 WHERE status = 'Destroyed';