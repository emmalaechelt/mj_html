const getMvList = (dt, ul) => {
    console.log("dt=", dt)
    const url = "https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=9e4f73295d0c907aed711b60e1dd3e6f&targetDt=" + dt;


        fetch(url)
            .then(resp => resp.json())
            .then(data => {
                const dailyBoxOfficeList = data.boxOfficeResult.dailyBoxOfficeList;
                console.log(dailyBoxOfficeList)
                const mvList = dailyBoxOfficeList.map((item) =>
                    `<li>
                <span class="spRank">${item.rank}</span>
                <span class="spMv">${item.movieNm}</span>
                </li>`
                );

                let tags = mvList.join('');
                ul.innerHTML = tags;
            })
            .catch(err => console.log(err))
            ;
        }

 document.addEventListener("DOMContentLoaded", () => {
            const ul = document.querySelector("main > ul");
            const dtIn = document.querySelector("#dt");

            dtIn.addEventListener("change", () => {
                getMvList(dtIn.value.replaceAll('-',''), ul);
            });
        });