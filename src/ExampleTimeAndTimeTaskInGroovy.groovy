/**
 * Created by geng on 2016/8/8.
 */

int delay = 5000   // delay for 5 sec.
int period = 1000  // repeat every sec.
Timer timer = new Timer()
timer.scheduleAtFixedRate(new TimerTaskExample(), delay, period)
