/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var cart = [];

function loadCart() {
    if (sessionStorage.getItem("cart") != null) {
        var tmp = sessionStorage.getItem("cart");
        cart = JSON.parse(tmp);
        initCart();
    }
}

function initCart() {
    var tmp;
    if (cart.length > 0) {
        var tbody = document.getElementById("compareTable").getElementsByTagName("tbody")[0];
        while (tbody.hasChildNodes()) {
            tbody.removeChild(tbody.lastChild);
        }
        for (var i = 0; i < cart.length; i++) {
            tmp = cart[i];
            var row = tbody.insertRow(i);
            var cell1 = row.insertCell(0);
            var cell2 = row.insertCell(1);
            cell1.innerHTML = "<input type='hidden' name='lapCompare' value='" + tmp.id + "'/><td>" + tmp.name + "</td>";
            cell2.innerHTML = "<button onclick='removeCompRow(" + tmp.id + ")'>X</button>";
        }
        document.getElementById("div_sidebar_table").style.display = "block";
        document.getElementById("sidebar_button").style.display = "block";
    } else {
        document.getElementById("div_sidebar_table").style.display = "none";
        document.getElementById("sidebar_button").style.display = "none";
    }
}

function addCompare(id, name) {
    if (checkExistedCompareLap(id)) {
        return;
    }
    if (cart.length >= 3) {
        alert("Chỉ so sánh tối đa 3 sản phẩm!");
        return;
    }
    var obj = {id: id, name: name};
    cart[cart.length] = obj;
    sessionStorage.setItem("cart", JSON.stringify(cart));
    initCart();
}

function removeCompRow(id) {
    var tmp;
    if (cart.length > 0) {
        for (var i = 0; i < cart.length; i++) {
            tmp = cart[i];
            if (tmp.id == id) {
                cart.splice(i, 1);
            }
        }
    }
    sessionStorage.setItem("cart", JSON.stringify(cart));
    initCart();
}

//function addCompare(id, name) {
//    if (checkExistedCompareLap(id)) {
//        return;
//    }
//    var tbody = document.getElementById("compareTable").getElementsByTagName("tbody")[0];
//    var rowCount = tbody.rows.length;
//    if (rowCount < 3) {
//        var row = tbody.insertRow(rowCount);
//        var cell1 = row.insertCell(0);
//        var cell2 = row.insertCell(1);
//        cell1.innerHTML = "<input type='hidden' name='lapCompare' value='" + id + "'/><td>" + name + "</td>";
//        cell2.innerHTML = "<button onclick='removeCompRow(this)'>X</button>";
//    }
//    document.getElementById("div_sidebar_table").style.display = "block";
//    document.getElementById("sidebar_button").style.display = "block";
//}

//function removeCompRow(btn) {
//    var row = btn.parentNode.parentNode;
//    var tbody = row.parentNode;
//    tbody.removeChild(row);
//    var rowCount = tbody.rows.length;
//    if (rowCount == 0) {
//        document.getElementById("div_sidebar_table").style.display = "none";
//        document.getElementById("sidebar_button").style.display = "none";
//    }
//}

function checkExistedCompareLap(id) {
    var tmp;
    if (cart.length > 0) {
        for (var i = 0; i < cart.length; i++) {
            tmp = cart[i];
            if (tmp.id == id) {
                return true;
            }
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
    alert("So sánh từ 2 đến 3 sản phẩm!");
    return false;
}