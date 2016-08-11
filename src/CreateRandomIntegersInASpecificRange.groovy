/**
 * Created by geng on 2016/8/9.
 */

Random rand = new Random()
int max = 10
def randomIntegerList = []
(1..10).each {
    randomIntegerList << rand.nextInt(max + 1)
}