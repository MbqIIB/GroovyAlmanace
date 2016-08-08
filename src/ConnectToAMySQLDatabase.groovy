import groovy.sql.Sql

/**
 * Created by geng on 2016/8/8.
 */
def sql = Sql.newInstance('jdbc:mysql://localhost:3306/test', 'root', '', 'com.mysql.jdbc.Driver')
sql.eachRow('show tables') { row ->
    println row[0]
}