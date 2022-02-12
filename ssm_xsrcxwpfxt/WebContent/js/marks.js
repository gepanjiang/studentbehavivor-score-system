$(function() {

$("#studentid").blur(
		function() {
			$("#studentid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#studentid").after("<span id='studentid_msg' style='color: red'>学生不能为空</span>");
			}
	});

$("#score").blur(
		function() {
			$("#score_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#score").after("<span id='score_msg' style='color: red'>考核成绩不能为空</span>");
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
var score = $("#score").val();
var memo = $("#memo").val();
$("#studentid_msg").empty();
$("#score_msg").empty();
$("#memo_msg").empty();
if (studentid == "" || studentid == null) {
	$("#studentid").after("<span id='studentid_msg' style='color: red'>学生不能为空</span>");
	return false;
}
if (score == "" || score == null) {
	$("#score").after("<span id='score_msg' style='color: red'>考核成绩不能为空</span>");
	return false;
}
if (memo == "" || memo == null) {
	$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#studentid_msg").empty();
$("#score_msg").empty();
$("#memo_msg").empty();
});

});
