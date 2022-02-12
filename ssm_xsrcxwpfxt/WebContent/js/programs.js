$(function() {

$("#title").blur(
		function() {
			$("#title_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#title").after("<span id='title_msg' style='color: red'>标题不能为空</span>");
			}
	});

$("#contents").blur(
		function() {
			$("#contents_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#contents").after("<span id='contents_msg' style='color: red'>内容不能为空</span>");
			}
	});

$("#standards").blur(
		function() {
			$("#standards_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#standards").after("<span id='standards_msg' style='color: red'>评分标准不能为空</span>");
			}
	});

$("#weights").blur(
		function() {
			$("#weights_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#weights").after("<span id='weights_msg' style='color: red'>权重不能为空</span>");
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
var title = $("#title").val();
var contents = $("#contents").val();
var standards = $("#standards").val();
var weights = $("#weights").val();
var memo = $("#memo").val();
$("#title_msg").empty();
$("#contents_msg").empty();
$("#standards_msg").empty();
$("#weights_msg").empty();
$("#memo_msg").empty();
if (title == "" || title == null) {
	$("#title").after("<span id='title_msg' style='color: red'>标题不能为空</span>");
	return false;
}
if (contents == "" || contents == null) {
	$("#contents").after("<span id='contents_msg' style='color: red'>内容不能为空</span>");
	return false;
}
if (standards == "" || standards == null) {
	$("#standards").after("<span id='standards_msg' style='color: red'>评分标准不能为空</span>");
	return false;
}
if (weights == "" || weights == null) {
	$("#weights").after("<span id='weights_msg' style='color: red'>权重不能为空</span>");
	return false;
}
if (memo == "" || memo == null) {
	$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#title_msg").empty();
$("#contents_msg").empty();
$("#standards_msg").empty();
$("#weights_msg").empty();
$("#memo_msg").empty();
});

});
