// select 박스값이 변경되면 호출
const selChange = (s1, s2, l1, l2, t1, t2) => {
if(s1.value == "℃") s2.value ="℉";
else s2.value = "℃";
// label의 값을 변경
ll.innerHTML = s1.value;
l2.innerHTML = s2.value;
// input 값 초기화
txt1.value = "";
txt2.value = "";
txt1.focus();
}

// DOM이 생성된 후에 
document.addEventListener("DOMContentLoaded", ()=>{
// DOM 요소 가져오기
//select
const sel1 = document.querySelector("#sel1");
const sel2 = document.getElementsByID("sel2");

// input
const txt1 = document.querySelector("input");
const txt2 = document.querySelector("[readonly]");

// label
const lab1 = document.querySelector("[for = txt1]")
const lab2 = document.querySelector("[for = txt2]")

// 2. selet값이 변경될 때
sel1.addEventListener('change', ()=>{
    selChange(sel1, sel2, lab1, lab2, txt1, txt2);
});

sel2.addEventListener('change', ()=>{
    selChange(sel2, sel1, lab1, lab1, txt1, txt2);
});

// 3. input 요소에 값이 입력될 때
txt1.addEventListener("input", ()=>{
    if(sel1.value =="℃") {
        //℃ -> ℉
        txt2.value = parseFloat((txt1.value *(9/5)) + 32).toFixed(4);
    } else {
        // ℉ -> ℃
        txt2.value = parseFloat((txt1.value - 32) * (5/9)).toFixed(4);
    }
});
});
// // sel2의 값을 변경
// if(sel1.value == "℃") sel1.value ="℉";
// else sel2.value = "℃";
// // label의 값을 변경
// label.innerHTML = sel1.value;
// labe2.innerHTML = sle2.value;
// // input 값 초기화
// txt1.value = "";
// txt2.value = "";
// txt1.focus();

// sel2.addEventListener("change", ()=>{
//     if(sel2.value == "ㄹ") sel2.value = ""
//     lse sel2.value = "℃";
// // label의 값을 변경
// label.innerHTML = sel1.value;
// labe2.innerHTML = sle2.value;
// // input 값 초기화
// txt1.value = "";
// txt2.value = "";
// txt1.focus();
// })
