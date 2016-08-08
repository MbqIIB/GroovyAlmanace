/**
 * Created by geng on 2016/8/8.
 */

class TimerTaskExample extends TimerTask {
    public void run() {
        println new Date()
    }
}

int numberOfMillisecondsInTheFuture = 1000 // 10 sec
Date timeToRun = new Date(System.currentTimeMillis() + numberOfMillisecondsInTheFuture)
Timer timer = new Timer()
timer.schedule(new TimerTaskExample(), timeToRun)