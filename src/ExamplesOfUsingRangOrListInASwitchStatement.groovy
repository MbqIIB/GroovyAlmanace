/**
 * Created by geng on 2016/8/8.
 */
// This are two examples of using ranges in switch statements.
def rating = 7
def feedback = ''
switch (rating) {
    case 1..3:
        feedback = 'good'
        break
    case 3..6:
        feedback = 'medium'
        break
    case 6..9:
        feedback = 'poor'
        break
    default:
        feedback = 'unknown'
}

//def rating = 4
//def feedback = ''
switch (rating) {
    case [1,2,3]:
        feedback = 'good'
        break
    case [4,5,6]:
        feedback = 'medium'
        break
    case [7,8,9]:
        feedback = 'poor'
        break
    default:
        feedback = ''
}
