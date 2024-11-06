async function fetchPestData() {
    const locNick = document.getElementById("locNickDropdown").value;
    const locNickElement = document.getElementById("locNick");
    
    if (locNick && locNickElement) {
        // 선택한 locNick 값을 id가 locNick인 <p> 태그에 표시
        locNickElement.innerText = locNick;
        //TempPest데이터를 패치함
        const response = await fetch(`/getPestData?locNick=${locNick}`);
        const data = await response.json();
        populatePestTable(data);
     	// Fetch companies data
        const companyResponse = await fetch(`/getCompanies?locNick=${locNick}`);
        const companyData = await companyResponse.json();
        populateCompanyTable(companyData);
    }
}

function getColorClass(value) {
    switch (value) {
        case 1: return "green";
        case 2: return "yellow";
        case 3: return "orange";
        case 4: return "red";
        case 5: return "gray";
        default: return "gray"; // 기본 색상
    }
}

function populatePestTable(data) {
	
    const table = document.getElementById("tempestTable");
    table.innerHTML = "";  // 기존 테이블 내용 초기화
    data.forEach(row => {
        table.innerHTML += `
        <tr>
	    	<td rowspan="6">병 피해</td>
	        <td>검은무늬병</td>
	        <td><span class="circle ${getColorClass(row.검은무늬병)}"></span></td>
	        <td>뒷면흰가루병</td>
	        <td><span class="circle ${getColorClass(row.뒷면흰가루병)}"></span></td>
	        <td>줄기마름병</td>
	        <td><span class="circle ${getColorClass(row.줄기마름병)}"></span></td>
	    </tr>
	    <tr>
	        <td>검은별무늬병</td>
	        <td><span class="circle ${getColorClass(row.검은별무늬병)}"></span></td>
	        <td>배갈색썩음병</td>
	        <td><span class="circle ${getColorClass(row.배갈색썩음병)}"></span></td>
	        <td>탄저병</td>
	        <td><span class="circle ${getColorClass(row.탄저병)}"></span></td>
	    </tr>
	    <tr>
	        <td>겹무늬병</td>
	        <td><span class="circle ${getColorClass(row.겹무늬병)}"></span></td>
	        <td>붉은가지마름병</td>
	        <td><span class="circle ${getColorClass(row.붉은가지마름병)}"></span></td>
	        <td>푸른곰팡이병</td>
	        <td><span class="circle ${getColorClass(row.푸른곰팡이병)}"></span></td>
	    </tr>
	    <tr>
	        <td>과수화상병</td>
	        <td><span class="circle ${getColorClass(row.과수화상병)}"></span></td>
	        <td>붉은별무늬병</td>
	        <td><span class="circle ${getColorClass(row.붉은별무늬병)}"></span></td>
	        <td>흰가루병</td>
	        <td><span class="circle ${getColorClass(row.흰가루병)}"></span></td>
	    </tr>
	    <tr>
	        <td>그을음병</td>
	        <td><span class="circle ${getColorClass(row.그을음병)}"></span></td>
	        <td>잎검은점병</td>
	        <td><span class="circle ${getColorClass(row.잎검은점병)}"></span></td>
	        <td>흰날개무늬병</td>
	        <td><span class="circle ${getColorClass(row.흰날개무늬병)}"></span></td>
	    </tr>
	    <tr>
	        <td>근두암종병</td>
	        <td><span class="circle ${getColorClass(row.근두암종병)}"></span></td>
	        <td>잿빛곰팡이병</td>
	        <td><span class="circle ${getColorClass(row.잿빛곰팡이병)}"></span></td>
	        <td>흰별무늬병</td>
	        <td><span class="circle ${getColorClass(row.흰별무늬병)}"></span></td>
	    </tr>
	    <tr>
	    	<td rowspan="9">해충 피해</td>
	        <td>가루깍지벌레</td>
	        <td><span class="circle ${getColorClass(row.가루깍지벌레)}"></span></td>
	        <td>박쥐나방</td>
	        <td><span class="circle ${getColorClass(row.박쥐나방)}"></span></td>
	        <td>복숭아심식나방</td>
	        <td><span class="circle ${getColorClass(row.복숭아심식나방)}"></span></td>
	    </tr>
	    <tr>
	        <td>갈색매미충</td>
	        <td><span class="circle ${getColorClass(row.갈색매미충)}"></span></td>
	        <td>배나무둥글밑진딧물</td>
	        <td><span class="circle ${getColorClass(row.배나무둥글밑진딧물)}"></span></td>
	        <td>사과알락나방</td>
	        <td><span class="circle ${getColorClass(row.사과알락나방)}"></span></td>
	    </tr>
	    <tr>
	        <td>꼬마배나무이</td>
	        <td><span class="circle ${getColorClass(row.꼬마배나무이)}"></span></td>
	        <td>배나무면충</td>
	        <td><span class="circle ${getColorClass(row.배나무면충)}"></span></td>
	        <td>에모무늬잎말이나방</td>
	        <td><span class="circle ${getColorClass(row.에모무늬잎말이나방)}"></span></td>
	    </tr>
	    <tr>
	        <td>노랑쐐기나방</td>
	        <td><span class="circle ${getColorClass(row.노랑쐐기나방)}"></span></td>
	        <td>배나무방패벌레</td>
	        <td><span class="circle ${getColorClass(row.배나무방패벌레)}"></span></td>
	        <td>조팝나무진딧물</td>
	        <td><span class="circle ${getColorClass(row.조팝나무진딧물)}"></span></td>
	    </tr>
	    <tr>
	        <td>담배거세미나방</td>
	        <td><span class="circle ${getColorClass(row.담배거세미나방)}"></span></td>
	        <td>배나무벌</td>
	        <td><span class="circle ${getColorClass(row.배나무벌)}"></span></td>
	        <td>차응애</td>
	        <td><span class="circle ${getColorClass(row.차응애)}"></span></td>
	    </tr>
	    <tr>
	        <td>말매미</td>
	        <td><span class="circle ${getColorClass(row.말매미)}"></span></td>
	        <td>배나무벌</td>
	        <td><span class="circle ${getColorClass(row.배나무벌)}"></span></td>
	        <td>콩가루벌레</td>
	        <td><span class="circle ${getColorClass(row.콩가루벌레)}"></span></td>
	    </tr>
	    <tr>
	        <td>명주달팽이</td>
	        <td><span class="circle ${getColorClass(row.명주달팽이)}"></span></td>
	        <td>배나무이</td>
	        <td><span class="circle ${getColorClass(row.배나무이)}"></span></td>
	        <td>긴털이리응애</td>
	        <td><span class="circle ${getColorClass(row.긴털이리응애)}"></span></td>
	    </tr>
	    <tr>
	        <td>목화진딧물</td>
	        <td><span class="circle ${getColorClass(row.목화진딧물)}"></span></td>
	        <td>배명나방</td>
	        <td><span class="circle ${getColorClass(row.배명나방)}"></span></td>
	        <td></td>
	        <td></td>
	    </tr>
	    <tr>
	        <td>미국선녀벌레</td>
	        <td><span class="circle ${getColorClass(row.미국선녀벌레)}"></span></td>
	        <td>배혹벌</td>
	        <td><span class="circle ${getColorClass(row.배혹벌)}"></span></td>
	        <td></td>
	        <td></td>
	    </tr>
        `;
    });
}

function populateCompanyTable(data) {
    const table = document.getElementById("companyTable");
    table.innerHTML = `
        <tr>
            <th>업체명</th>
            <th>연락처</th>
            <th>업무명</th>
            <th>주소</th>
		</tr>
    `; // 테이블 내용 초기화
    data.forEach(row => {
        table.innerHTML += `
        <tr>
            <td>${row.CMP_NM}</td>
            <td>${row.CONT}</td>
            <td>${row.BIZ_DIV}</td>
            <td><a href="">상세보기</a></td>
        </tr>
        `;
    });
}

// 페이지가 로드될 때 병해충 데이터를 초기화
window.onload = function() {
    fetchPestData();
};