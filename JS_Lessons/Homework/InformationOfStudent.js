let postButton = document.getElementById('button');

let form = document.getElementById("form");
form.addEventListener('submit', (event) => {
    event.preventDefault();
});

let ageSum = 0;
let counter = 0;

postButton.onclick = function () {
    let warning = document.getElementById("warning");
    let birthDate = document.getElementById("birthday").value;
    if (new Date(birthDate).getTime() > new Date().getTime()) {
        warning.innerHTML = "Некорректная дата рождения";
        document.body.prepend(div);
    } else {
        let name = document.getElementById("name").value;
        let gender = document.getElementById("gender").value;
        let age = parseInt((new Date().getTime() - new Date(birthDate).getTime())/1000/60/60/24/365);

        createRow(name, gender, birthDate, age);

        counter += 1;
        ageSum += age;

        setAverageAge();
        document.body.prepend(div);
        div.innerHTML = "Добавлено";
    }
}


function createRow(name, gender, birthDate, age) {
    let tbody = document.getElementById("tbody");
    let firstChild = tbody.firstChild;

    let row = document.createElement("tr");
    let row_data_1 = document.createElement("td");
    row_data_1.innerHTML = name;
    let row_data_2 = document.createElement("td");
    row_data_2.innerHTML = gender;
    let row_data_3 = document.createElement("td");
    row_data_3.innerHTML = birthDate;
    let row_data_4 = document.createElement("td");
    row_data_4.innerHTML = age;

    row.appendChild(row_data_1);
    row.appendChild(row_data_2);
    row.appendChild(row_data_3);
    row.appendChild(row_data_4);

    tbody.insertBefore(row, firstChild);
}

function setAverageAge() {
    averageAge = ageSum / counter;
    document.getElementById("averageAge").textContent = averageAge;
}