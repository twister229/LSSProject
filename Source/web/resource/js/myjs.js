/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function addCompare(id, name) {
    if (checkExistedCompareLap(id)) {
        return;
    }
    var tbody = document.getElementById("compareTable").getElementsByTagName("tbody")[0];
    var rowCount = tbody.rows.length;
    if (rowCount < 3) {
        var row = tbody.insertRow(rowCount);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        cell1.innerHTML = "<input type='hidden' name='lapCompare' value='" + id + "'/><td>" + name + "</td>";
        cell2.innerHTML = "<button onclick='removeCompRow(this)'>X</button>";
    }
    document.getElementById("div_sidebar_table").style.display = "block";
    document.getElementById("sidebar_button").style.display = "block";
}

function removeCompRow(btn) {
    var row = btn.parentNode.parentNode;
    var tbody = row.parentNode;
    tbody.removeChild(row);
    var rowCount = tbody.rows.length;
    if (rowCount == 0) {
        document.getElementById("div_sidebar_table").style.display = "none";
        document.getElementById("sidebar_button").style.display = "none";
    }
}

function checkExistedCompareLap(id) {
    var listLap = document.getElementsByName("lapCompare");
    for (var i = 0; i < listLap.length; i++) {
        if (listLap[i].value == id) {
            return true;
        }
    }
    return false;
}

function compareLap() {
    var tbody = document.getElementById("compareTable").getElementsByTagName("tbody")[0];
    var rowCount = tbody.rows.length;
    if (rowCount > 1) {
        return true;
    }
    return false;
}