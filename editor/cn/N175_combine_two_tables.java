// 组合两个表 2022-02-07 15:41:15

//表1: Person 
//
// +-------------+---------+
//| 列名         | 类型     |
//+-------------+---------+
//| PersonId    | int     |
//| FirstName   | varchar |
//| LastName    | varchar |
//+-------------+---------+
//PersonId 是上表主键
// 
//
// 表2: Address 
//
// +-------------+---------+
//| 列名         | 类型    |
//+-------------+---------+
//| AddressId   | int     |
//| PersonId    | int     |
//| City        | varchar |
//| State       | varchar |
//+-------------+---------+
//AddressId 是上表主键
// 
//
// 
//
// 编写一个 SQL 查询，满足条件：无论 person 是否有地址信息，都需要基于上述两表提供 person 的以下信息： 
//
// 
//
// FirstName, LastName, City, State
// 
// Related Topics 数据库 
// 👍 1023 👎 0


//There is no code of Java type for this problem

select p.FirstName as FirstName, p.LastName as LastName, a.City as City, a.State as State
        from Person as p
        left join Address as a on p.PersonId = a.PersonId;