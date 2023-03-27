/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

function modifyOrDeleteProducto(action) {

    var checkbox = document.querySelector('input[name="selectedProducto"]:checked');

    if (checkbox) {

        var codigoNacional = checkbox.value;

        switch (action) {
            case 'modify':
                window.location.href = '/modify/' + codigoNacional;
                break;
            case 'delete':
                window.location.href = '/delete/' + codigoNacional;
                break;
        }
    } else {

        alert('Por favor, seleccione un producto.');
    }
}

function seleccionarUnicoCheckbox(currentCheckbox) {

    var checkboxes = document.getElementsByName('selectedProducto');

    for (var i = 0; i < checkboxes.length; i++) {

        if (checkboxes[i] !== currentCheckbox) {

            checkboxes[i].checked = false;
        }
    }
}