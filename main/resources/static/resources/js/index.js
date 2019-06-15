var app=(()=> {

    let init=()=>{
        main();
    }
    let main=()=>{
        let wrapper=document.getElementById('wrapper');

        wrapper.innerHTML="<h1>메인페이지</h1>"
        +'<div>여긴 처음 페이지입니다</div>'
        +'<button id="count-btn" value="카운터">카운터</button>'
        +'<button id="change-btn" value="바꾸기">바꾸기</button>'

        let count_btn = document.getElementById('count-btn');
        count_btn.addEventListener('click', ()=>{
            alert('안녕');
            count();
        });
    }
    let count=()=>{
        var xhr=new XMLHttpRequest();
        method= 'GET';
        url= 'count';
        xhr.open(method, url, true);
        xhr.onreadystatechange=()=>{
            if(xhr.readyState===4&&xhr.status===200){
                let wrapper = document.getElementById('wrapper');
                wrapper.innerHTML =  '총 고객수 <h1>' + xhr.responseText+'</h1>'
                alert('안녕하세요');
            }
            alert('완료');
        }
        xhr.send();
    }
    return{
        init:init  // 클로저 (키(이름)값:벨류(속성)값)   -> 스코프인데, 쉽게 클로저로 설명 
    };

})();

// 외부함수와 내부함수가 있을 떄, 외부함수의 실행으로 return값을 만나서 함수가 종료된 상태지만 
// return값의 내부함수의 유효범위(스코프)로 인해 접근할 수 있는 상태