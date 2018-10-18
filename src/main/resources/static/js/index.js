$(function() {
    setInterval(function() {
        var hour = new Date().getHours();
        var minute = new Date().getMinutes();
        var second = new Date().getSeconds();
        var today = new Date().getDay();
        var week = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"); 

        if (hour < 10) {
            hour = "0" + hour;
        }

        if (minute < 10) {
            minute = "0" + minute;
        }

        if (second < 10) {
            second = "0" + second;
        }

        $("#span_time").text(hour + "时" + minute + "分" + second + "秒" + " " + week[today]);
    });

    $(".a-navigation").click(function() {
        $(this).parent().parent().children().removeClass("active");
        $(this).parent().addClass("active");
    });

    var cookie = document.cookie + ";";
    var cookieUsername = cookie.substring(cookie.indexOf("=", cookie.indexOf("cookieUsername")) + 1, cookie.indexOf(";", cookie.indexOf("cookieUsername")));
    var cookiePassword = cookie.substring(cookie.indexOf("=", cookie.indexOf("cookiePassword")) + 1, cookie.indexOf(";", cookie.indexOf("cookiePassword")));

    if (cookieUsername && cookiePassword) {
        $("#input_username").val(cookieUsername);
        $("#input_password").val(cookiePassword);
        $("#input_remember").prop("checked", true);
    } else {
        $("#input_username").val("");
        $("#input_password").val("");
        $("#input_remember").prop("checked", false);
    }

    $("#input_login").click(function() {
        var isSubmit = true;
        
        if (!$("#input_username").val()) {
            isSubmit = false;
            alert("用户名不能为空！");
        }

        if (!$("#input_password").val()) {
            isSubmit = false;
            alert("密码不能为空！");
        }

        if (isSubmit) {
            $.post("/user/login", {
                username: $("#input_username").val(),
                password: $("#input_password").val(),
                remember: $("#input_remember").is(":checked")
            }, function(data, status) {
                if ("string" == typeof(data)) {
                    if ("success" == data) {
                        window.location.href = "/index/index";
                    } else {
                        alert(data);
                    }
                } else {
                    if (data.usernameIsEmpty != null) {
                        alert(data.usernameIsEmpty);
                    }

                    if (data.passwordIsEmpty != null) {
                        alert(data.passwordIsEmpty);
                    }
                }
            });
        }
    });
});
