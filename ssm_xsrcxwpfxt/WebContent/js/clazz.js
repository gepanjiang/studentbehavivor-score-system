$(function() {

$("#clazzname").blur(
		function() {
			$("#clazzname_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#clazzname").after("<span id='clazzname_msg' style='color: red'>班级名称不能为空</span>");
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
var clazzname = $("#clazzname").val();
var memo = $("#memo").val();
$("#clazzname_msg").empty();
$("#memo_msg").empty();
if (clazzname == "" || clazzname == null) {
	$("#clazzname").after("<span id='clazzname_msg' style='color: red'>班级名称不能为空</span>");
	return false;
}
if (memo == "" || memo == null) {
	$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#clazzname_msg").empty();
$("#memo_msg").empty();
});

});
