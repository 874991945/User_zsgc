<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
</head>
<script>
    window.onload = function (ev) {
        $.ajax({
            url: "/province",
            type: "get",
            data: "",
            dataType: "json",
            success: function (data) {
                var html = '<option value="-1">请选择</option>';
                for (var i = 0; i < data.length; i++) {
                    //动态拼接
                    html += '<option value="' + data[i].id + '">' + data[i].name + '</option>';
                }
                $("#province").append(html);
            }
        });
    };

    function setCity() {
        $("#city").empty();
        var p_id;

        //获取选中省的value，即省的id
        var children = $("#province").children();
        for (var i = 0; i < children.length; i++) {
            if ($(children[i]).prop("selected")) {
                p_id = $(children[i]).attr("value");
            }
        }

        //如果省选择 请选择，则直接return
        if (p_id == -1) {
            return;
        }

        $.ajax({
            url: "/city",
            type: "get",
            data: {"id": p_id},
            dataType: "json",
            success: function (data) {
                var html = '<option value="-1">请选择</option>';
                for (var i = 0; i < data.length; i++) {
                    html += '<option value="' + data[i].id + '">' + data[i].name + '</option>';
                }
                $("#city").append(html);
            }
        });

    }
</script>
<body>
请选择省：
<select id="province" onchange="setCity()">

</select><br><br>

请选择市：
<select id="city">

</select><br><br>
</body>
</html>
