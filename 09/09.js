document.addEventListener("DOMContentLoaded", ()=>{
// 요소 가져오기
const img = document.querySelector(".mdiv > img");
const txt1 = document.querySelector("#txt1");
const bt = document.querySelector(".mdiv > button");
const bt2 = document.querySelector("#btArea > button");
const btInput = document.querySelector("#btInput");
const btArea = document.querySelector("#btArea");

// flag 변수
let flag = false;
let n;

// 다시하기 영역 보이지 않도록 초기화
btArea.style.display = 'none';

// 확인 버튼 눌러지면
bt.addEventListener("click",()=>{
// 1. flag가 false이면 랜덤수 n 생성하고 flag true로 변경
if(!flag) {
    n = Math.floor(Math.random() * 100) + 1; // 1~100
    flag = true;
}
if(!txt1.value){
    alert("숫자를 입력하세요.");
    txt1.focus();
    return;
}
// 2. input에 입력한 값과 랜덤수 n을 비교
// 2-1. n보다 입력수가 크면 다운 이미지 보이기
if(txt1.value > n) {
    img. setAttribute("src", "../img/down.png");
    // 2-2. n보다 입력수가 크면 업 이미지 보이기    
} else if(txt1.value < n) {
    img. setAttribute("src", "../img/up.png");
    // 2-3. n보다 입력수가 같으면 good 이미지 보이기, flag false, 다시하기 버튼 보이기
} else {
    img. setAttribute("src", "../img/good.png");
    btInput.style.display = "none";
    btArea.style.display = 'block';
}
// 다시하기 버튼이 눌러지면 
// 1. flag값을 false로 만들기
// 2. input과 확인버튼 보여지기
bt.addEventListener("click",()=>{

})
    
// 3. img는 what
// 4. 초기화

});
});