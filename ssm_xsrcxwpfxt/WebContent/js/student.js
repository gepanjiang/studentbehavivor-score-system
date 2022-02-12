$(function() {

$("#username").blur(
		function() {
			$("#username_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#username").after("<span id='username_msg' style='color: red'>学号不能为空</span>");
			}
	});

$("#password").blur(
		function() {
			$("#password_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#password").after("<span id='password_msg' style='color: red'>密码不能为空</span>");
			}
	});

$("#realname").blur(
		function() {
			$("#realname_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#realname").after("<span id='realname_msg' style='color: red'>姓名不能为空</span>");
			}
	});

$("#birthday").blur(
		function() {
			$("#birthday_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#birthday").after("<span id='birthday_msg' style='color: red'>出生日期不能为空</span>");
			}
	});

$("#minzu").blur(
		function() {
			$("#minzu_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#minzu").after("<span id='minzu_msg' style='color: red'>民族不能为空</span>");
			}
	});

$("#jiguan").blur(
		function() {
			$("#jiguan_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#jiguan").after("<span id='jiguan_msg' style='color: red'>籍贯不能为空</span>");
			}
	});

$("#contact").blur(
		function() {
			$("#contact_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#contact").after("<span id='contact_msg' style='color: red'>联系方式不能为空</span>");
			}
	});

$("#address").blur(
		function() {
			$("#address_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#address").after("<span id='address_msg' style='color: red'>家庭住址不能为空</span>");
			}
	});

$("#clazzid").blur(
		function() {
			$("#clazzid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#clazzid").after("<span id='clazzid_msg' style='color: red'>班级不能为空</span>");
			}
	});

$("#memo").blur(
		function() {
			$("#memo_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
			}
	});







$('#sub').click(function(){
var username = $("#username").val();
var password = $("#password").val();
var realname = $("#realname").val();
var birthday = $("#birthday").val();
var minzu = $("#minzu").val();
var jiguan = $("#jiguan").val();
var contact = $("#contact").val();
var address = $("#address").val();
var clazzid = $("#clazzid").val();
var memo = $("#memo").val();
$("#username_msg").empty();
$("#password_msg").empty();
$("#realname_msg").empty();
$("#birthday_msg").empty();
$("#minzu_msg").empty();
$("#jiguan_msg").empty();
$("#contact_msg").empty();
$("#address_msg").empty();
$("#clazzid_msg").empty();
$("#memo_msg").empty();
if (username == "" || username == null) {
	$("#username").after("<span id='username_msg' style='color: red'>学号不能为空</span>");
	return false;
}
if (password == "" || password == null) {
	$("#password").after("<span id='password_msg' style='color: red'>密码不能为空</span>");
	return false;
}
if (realname == "" || realname == null) {
	$("#realname").after("<span id='realname_msg' style='color: red'>姓名不能为空</span>");
	return false;
}
if (birthday == "" || birthday == null) {
	$("#birthday").after("<span id='birthday_msg' style='color: red'>出生日期不能为空</span>");
	return false;
}
if (minzu == "" || minzu == null) {
	$("#minzu").after("<span id='minzu_msg' style='color: red'>民族不能为空</span>");
	return false;
}
if (jiguan == "" || jiguan == null) {
	$("#jiguan").after("<span id='jiguan_msg' style='color: red'>籍贯不能为空</span>");
	return false;
}
if (contact == "" || contact == null) {
	$("#contact").after("<span id='contact_msg' style='color: red'>联系方式不能为空</span>");
	return false;
}
if (address == "" || address == null) {
	$("#address").after("<span id='address_msg' style='color: red'>家庭住址不能为空</span>");
	return false;
}
if (clazzid == "" || clazzid == null) {
	$("#clazzid").after("<span id='clazzid_msg' style='color: red'>班级不能为空</span>");
	return false;
}
if (memo == "" || memo == null) {
	$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#username_msg").empty();
$("#password_msg").empty();
$("#realname_msg").empty();
$("#birthday_msg").empty();
$("#minzu_msg").empty();
$("#jiguan_msg").empty();
$("#contact_msg").empty();
$("#address_msg").empty();
$("#clazzid_msg").empty();
$("#memo_msg").empty();
});

});
