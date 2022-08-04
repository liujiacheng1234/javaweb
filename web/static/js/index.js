
    $.ajax({
    url: "index",
    method: "GET",
    success: function(data,status) {
    buildBlogs(data);
    console.log('ssss')
}
})

    function buildBlogs(blogs){
    let rightDiv = document.querySelector('.right');
    for(let blog of blogs){
    let blogDiv = document.createElement('div');
    blogDiv.className = 'article';
    // 创建 title
    let h2 = document.createElement('h2');
    h2.className = 'title';
    h2.innerHTML = blog.title;
    blogDiv.appendChild(h2);
    // 创建 postTime
    let postTime = document.createElement('span');
    postTime.className = 'date';
    postTime.innerHTML = DateFormat(blog.postTime);
    blogDiv.appendChild(postTime);
    // 创建 content
    let content = document.createElement('div');
    content.className = 'desc';
    content.innerHTML = blog.content;
    blogDiv.appendChild(content);
    // 创建 详情页的超链接
    let detailA = document.createElement('a');
    detailA.className = 'more';
    detailA.href = 'art.html?blogId=' + blog.blogId;
    detailA.innerHTML = '查看全文&gt;&gt;';
    blogDiv.appendChild(detailA);
    // 加入到 right 中
    rightDiv.appendChild(blogDiv);
}
}

    // 把毫秒级时间戳转化成格式化日期
    function DateFormat(timeStampMS) {
    var date = new Date(timeStampMS);

    var year = date.getFullYear(),
    month = date.getMonth()+1,//月份是从0开始的
    day = date.getDate(),
    hour = date.getHours(),
    min = date.getMinutes(),
    sec = date.getSeconds();
    var newTime = year + '-' +
    (month < 10? '0' + month : month) + '-' +
    (day < 10? '0' + day : day) + ' ' +
    (hour < 10? '0' + hour : hour) + ':' +
    (min < 10? '0' + min : min) + ':' +
    (sec < 10? '0' + sec : sec);

    return newTime;
}
