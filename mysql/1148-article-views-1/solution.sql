# Write your MySQL query statement below
SELECT DISTINCT views.author_id AS 'id'
FROM views
WHERE views.viewer_id = views.author_id
ORDER BY views.viewer_id ASC;
