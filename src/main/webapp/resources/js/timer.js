function dateFomart(date) {

    var datetime = date.getFullYear()
        + "-"// "年"
        + ((date.getMonth() + 1) > 10 ? (date.getMonth() + 1) : ("0" + (date.getMonth() + 1)))
        + "-"// "月"
        + ((date.getDate()) >= 10 ? (date.getDate()) : ("0" + date.getDate()))
        + " "
        + ((date.getHours()) >= 10 ? (date.getHours()) : ("0" + date.getHours()))
        + ":"
        + ((date.getMinutes()) >= 10 ? (date.getMinutes()) : ("0" + date.getMinutes()));
    return datetime;
}

function timer() {
    var date = new Date() ;
    var time = date.getTime() + (4 * 3600 * 1000) ;
    var dateFourLater = new Date(time) ;


    return dateFomart(dateFourLater) ;
}
var times = timer() ;
//$.alert(times) ;
$("#datetime-picker").val(times) ;
$("#datetime-picker").datetimePicker({
    min : times
});