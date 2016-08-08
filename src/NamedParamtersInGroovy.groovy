/**
 * Created by geng on 2016/8/8.
 */
def someMethod(args) {
    assert args.firstname == "Jon"
    assert args.lastname == "Doe"
    assert args.age == 32
    assert args.size() == 3
}

someMethod(firstname: "Jon", lastname: "Doe", age: 32)