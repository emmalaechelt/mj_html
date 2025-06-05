//데이터 가져오기
const getData = (txt, content) => {
    const apiKey = ""
    const baseUrl = "https://apis.data.go.kr/B551011/PhotoGalleryService1/gallerySearchList1"
    let url = `${baseUrl}serviceKey=${apiKey}&numOfRows=10&pageNo=1&MobileOS=ETC&MobileApp=AppTest&arrange=A`;
    url = `${url}&_type=json$keyword=${txt.value}`;


    //data fetch
    fetch(url)
        .then(resp => resp.json())
    .then(data => {
        const items = data.response.body.items.item;
        let tags = items.map(item => `
            <div div class= "card" >
                <div class="cardImg">
                    <img src=${item.galWebImageUrl}/>
                </div>
            <div class="cardDiv">
                <span class="sp1">${item.galTitle}</span>
                <span class="sp2">${item.galPhotographyLocation}</span>
            </div>
            </div>
        `);

            tags = tags.join("") ;
            content.innerHTML = tags;
    })
    .catch(err => console.log(err));

console.log()("fetch...")
}

//DOM 생성시
document.addEventListener("DOMContentLoaded", () => {
    const txt = document.querySelector("#txt1");
    const bt1 = document.querySelector(".formDiv > button");
    const bt2 = document.querySelector(".formDiv > [type=reset]");
    const content = document.querySelector(".content");

    //취소
    bt2.addEventListener("click", () => {
        content.innerHTML = "";
    });

    //확인
    bt1.addEventListener("click", (e) => {
        e.preventDefault();

        if (txt.value == "") {
            alert("키워드를 입력하세요.");
            txt.focus();
            return;
        }

        getData(txt, content);
    });
});


























});


















const getPoto = () => {
    console.log("getPoto");
    const Api = "";
    let url = `https://apis.data.go.kr/B551011/PhotoGalleryService1/gallerySearchList1?serviceKey=YQCYf1nROOlYp%2Fok5Qg2U2hFTUmmW60PDcAVbZMvjPZazzRIVBZ7Dn4bJShrZtHM6NueaTQjav6zi36f%2BC2Mlg%3D%3D&numOfRows=10&pageNo=1&MobileOS=ETC&MobileApp=AppTest&arrange=A&keyword=부산역&_type=json`;
    const poster = document.querySelector(".photo");

    fetch(url)
        .then(resp => resp.json())
        .then(data => photo.innerHTML = `<img src="http://tong.visitkorea.or.kr/cms2/website/21/2928321.jpg${data.results[0].photo_path}" />`)
        .catch(err => console.log(err));
}
