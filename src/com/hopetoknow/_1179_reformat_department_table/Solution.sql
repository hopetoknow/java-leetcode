--MS SQL Server | MySQL
SELECT
    id,
    SUM(
        CASE
            WHEN month = 'Jan' THEN revenue
        END
    ) AS Jan_Revenue,
    SUM(
        CASE
            WHEN month = 'Feb' THEN revenue
        END
    ) AS Feb_Revenue,
    SUM(
        CASE
            WHEN month = 'Mar' THEN revenue
        END
    ) AS Mar_Revenue,
    SUM(
        CASE
            WHEN month = 'Apr' THEN revenue
        END
    ) AS Apr_Revenue,
    SUM(
        CASE
            WHEN month = 'May' THEN revenue
        END
    ) AS May_Revenue,
    SUM(
        CASE
            WHEN month = 'Jun' THEN revenue
        END
    ) AS Jun_Revenue,
    SUM(
        CASE
            WHEN month = 'Jul' THEN revenue
        END
    ) AS Jul_Revenue,
    SUM(
        CASE
            WHEN month = 'Aug' THEN revenue
        END
    ) AS Aug_Revenue,
    SUM(
        CASE
            WHEN month = 'Sep' THEN revenue
        END
    ) AS Sep_Revenue,
    SUM(
        CASE
            WHEN month = 'Oct' THEN revenue
        END
    ) AS Oct_Revenue,
    SUM(
        CASE
            WHEN month = 'Nov' THEN revenue
        END
    ) AS Nov_Revenue,
    SUM(
        CASE
            WHEN month = 'Dec' THEN revenue
        END
    ) AS Dec_Revenue
FROM Department
GROUP BY id

--MS SQL Server (second solution) | MySQL (second solution)
SELECT
    DISTINCT d.id,
    d_jan.revenue AS Jan_Revenue,
    d_feb.revenue AS Feb_Revenue,
    d_mar.revenue AS Mar_Revenue,
    d_apr.revenue AS Apr_Revenue,
    d_may.revenue AS May_Revenue,
    d_jun.revenue AS Jun_Revenue,
    d_jul.revenue AS Jul_Revenue,
    d_aug.revenue AS Aug_Revenue,
    d_sep.revenue AS Sep_Revenue,
    d_oct.revenue AS Oct_Revenue,
    d_nov.revenue AS Nov_Revenue,
    d_dec.revenue AS Dec_Revenue
FROM Department AS d
LEFT JOIN Department AS d_jan ON d.id = d_jan.id AND d_jan.month = 'Jan'
LEFT JOIN Department AS d_feb ON d.id = d_feb.id AND d_feb.month = 'Feb'
LEFT JOIN Department AS d_mar ON d.id = d_mar.id AND d_mar.month = 'Mar'
LEFT JOIN Department AS d_apr ON d.id = d_apr.id AND d_apr.month = 'Apr'
LEFT JOIN Department AS d_may ON d.id = d_may.id AND d_may.month = 'May'
LEFT JOIN Department AS d_jun ON d.id = d_jun.id AND d_jun.month = 'Jun'
LEFT JOIN Department AS d_jul ON d.id = d_jul.id AND d_jul.month = 'Jul'
LEFT JOIN Department AS d_aug ON d.id = d_aug.id AND d_aug.month = 'Aug'
LEFT JOIN Department AS d_sep ON d.id = d_sep.id AND d_sep.month = 'Sep'
LEFT JOIN Department AS d_oct ON d.id = d_oct.id AND d_oct.month = 'Oct'
LEFT JOIN Department AS d_nov ON d.id = d_nov.id AND d_nov.month = 'Nov'
LEFT JOIN Department AS d_dec ON d.id = d_dec.id AND d_dec.month = 'Dec'
