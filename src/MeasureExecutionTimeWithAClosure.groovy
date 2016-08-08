/**
 * Created by geng on 2016/8/8.
 */
def benchmark = { closure ->
    start = System.currentTimeMillis()
    closure.call()
    now = System.currentTimeMillis()
    now - start
}

def duration = benchmark {
    (0..10000).inject(0) { sum, item -> sum + item }
}

println("execution took ${duration} ms")