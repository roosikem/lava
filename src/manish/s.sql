SELECT * FROM temp_users a WHERE rowid = (SELECT MAX(rowid) FROM temp_users b WHERE a.password=b.password);
SELECT * FROM temp_users a WHERE rowid != (SELECT MAX(rowid) FROM temp_users b WHERE a.password=b.password);

SELECT username, marks from temp_users where marks > (SELECT AVG(marks) from temp_users);
SELECT e.username, m.username FROM temp_users e, temp_users m WHERE e.mgr_id = m.user_id;

SELECT W.username
FROM temp_users W
    INNER JOIN temp_users Bosses ON w.mgr_id = Bosses.user_id
        AND Bosses.marks < W.marks;
      
select * from temp_users e, (select g.marks from temp_users g inner join temp_users b on g.user_id = b.mgr_id) obj on e.marks > obj;

select g.marks from temp_users g inner join temp_users b on g.user_id = b.mgr_id;

select * from temp_users where user_id not in (select mgr_id from temp_users where mgr_id is not null) minus
select * from temp_users where marks<(select min(g.marks) from temp_users g inner join temp_users b on g.user_id = b.mgr_id);
