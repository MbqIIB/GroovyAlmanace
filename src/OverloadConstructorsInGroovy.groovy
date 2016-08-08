/**
 * Created by geng on 2016/8/8.
 */
class Employee {
    String firstname
    String lastname
}

def employee = new Employee(firstname: "John", lastname: "Doe")
println employee.firstname
println employee.lastname