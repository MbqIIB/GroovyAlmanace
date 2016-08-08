/**
 * Created by geng on 2016/8/8.
 */
try {
    assert 1 == 2: "one != two"
} catch (AssertionError e) {
    println e.getMessage()
}
// one != two. Expression: (1 == 2)