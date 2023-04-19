/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

function modifyOrDeleteProducto(action) {

    var checkbox = document.querySelector('input[name="selectedCheckbox"]:checked');

    if (checkbox) {

        var codigoNacional = checkbox.value;

        switch (action) {
            case 'modify':
                window.location.href = '/modifyProducto/' + codigoNacional;
                break;
            case 'delete':
                if (confirm("¿Estás seguro de que quieres eliminar este registro?")) {
                    window.location.href = '/deleteProducto/' + codigoNacional;
                }
                break;
        }
    } else {

        alert('Por favor, seleccione un registro.');
    }
}

function seleccionarUnicoCheckbox(currentCheckbox) {

    var checkboxes = document.getElementsByName('selectedCheckbox');

    for (var i = 0; i < checkboxes.length; i++) {

        if (checkboxes[i] !== currentCheckbox) {

            checkboxes[i].checked = false;
        }
    }
}

function seleccionarUnicoCheckboxCliente(currentCheckbox) {

    var checkboxes = document.getElementsByName('selectedCliente');

    for (var i = 0; i < checkboxes.length; i++) {

        if (checkboxes[i] !== currentCheckbox) {

            checkboxes[i].checked = false;
        }
    }
}

function buscar() {

    var valorBuscado = document.getElementById("cuadro-busqueda").value.toLowerCase();
    var tablaProductos = document.getElementById("tabla-productos");
    var filas = tablaProductos.getElementsByTagName("tr");

    for (var i = 1; i < filas.length; i++) {

        var celdas = filas[i].getElementsByTagName("td");
        var filaVisible = false;

        for (var j = 0; j < celdas.length; j++) {

            var contenidoCelda = celdas[j].textContent.toLowerCase();

            if (contenidoCelda.indexOf(valorBuscado) > -1) {

                filaVisible = true;
                break;
            }
        }

        if (filaVisible) {

            filas[i].style.display = "";

        } else {

            filas[i].style.display = "none";
        }
    }
}

function buscarCliente() {
    var valorBuscado = document.getElementById("cuadro-busqueda").value.toLowerCase();
    var tablaClientes = document.getElementById("tabla-clientes");
    var filas = tablaClientes.getElementsByTagName("tr");
    for (var i = 1; i < filas.length; i++) {
        var celdas = filas[i].getElementsByTagName("td");
        var filaVisible = false;
        for (var j = 0; j < celdas.length; j++) {
            var contenidoCelda = celdas[j].textContent.toLowerCase();
            if (contenidoCelda.indexOf(valorBuscado) > -1) {
                filaVisible = true;
                break;
            }
        }
        if (filaVisible) {
            filas[i].style.display = "";
        } else {
            filas[i].style.display = "none";
        }
    }
}

function modifyOrDeleteCliente(action) {

    var checkbox = document.querySelector('input[name="selectedCliente"]:checked');

    if (checkbox) {

        var id_cliente = checkbox.value;

        switch (action) {
            case 'modify':
                window.location.href = '/modifyCliente/' + id_cliente;
                break;
            case 'delete':
                if (confirm("¿Estás seguro de que quieres eliminar este cliente?")) {
                    window.location.href = '/deleteCliente/' + id_cliente;
                }
                break;
        }
    } else {

        alert('Por favor, seleccione un cliente.');
    }

    //Ventas

    function buscarVenta() {
        var valorBuscado = document.getElementById("cuadro-busqueda").value.toLowerCase();
        var tablaClientes = document.getElementById("tabla-ventas");
        var filas = tablaClientes.getElementsByTagName("tr");
        for (var i = 1; i < filas.length; i++) {
            var celdas = filas[i].getElementsByTagName("td");
            var filaVisible = false;
            for (var j = 0; j < celdas.length; j++) {
                var contenidoCelda = celdas[j].textContent.toLowerCase();
                if (contenidoCelda.indexOf(valorBuscado) > -1) {
                    filaVisible = true;
                    break;
                }
            }
            if (filaVisible) {
                filas[i].style.display = "";
            } else {
                filas[i].style.display = "none";
            }
        }
    }

    function seleccionarUnicoCheckboxVenta(currentCheckbox) {

        var checkboxes = document.getElementsByName('selectedVenta');

        for (var i = 0; i < checkboxes.length; i++) {

            if (checkboxes[i] !== currentCheckbox) {

                checkboxes[i].checked = false;
            }
        }
    }

    function modifyOrDeleteVenta(action) {

        var checkbox = document.querySelector('input[name="selectedVenta"]:checked');

        if (checkbox) {

            var id_venta = checkbox.value;

            switch (action) {
                case 'modify':
                    window.location.href = '/modifyVenta/' + id_venta;
                    break;
                case 'delete':
                    if (confirm("¿Estás seguro de que quieres eliminar esta venta?")) {
                        window.location.href = '/deleteVenta/' + id_venta;
                    }
                    break;
            }
        } else {

            alert('Por favor, seleccione una venta.');
        }

    }


}


