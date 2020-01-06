
$(function () {
           $(".name").blur(function () {
               $(".formtips").remove();
                if($(this).val()==""){
                    $(this).after("<span class='formtips'>*姓名不能为空</span>")
                }else{
                    return;
                }
           });
            $(".phone").blur(function () {
                $(".formtips1").remove();
                if($(this).val()=="" || $(this).val().length!=11){
                    $(this).after("<span class='formtips1'>*请输入正确的手机号</span>")
                }else{
                    return;
                }
            });
            $(".company").blur(function () {
                $(".formtips2").remove();
                if($(this).val()==""){
                    $(this).after("<span class='formtips2'>*公司不能为空</span>")
                }else{
                    return;
                }
            });
            $(".address").blur(function () {
                $(".formtips3").remove();
                if($(this).val()==""){
                    $(this).after("<span class='formtips3'>*地址不能为空</span>")
                }else{
                    return;
                }
            });
            $(".e_mail").blur(function () {
                $(".formtips4").remove();
                if($(this).val()==""){
                    $(this).after("<span class='formtips4'>*邮箱不能为空</span>")
                }else{
                    return;
                }
            });
            $(".relation").blur(function () {
                $(".formtips5").remove();
                if($(this).val()==""){
                    $(this).after("<span class='formtips5'>*关系不能为空</span>")
                }else{
                    return;
                }
            });
            $(".upload").blur(function () {
                $(".formtips6").remove();
                if($(this).val()==""){
                    $(this).after("<span class='formtips6'>*请上传图片</span>")
                }else{
                    return;
                }
            });
            $(".input_submit").click(function () {
                var name=$(".name").val()
                var phone=$(".phone").val()
                var image=$(".upload").val()
                var company=$(".company").val()
                var e_mail=$(".e_mail").val()
                var address=$(".address").val()
                var relation=$(".relation").val()
                if(name==""||phone==""||image==""||company==""||e_mail==""||address==""||relation==""){
                    alert("上传失败")
                }else{
                    $(this).prop("type","submit")
                }
            });
        });