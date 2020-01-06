/**
 * 
 */
 $(function () {
            $(".nav1>li").click(function () {
                $(this).addClass("l1");
                $(this).siblings().removeClass("l1");
                var index=$(this).index();
                var $li=$(".nav2>li").eq(index);
                $li.siblings().removeClass("div1");
                $li.addClass("div1");
            });

            $(".input_username").blur(function () {
                $(".formtips3").remove();
                if($(this).val()!="" ){
                    return
                }else{
                    $(this).after("<span class='formtips3'>*用户名不能为空</span>")
                }
            });
            $(".input_password").blur(function () {
                $(".formtips4").remove();
                if($(this).val()!="" ){
                    return
                }else{
                    $(this).after("<span class='formtips4'>*密码不能为空</span>")
                }
            });
            $(".input_submit").click(function () {
               var username=$(".input_username").val()
                var password=$(".input_password").val()
                if(username =="" || password ==""){
                    alert("登录失败")
                }else{
                    $(this).prop("type","submit")
                }
            });
        });