const yesterday = () => {
    let yesterday = new Date();
    yesterday.setDate(yesterday.getDate() - 1); //어제 날짜

    return yesterday.toISOString().slice(0, 10);
}
const getPoster = (mvNM) => {
    console.log("getPoster", mvNM);
    const tmdbApi = "b42483d9af611184a5e87b9980e11075";
    let url = ``
    const poster = document.querySelector(".poster");
    
    fetch(url)
        .then(resp => resp.json())
        .then(data => poster.innerHTML = `<img src="https://image.tmdb.org/t/p/w500${data.results[0].poster_path}" />`)
        .catch(err => console.log(err)); 
}   

const getMvList = (dt, ul, r) => {
    console.log("dt=", dt)
    const apikey = ""
    let url = `https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=${dt}`;

    if (r == "r2") {
        url = `${url}&multiMovieYn=Y`
    } else if (r == "r3") {
        url = `${url}&multiMovieYn=N`
    }

    fetch(url)
        .then(resp => resp.json())
        .then(data => {
            const dailyBoxOfficeList = data.boxOfficeResult.dailyBoxOfficeList;
            console.log(dailyBoxOfficeList)
            const mvList = dailyBoxOfficeList.map((item) => {
                const mv = encodeURIComponent(item.movieNM);
                return `<li onClick=getPoster("${mv}")>
                <span class="spRank">${item.rank}</span>
                <span class="spMv">${item.movieNm}</span>
       
               </li>`} 
            );

            let tags = mvList.join('');
            ul.innerHTML = tags;
        })
        .catch(err => console.log(err))
        ;
}

document.addEventListener("DOMContentLoaded", () => {
    const ul = document.querySelector(".mvul");
    const dtIn = document.querySelector("#dt");
    const bt = document.querySelector(".divRadio > button")
    dtIn.setAttribute("max", yesterday());

    dtIn.value = yesterday();
    getMvList(dtIn.value.replaceAll('-', ''), ul);
    console.log(yesterday())

    dtIn.addEventListener("change", () => {
        getMvList(dtIn.value.replaceAll('-', ''), ul, "");
    });

    bt.addEventListener("click", (e) => {
        e.preventDefault();

        const rVal = document.querySelector("[type=radio]:checked").value;
        document.querySelector(".poster").innerHTML = "";
        console.log(rVal);
        getMvList(dtIn.value.replaceAll('-', ''), ul, rVal)
    })

});

http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=9e4f73295d0c907aed711b60e1dd3e6f&targetDt=20250601

//                 ${parseInt(item.rankInten)} > 0
//                     ? '<span calss="spR"><i class="fa-solid fa-arrow-up"></i> + Math.abs(item.rankInten) + "</span>"
//                     : parseInt(item.rankInten) < 0 
//                         ? '<span class="spB"><i class="fa-solid fa-arrow-down"></i>' + Math.abs(item.rankInten) + "</span>" 
//                         : '<i class="fa-solid fa-minus sp"></i>'
