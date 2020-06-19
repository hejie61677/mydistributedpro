//获取单个职工对象
$("#get1").click(function () {
    var url = "helloGet1/00010001";
    $.get(
       url,
       function (data) {
           var staff = data;
           $("#message1").html("staff_no:"+staff.staff_no+",name:"+staff.name+",ac_no:"+staff.ac_no+",ac_name:"+staff.ac_name+",ac_br_name:"+staff.ac_br_name);
       }
    );
});

//获取多个职工对象
$("#get2").click(function () {
    var url = "helloGet2/0/100";
    $.get(
        url,
        function (data) {
            var staffs = data;
            for (var i in staffs) {
                var staff = staffs[i];
                var old = $("#message2").html();
                $("#message2").html(old + "<br> staff_no:"+staff.staff_no+",name:"+staff.name+",ac_no:"+staff.ac_no+",ac_name:"+staff.ac_name+",ac_br_name:"+staff.ac_br_name);
            }

        }
    );
});

//获取浏览器相关信息
$("#get3").click(function () {
    //浏览器的代码名
    var appCodeName = navigator.appCodeName;
    //浏览器的名称
    var appName = navigator.appName;
    //浏览器的平台和版本信息
    var appVersion = navigator.appVersion;
    //浏览器中是否启用 cookie 的布尔值
    var cookieEnabled = navigator.cookieEnabled;
    //运行浏览器的操作系统平台
    var platform = navigator.platform;
    $("#message3").html("appCodeName:"+appCodeName+"<br>appName:"+appName+"<br>appVersion:"+appVersion+"<br>cookieEnabled:"+cookieEnabled+"<br>platform:"+platform);
});