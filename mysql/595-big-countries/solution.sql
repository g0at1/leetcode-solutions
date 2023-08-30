# Write your MySQL query statement below
SELECT world.name, world.population, world.area
FROM world
WHERE world.area >= 3000000 OR world.population >= 25000000;
