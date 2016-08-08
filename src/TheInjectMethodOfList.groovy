/**
 * Created by geng on 2016/8/8.
 */
def list = [1, 2, 3]
def sum = list.inject(0) {
    sum, item -> sum + item
}
println("sum: ${sum}")
list = [1, 2, 3, 4, 5, 6]
total = list.inject(0) {
    total, item -> total + (item % 2 == 0 ? item : 0)
}
println("total: ${total}")