let submit = document.querySelector('.publish');
submit.onclick = function() {
    let title = document.querySelector('.title');
    let content = document.querySelector('.content');
    if(title.value.trim() == ""){
        alert('当前文章标题为空,请输入!');
        title.focus();
        return;
    }
    if(content.value.trim() == ""){
        alert('当前文章内容为空,请输入!');
        content.focus();
        return;
    }
    $.ajax({
        url: "edit",
        method: "POST",
        data: JSON.stringify({title: title.value.trim(), content: content.value.trim()}),
        contentType: "application/json;charset=utf-8",
        success: function(data,status) {
            location.assign('home.jsp');
        }
    })
}
