$(function() {

$("#studentid").blur(
		function() {
			$("#studentid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#studentid").after("<span id='studentid_msg' style='color: red'>学生不能为空</span>");
			}
	});

$("#programsid").blur(
		function() {
			$("#programsid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#programsid").after("<span id='programsid_msg' style='color: red'>考核项目不能为空</span>");
			}
	});

$("#reason").blur(
		function() {
			$("#reason_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#reason").after("<span id='reason_msg' style='color: red'>原因不能为空</span>");
			}
	});

$("#num").blur(
		function() {
			$("#num_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#num").after("<span id='num_msg' style='color: red'>分数不能为空</span>");
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
var studentid = $("#studentid").val();
var programsid = $("#programsid").val();
var reason = $("#reason").val();
var num = $("#num").val();
var memo = $("#memo").val();
$("#studentid_msg").empty();
$("#programsid_msg").empty();
$("#reason_msg").empty();
$("#num_msg").empty();
$("#memo_msg").empty();
if (studentid == "" || studentid == null) {
	$("#studentid").after("<span id='studentid_msg' style='color: red'>学生不能为空</span>");
	return false;
}
if (programsid == "" || programsid == null) {
	$("#programsid").after("<span id='programsid_msg' style='color: red'>考核项目不能为空</span>");
	return false;
}
if (reason == "" || reason == null) {
	$("#reason").after("<span id='reason_msg' style='color: red'>原因不能为空</span>");
	return false;
}
if (num == "" || num == null) {
	$("#num").after("<span id='num_msg' style='color: red'>分数不能为空</span>");
	return false;
}
if (memo == "" || memo == null) {
	$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#studentid_msg").empty();
$("#programsid_msg").empty();
$("#reason_msg").empty();
$("#num_msg").empty();
$("#memo_msg").empty();
});

});
